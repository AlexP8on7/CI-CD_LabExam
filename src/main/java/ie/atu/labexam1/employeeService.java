package ie.atu.labexam1;

import jakarta.validation.constraints.Pattern;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class employeeService {
    private List<Employee> mylist = new ArrayList<>();

    public List<Employee> addEmployee(Employee employee) {

        mylist.add(employee);
        return mylist;
    }

    public List<Employee> getEmployee() {
        return mylist;
    }

    public List<Employee> putEmployee(Employee employee, String employeeCode) {
        for (int i = 0; i < mylist.size(); i++) {
            if(mylist.get(i).getEmployeeCode() == employeeCode){
                mylist.set(i,employee);
            }

        }
        return mylist;
    }
    public List<Employee> deleteEmployee(Employee employee, String employeeCode) {
        for (int i = 0; i < mylist.size(); i++) {
            if(mylist.get(i).getEmployeeCode() == employeeCode){
                mylist.remove(i);
            }

        }
        return mylist;

}

