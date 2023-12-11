package com.example.formationtcf.dto;

import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
public class AuthenticationResponse {
    private final String jwt;
}
