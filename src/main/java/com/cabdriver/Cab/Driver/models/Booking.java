package com.cabdriver.Cab.Driver.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @ManyToOne
    Customer customer;
    int billAmount;
    String status;
    String feedback;
    @ManyToOne
    Driver driver;
    private String startingLocation;
    private String endingLocation;
}
