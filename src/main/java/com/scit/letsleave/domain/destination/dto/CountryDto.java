package com.scit.letsleave.domain.destination.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.scit.letsleave.domain.destination.entity.CountryEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CountryDto {

    private Integer id;
    private String krName;
    private String engName;
    private String iso3;
    private String iso2;
    private String continent;
    private String continentCode;
    private String currencyCode;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private List<CityDto> cities;

    public static CountryDto toDto(CountryEntity entity) {
        return CountryDto.builder()
            .id(entity.getId())
            .krName(entity.getKrName())
            .engName(entity.getEngName())
            .iso3(entity.getIso3())
            .iso2(entity.getIso2())
            .continent(entity.getContinent())
            .continentCode(entity.getContinentCode())
            .currencyCode(entity.getCurrencyCode())
            .createdAt(entity.getCreatedAt())
            .updatedAt(entity.getUpdatedAt())
            .cities(entity.getCities().stream().map(CityDto::toDto).collect(Collectors.toList()))
            .build();
    }
}

