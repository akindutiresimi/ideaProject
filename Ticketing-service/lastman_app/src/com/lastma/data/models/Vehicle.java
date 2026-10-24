package com.lastma.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Year;

@Data
@Document
public class Vehicle {
    @Id
    private String id;
    private String make;
    private String model;
    private Year year;
    private VehicleType Type;
    private int driverId;
    private String plateNumber;
}
