package ru.shundalov.crm.model;

import jakarta.persistence.*;
import lombok.Data;
import ru.shundalov.crm.model.key.RegServiceKey;

import java.sql.Time;

@Entity
@Data
@Table
public class RegistrationService {
    @EmbeddedId
    private RegServiceKey regServiceKey;

    @Temporal(TemporalType.TIME)
    @Column
    private Time dateService;

    @ManyToOne
    @MapsId("regId")
    @JoinColumn(name = "reg_id", nullable = false)
    private GuestRegistration guestRegistration;

    @ManyToOne
    @MapsId("servId")
    @JoinColumn(name = "serv_id", nullable = false)
    private Service service;
}