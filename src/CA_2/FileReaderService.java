package CA_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderService {

    public Employee[] readFile() throws IOException {

        InputStream inputStream = Main.class.getResourceAsStream("/Applicants_Form.txt");

        if (inputStream == null) {
            throw new IOException("File not found out: Applicants_Form.txt");
        }

        BufferedReader buffRead = new BufferedReader(new InputStreamReader(inputStream));

        String line = "";

        int countLines = 0;
        while ((buffRead.readLine()) != null) {
            countLines++;
        }

        buffRead.close();

        Employee[] employeeList = new Employee[countLines];

        buffRead = new BufferedReader(new FileReader("src/CA_2/Applicants_Form.txt"));

        for (int i = 0; i < countLines; i++) {
            line = buffRead.readLine();
            if (line != null) {
                String[] parts = line.split(",");

                if (parts.length >= 3) {
                    String name = parts[0].replace("\"", "").trim();
                    String role = parts[1].trim();
                    String manager = parts[2].trim();
                    String department = parts[3].trim();

                    employeeList[i] = new Employee();
                    employeeList[i].setName(name);
                    employeeList[i].setManager(manager);
                    employeeList[i].setRole(role);
                    employeeList[i].setDepartment(department);
                }
            }
        }

        buffRead.close();

        return employeeList;

    }
}
