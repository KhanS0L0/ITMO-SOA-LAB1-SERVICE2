package ru.itmo.soa.secondservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
public class FilteredRequestDto extends PageableRequestDto {

    @Schema(description = "Наименование организации")
    private String name;

    @Schema(description = "Координаты организации")
    private CoordinatesDto x;

    @Schema(description = "Дата создания организации")
    private LocalDateTime creationDate;

    @Schema(description = "Ежегодный оборот организации")
    private Double annualTurnover;

    @Schema(description = "Тип организации")
    private OrganizationTypeDto type;

    @Schema(description = "Адрес организации (улица)")
    private String street;

}
