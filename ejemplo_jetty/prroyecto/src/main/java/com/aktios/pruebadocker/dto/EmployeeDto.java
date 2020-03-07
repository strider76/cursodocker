package com.aktios.pruebadocker.dto;

import lombok.Data;

@Data
public class EmployeeDto {

    private  String firstName;
    private String lastName;
    private Enum gender;

}
