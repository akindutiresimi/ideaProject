package com.lastma.dtos.responses;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class RegisterDriverResponse {
    private String fullName;
    @Id
    private String id;
}
