package ru.shundalov.crm.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@Table(name = "guests")
@AllArgsConstructor
@NoArgsConstructor
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long guestId;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private Long age;
}