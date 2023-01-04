package com.batch.springbatch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Empoloyee_Info")
public class Employee {
    @Id
    private int id;
    private String gender;
    private String birthDate;
    private String jobCat;
    private String salary;
    private int jobTime;
    private int prevExp;
    private int minority;
}
