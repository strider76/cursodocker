package com.aktios.pruebadocker.controller;

import com.aktios.pruebadocker.mapper.EmployeesMapper;
import com.aktios.pruebadocker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    EmployeesMapper employeesMapper;

    @GetMapping("/list")
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employeesMapper.getListEmployees(employeeService.getAll()));
        return "index";
    }

}
