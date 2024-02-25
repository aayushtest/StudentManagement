package com.aayush.studentmanagement.dto;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class StudentDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate dob;
    private String email;
    private Long phone;
    private String address;
    private LocalDateTime creationDate; // account creation date

}
