package com.example.mongodb_sales.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
    @NotBlank(message="First name is required")
    private String firstName;
    @NotBlank(message="Last name is required")
    private String lastName;
    @Pattern(regexp = "^[0-9]+$", message = "Phone number should contain only digits")
    private long phoneNumber;
    @NotBlank(message="State is required")
    private String state;
    @Pattern(regexp = "^[0-9]+$", message = "Pincode should contain only digits")
    private int pincode;
    @NotBlank(message="Address is required")
    private String address;
    @NotBlank(message="Gender is required")
    private String gender;
    @Pattern(regexp = "^[0-9]+$", message = "Bank Account Number should contain only digits")
    private long bankAccNo;
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Birth Date should be in the format YYYY-MM-DD")
    private String dob;
    @NotBlank(message="Email is required")
    private String email;
    @NotBlank(message="City is required")
    private String city;

}
