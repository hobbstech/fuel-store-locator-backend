package io.github.hobbstech.fuel_station_locator_backend;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuelLevelUpdateRestController {

    private final FuelUpdaterService fuelUpdaterService;

    public FuelLevelUpdateRestController(FuelUpdaterService fuelUpdaterService) {
        this.fuelUpdaterService = fuelUpdaterService;
    }

    @PostMapping("/v1/fuel-level")
    public void updateFuel(@RequestBody UpdateFuelDto updateFuelDto){
        fuelUpdaterService.updateFuelStatus(updateFuelDto);
    }

}
