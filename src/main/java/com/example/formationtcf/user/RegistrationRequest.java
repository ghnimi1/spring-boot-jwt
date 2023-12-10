package com.example.formationtcf.user;

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
    private String password;
}
