package com.hackeralgo.dto;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class UserDTO {
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String emailId;

    @NotNull(message = "Mobile number is required")
    @Min(value = 1000000000L, message = "Invalid mobile number")
    @Max(value = 9999999999L, message = "Invalid mobile number")
    private Long mobileNum;

    @NotBlank(message = "First name is required")
    private String firstNm;

    private String lastNm;
    private String profileDetails;
    private String country;
}
