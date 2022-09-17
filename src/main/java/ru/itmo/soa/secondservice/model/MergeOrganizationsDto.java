package ru.itmo.soa.secondservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class MergeOrganizationsDto {

    @Schema(description = "Новое название организации")
    private String newName;

    @Schema(description = "Новый адрес организации")
    private AddressDto newAddress;

}
