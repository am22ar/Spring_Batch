package com.batch.springbatch.config;

import com.batch.springbatch.model.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeProcessor implements ItemProcessor<Employee,Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        return employee;
    }
}
