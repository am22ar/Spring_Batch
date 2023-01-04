package com.batch.springbatch.repository;

import com.batch.springbatch.model.Employee;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>, JobRepository {
}
