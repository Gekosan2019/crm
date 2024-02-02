package ru.shundalov.crm.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table
public class GuestRegistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId;

    @Column
    private LocalDateTime dateArrival;

    @Column
    private LocalDateTime dateDeparture;

    @ManyToOne
    @JoinColumn(name = "empl_id", nullable = false)
    private Employees employees;

    @ManyToOne
    @JoinColumn(name = "guest_id", nullable = false)
    private Guests guests;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Rooms rooms;

}