package com.aktios.pruebadocker.mapper.impl;

import com.aktios.pruebadocker.dto.EmployeeDto;
import com.aktios.pruebadocker.mapper.EmployeesMapper;
import com.aktios.pruebadocker.model.Employees;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeMapperImpl implements EmployeesMapper {

    @Override
    public EmployeeDto getEmployee(Employees employee) {

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setFirstName(employee.getFirstName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setGender(employee.getGender());

        return employeeDto;
    }

    @Override
    public List<EmployeeDto> getListEmployees(List<Employees> employees) {
        return employees.stream()
                .map(employees1 -> getEmployee(employees1))
                .collect(Collectors.toList());
    }
}
