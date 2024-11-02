package CA_2;

import java.sql.SQLOutput;
import java.util.Random;

public class RandomEmployeeGenerator {

        String[] names = {
                "Finn O'Neill", "Caitlin Doyle", "Ronan Brady", "Clodagh McCarthy",
                "Orla O'Shea", "Epom Fitzgerald", "Maeve Gallagher", "Seamus Flanagan",
                "Brigid Molloy", "Padraig Larkin", "Saoirse Devlin", "Ciaran Flynn"
        };

        String[] roles = {
                "Main Manager", "Assistant Manager", "Team Leader"
        };

        String[] departments = {
                "Customer Service", "Technical Support", "Human Resources",
                "Sales", "Marketing", "Development"
        };


    public void generateEmployee() {

        Random random = new Random();

        String name = names[random.nextInt(names.length)];
        String role = roles[random.nextInt(roles.length)];
        String department = departments[random.nextInt(departments.length)];

        System.out.println(" ");
        System.out.println("Employee: " + name + "\n" +
                "Role: " + role + "\n" +
                "Department: " + department + " department.");
    }

    public static void main(String[] args) {

        RandomEmployeeGenerator reg = new RandomEmployeeGenerator();

        System.out.println(" ");
        System.out.println("\t\t\t\t Employee Info");
        System.out.println(" ");
        System.out.println("Here is the list of randomly generated employees:");

        int counter = 1;
        while (counter <= 3) {
            reg.generateEmployee();
            counter++;
        }
    }
}