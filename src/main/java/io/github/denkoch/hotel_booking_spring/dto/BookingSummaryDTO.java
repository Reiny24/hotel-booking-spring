package io.github.denkoch.hotel_booking_spring.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.sql.Date;

@Data
public class BookingSummaryDTO {

    @NotNull
    private Long bookingId;

    @NotNull
    private RoomIdDTO roomId;

    @NotNull
    private Date checkinDate;

    @FutureOrPresent
    private Date checkoutDate;
}
