package com.cabdriver.Cab.Driver.requestbody;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserCredentialsRequestBody {
    private String email;
    private String password;
}
