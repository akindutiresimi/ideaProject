package com.lastma.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
public class Offence {
    private String code;
    private String description;
    @Id
    private int id;
    private String password;
    private int penaltyPoint;
    private int firstOffenceFine;
    private ViolationType violationType;
    private int subsequentOffence;
    private String additionalPenaltyPoint;
    private boolean active;
}
