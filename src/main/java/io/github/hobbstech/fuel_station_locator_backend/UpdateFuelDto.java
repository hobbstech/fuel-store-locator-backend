package io.github.hobbstech.fuel_station_locator_backend;

import lombok.Data;

@Data
public class UpdateFuelDto {

    private String id;

    private String petrolLevel;

    private String dieselLevel;

}
