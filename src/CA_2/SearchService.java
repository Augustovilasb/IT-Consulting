package CA_2;

public class SearchService {

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

    }
}