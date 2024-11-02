package CA_2;

import java.io.IOException;

public class EmployeeService {

    private FileReaderService fileReaderService;
    private SortedService sortedService;
    private SearchService searchService;

    public  EmployeeService() {
        fileReaderService = new FileReaderService();
        sortedService = new SortedService();
        searchService = new SearchService();
    }

    public Employee[] loadEmployees() throws IOException {
        return fileReaderService.readFile();
    }

    public void sortEmployees(Employee[] employees) {
        sortedService.selectionSortEmployee(employees);
    }

    public Employee searchEmployees(Employee[] employees, String name) {
        return  searchService.binarySearchEmployee(employees, name);
    }
}