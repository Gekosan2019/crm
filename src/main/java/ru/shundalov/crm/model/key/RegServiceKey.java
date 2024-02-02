package ru.shundalov.crm.model.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class RegServiceKey implements Serializable {
    @Column
    private Long regId;

    @Column
    private Long servId;
}