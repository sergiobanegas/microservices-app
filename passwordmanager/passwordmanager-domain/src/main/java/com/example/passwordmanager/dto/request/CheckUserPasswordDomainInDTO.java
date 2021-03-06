package com.example.passwordmanager.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckUserPasswordDomainInDTO {

    private String userId;

    private String password;

}
