package com.HWproject.HWproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name ="Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "Brand",nullable = false)
    private String brand;
    @Column (name = "Model",nullable = false)
    private String model;
    @NotNull
    @Column (name = "Production_Year",nullable = false)
    private int year;

}
