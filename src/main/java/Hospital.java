import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
    private HashMap<Integer, Employee> employeeList = new HashMap<>();

    public HashMap<Integer, Employee> getEmployeeList(){
        return employeeList;
    }

    public void addEmployeeToList(Employee testEmployee){
        employeeList.put(testEmployee.getIDNumber(), testEmployee);
    }

    public int size() {
       return employeeList.size();
    }

    public void payEmployees(){
        for (Employee employeeToBePaid : employeeList.values()){
            employeeToBePaid.receivePay();
        }
        System.out.println("High Street Hospital staff have worked hard. Now it's payday!");
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "employeeList=" + employeeList +
                '}';
    }
}

