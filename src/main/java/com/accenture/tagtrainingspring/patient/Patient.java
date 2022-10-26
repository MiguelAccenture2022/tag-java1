package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

import com.accenture.tagtrainingspring.gender.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Patient {
    String name ;
    int id ;
    LocalDate dob ;
    Gender gender;
   
}
