package CA_2;

public class SearchService {

    // Binary Search by Employee's name
    public Employee binarySearchEmployee(Employee[] employeeList, String name) {

        if (employeeList == null || employeeList.length == 0) {
            System.out.println("Employee list is empty or null.");
            return null;
        }

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Employee name can't be empty or null.");
            return null;
        }

        int low = 0;
        int high = employeeList.length - 1;

        System.out.println("Searching for: " + name);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (employeeList[mid].getName().equals(name)) {
                return employeeList[mid];
            }

            if (employeeList[mid].getName().trim().equals(name.trim())) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
        // Return null if doesn't find the employee.

    }


    // Binary Search by Employee's role
    public Employee binarySearchRole(Employee[] employeeList, String role) {

        if (employeeList == null || employeeList.length == 0) {
            System.out.println("Employee list is empty or null.");
            return null;
        }

        if (role == null || role.trim().isEmpty()) {
            System.out.println("Employee name can't be empty or null.");
            return null;
        }

        int low = 0;
        int high = employeeList.length - 1;

        System.out.println("Searching for: " + role);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int comparison = employeeList[mid].getRole().compareTo(role);

            if (comparison == 0) {
                return employeeList[mid];
            }

            if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }

        return null;
        // Return null if doesn't find the employee.

    }


    // Binary Search by Employee's department
    public Employee binarySearchDepartment(Employee[] employeeList, String department) {

        if (employeeList == null || employeeList.length == 0) {
            System.out.println("Employee list is empty or null.");
            return null;
        }

        if (department == null || department.trim().isEmpty()) {
            System.out.println("Employee name can't be empty or null.");
            return null;
        }

        int low = 0;
        int high = employeeList.length - 1;

        System.out.println("Searching for: " + department);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int comparison = employeeList[mid].getDepartment().compareTo(department);

            if (comparison == 0) {
                return employeeList[mid];
            }

            if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }

        return null;
        // Return null if doesn't find the employee.

    }
}