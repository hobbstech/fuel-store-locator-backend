package io.github.hobbstech.fuel_station_locator_backend;

import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.SetOptions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FirebaseService {

    private final Firestore db;

    public FirebaseService(Firestore db) {
        this.db = db;
    }


    void postData(Quantities quantities) {
        db.collection("fueling-stations")
                .document("iFOu8fiVxIgLkW3dUpUI")
                .set(quantities, SetOptions.merge());

    }

}
