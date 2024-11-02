package CA_2;

public class Employee {

        private String name;
        private String manager;
        private String role;
        private String department;

    public Employee() {
    }

    public Employee(String name, String manager, String role, String department) {
        this.name = name;
        this.manager = manager;
        this.role = role;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
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

    // Adding validation later
    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // Adding validation later
    public void setDepartment(String department) {
        this.department = department;
    }
}