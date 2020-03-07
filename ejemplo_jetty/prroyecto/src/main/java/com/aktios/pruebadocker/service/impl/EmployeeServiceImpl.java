package com.aktios.pruebadocker.service.impl;

import com.aktios.pruebadocker.dao.EmployeesRepository;
import com.aktios.pruebadocker.model.Employees;
import com.aktios.pruebadocker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeesRepository employeesRepository;

    @Override
    public List<Employees> getAll() {
        return employeesRepository.findAll();
    }
}
