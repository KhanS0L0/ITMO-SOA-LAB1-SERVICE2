package ru.itmo.soa.secondservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrganizationDto {

    @Schema(description = "Уникальный идентификатор организации")
    private Long id;

    @Schema(description = "Наименование организации")
    private String description;

    @Schema(description = "Координаты организации")
    private CoordinatesDto coordinatesDto;

    @Schema(description = "Дата создания организации")
    private LocalDateTime creationDate;

    @Schema(description = "Ежегодный оборот организации")
    private Double annualTurnover;

    @Schema(description = "Тип организации")
    private OrganizationTypeDto type;

    @Schema(description = "Официальный адрес организации")
    private AddressDto officialAddressDto;

}
