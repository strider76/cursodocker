package com.aktios.pruebadocker.mapper;

import com.aktios.pruebadocker.dto.EmployeeDto;
import com.aktios.pruebadocker.model.Employees;

import java.util.List;


public interface EmployeesMapper {

    EmployeeDto getEmployee(Employees employee);

    List<EmployeeDto> getListEmployees(List<Employees> employees);
}
