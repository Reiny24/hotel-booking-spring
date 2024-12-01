package io.github.denkoch.hotel_booking_spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class ServiceDTO {

    @NotBlank
    private String serviceName;

    @PositiveOrZero
    private Long serviceCost;
}
