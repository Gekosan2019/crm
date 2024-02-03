package ru.shundalov.crm.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @Column
    private Long number;

    @Column
    private Long price;

    @Column
    private String status;

    @Column
    private Long size;

    @Column
    private Long peopleNow;
}