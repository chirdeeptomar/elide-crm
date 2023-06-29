package com.empyrean.elide.crm.models;

import com.yahoo.elide.annotation.Include;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Include(rootLevel = true, name = "customers")
@Table(name = "customers")
@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name = null;

    private String email = null;

    private String phone = null;

    private LocalDate dob = null;

}
