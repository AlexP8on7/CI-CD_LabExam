package ie.atu.labexam1;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private employeeService myEmployee;

    public EmployeeController(employeeService myEmployee) {
        this.myEmployee = myEmployee;
    }

    @PostMapping("/newEmployee")
    public List<Employee> newEmployee(@RequestBody @Valid Employee employee) {
        return myEmployee.addEmployee(employee);
    }

    @GetMapping("/getEmployee")
    public List<Employee> allEmployee() {
        return myEmployee.getEmployee();
    }

    @PutMapping("/updateEmployee/{employeeCode}")
    public List<Employee> updateEmployee(@RequestBody @Valid Employee employee, @PathVariable String employeeCode) {
        return myEmployee.putEmployee(employee, employeeCode);

    }
    @DeleteMapping("/deleteEmployee/{employeeCode]")
    public List<Employee> deleteEmployee( @PathVariable String employeeCode){
        return myEmployee.deleteEmployee(employeeCode);

    }

}