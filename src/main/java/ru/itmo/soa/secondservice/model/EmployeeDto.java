package ru.itmo.soa.secondservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Map;

@Data
public class EmployeeDto {

    @Schema(description = "ИД сотрудника")
    private Long id;

    @Schema(description = "Имя сотрудника")
    private String name;

    @Schema(description = "Дополнительные данные сотрудника")
    private Map<String, String> attributes;

}
