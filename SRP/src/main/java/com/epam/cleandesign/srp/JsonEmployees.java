package com.epam.cleandesign.srp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class JsonEmployees implements EmpoyeesConverter {
    private List<Employee> employees;

    public JsonEmployees(EmployeesReader employeesReader) {
        this.employees = employeesReader.cache;
    }

    @Override
    public String convert() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(employees);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
