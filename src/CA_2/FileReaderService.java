package CA_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderService {

    public Person[] readFile() throws IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader("src/CA_2/Applicants_Form.txt"));
        String line = "";

        int countLines = 0;
        while ((buffRead.readLine()) != null) {
            countLines++;

        }

        buffRead.close();

        buffRead = new BufferedReader(new FileReader("src/CA_2/Applicants_Form.txt"));
        Person[] personList = new Person[countLines];

        for (int i = 0; i < countLines; i++) {
            line = buffRead.readLine();
            if(line != null) {
                int lastIndexOfComma = line.lastIndexOf(",");
                personList[i].setName(line.substring(0, lastIndexOfComma).replaceAll("\"","").trim());

            }
        }

        buffRead.close();

        return personList;

    }

}