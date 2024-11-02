package CA_2;

public class Employee {

        private String name;
        private String role;
        private String department;

    public Employee() {
    }

    public Employee(String name, String role, String department) {
        this.name = name;
        this.role = role;
        this.department = department;
    }

    public String getName() {
        return name;
    }


    public String getRole() {
        return role;
    }

    public String getDepartment() {
            return department;
    }

    // Adding validation later
    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Adding validation later
    public void setDepartment(String department) {
        this.department = department;
    }
}