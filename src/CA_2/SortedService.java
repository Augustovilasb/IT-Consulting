package CA_2;

import javax.xml.namespace.QName;

public class SortedService {

    public void orderEmployeeAscendingSelectionSort(Employee[] employeeList) {

        if (employeeList == null || employeeList.length == 0) {
            System.out.println("Employee list is empty or null.");
            return;
        }

        int length = employeeList.length;

        for (int i = 0; i < length - 1; i++) {
            int minPosition = i;

            for (int j = i + 1; j < length; j++) {
                if (employeeList[j].getName().compareTo(employeeList[minPosition].getName()) < 0) {
                    minPosition = j;
                }
            }

            if (minPosition != i) {
                Employee employeeTemp = employeeList[i];
                employeeList[i] = employeeList[minPosition];
                employeeList[minPosition] = employeeTemp;
            }
        }
    }
}
