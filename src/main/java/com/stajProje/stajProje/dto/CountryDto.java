package com.stajProje.stajProje.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class CountryDto {

    private UUID id;

    
    private String name;
}
