package com.example.formationtcf.user;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
public class AuthenticationResponse {
    private final String jwt;
}
