package io.github.hobbstech.fuel_station_locator_backend;

import lombok.val;
import org.springframework.stereotype.Service;

@Service
public class FuelUpdaterService {

    private final FirebaseService firebaseService;

    public FuelUpdaterService(FirebaseService firebaseService) {
        this.firebaseService = firebaseService;
    }


    public void updateFuelStatus(UpdateFuelDto updateFuelDto) {
        val quantities = new Quantities(updateFuelDto.getPetrolLevel(), updateFuelDto.getDieselLevel());
        firebaseService.postData(quantities);
    }
}
