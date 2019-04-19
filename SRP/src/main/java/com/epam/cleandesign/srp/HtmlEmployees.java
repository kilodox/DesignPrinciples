package com.epam.cleandesign.srp;

import java.util.List;

public class HtmlEmployees implements EmpoyeesConverter{
    private List<Employee> employees;

    public HtmlEmployees(EmployeesReader employeesReader) {
        this.employees = employeesReader.cache;
    }

    @Override
    public String convert(){
        StringBuilder builder = new StringBuilder();
        builder.append("<table>").append("<tr><th>Employee</th><th>Position</th></tr>");

        for (Employee employee : employees) {
            builder.append("<tr><td>").append(employee.getFirstName()).append(" ").append(employee.getLastName())
                    .append("</td><td>").append(employee.getSeniority()).append(" ").append(employee.getRole())
                    .append("</td></tr>");
        }

        builder.append("</table>");

        return builder.toString();
    }
}