package com.example.formationtcf.user;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AuthenticationRequest {
    private String username;
    private String password;
}
