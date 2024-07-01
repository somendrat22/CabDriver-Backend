package com.cabdriver.Cab.Driver.requestbody;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerBookingRequestBody {
    private String startingLocation;
    private String endingLocation;
}
