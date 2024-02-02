package ru.shundalov.crm.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;

    @Column
    private String name;

    @Column
    private Long price;
}