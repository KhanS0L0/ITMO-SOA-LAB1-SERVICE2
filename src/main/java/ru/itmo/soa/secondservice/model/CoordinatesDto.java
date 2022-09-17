package ru.itmo.soa.secondservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class CoordinatesDto {

    @Schema(description = "Координата Х")
    private Long x;

    @Schema(description = "Координата У")
    private Float y;

}
