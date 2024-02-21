package com.example.demo.converter;

import com.example.demo.dto.response.EmployeeResponse;
import com.example.demo.model.Employee;
import lombok.experimental.UtilityClass;

@UtilityClass
public class EmployeeConverter {

    public static EmployeeResponse convertToEmployeeResponse(Employee employee){
        EmployeeResponse employeeResponse=new EmployeeResponse();
        employeeResponse.setName(employee.getName());
        employeeResponse.setSurname(employee.getSurname());
        employeeResponse.setEmail(employee.getEmail());
        return employeeResponse;
    }
}
