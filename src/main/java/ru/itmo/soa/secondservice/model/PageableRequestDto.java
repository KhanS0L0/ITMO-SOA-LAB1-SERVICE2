package ru.itmo.soa.secondservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public abstract class PageableRequestDto {

    @Schema(description = "Максимальное количество отображаемых элементов")
    private Integer limitOfObjects = 20;

    @Schema(description = "Номер странницы")
    private Integer pageNumber = 1;

}
