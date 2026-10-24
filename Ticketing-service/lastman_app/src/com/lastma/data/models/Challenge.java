package com.lastma.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class Challenge {
    @Id
    private int id;
    private String title;
    private String ticketId;
    private String reason;
    private String status;
    private String decisionNotes;
    private int reviewedByOfficerId;
    private LocalDate submittedAt;
    private LocalDate revisedAt;

}
