package io.github.hobbstech.fuel_station_locator_backend;

import org.springframework.stereotype.Service;

@Service
public class FuelUpdaterService {

    private final FirebaseService firebaseService;

    public FuelUpdaterService(FirebaseService firebaseService) {
        this.firebaseService = firebaseService;
    }


    public void updateFuelStatus(UpdateFuelDto updateFuelDto) {
        var quantities = new Quantities(updateFuelDto.getPetrolLevel(), updateFuelDto.getDieselLevel());
        firebaseService.postData(quantities);
    }
}
