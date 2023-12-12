package com.example.formationtcf.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
public class RegistrationRequest {
    private String username;
    private String email;
    private String password;
}
