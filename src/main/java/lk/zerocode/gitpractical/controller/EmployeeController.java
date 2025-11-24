package lk.zerocode.gitpractical.controller;

import lk.zerocode.gitpractical.controller.request.EmployeeAddRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @PostMapping(value = "/employees")
    public EmployeeAddRequest addEmployee(@RequestBody EmployeeAddRequest employeeAddRequest){
        System.out.println("employee added");
        return employeeAddRequest;
    }

}
