package ru.shundalov.crm.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Builder
@Table
@AllArgsConstructor
@NoArgsConstructor
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emplId;

    @Column
    private String name;

    @Column
    private String surname;

    @ManyToOne
    @JoinColumn(name = "position_id", nullable = false)
    private EmplPositions emplPositions;
}