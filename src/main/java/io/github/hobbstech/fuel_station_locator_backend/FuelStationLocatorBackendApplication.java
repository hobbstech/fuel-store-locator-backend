package io.github.hobbstech.fuel_station_locator_backend;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
public class FuelStationLocatorBackendApplication {

    @Value("classpath:fueling-station--1540732955926-firebase-adminsdk-auado-016c32efd2.json")
    Resource resourceFile;

    public static void main(String[] args) {
        SpringApplication.run(FuelStationLocatorBackendApplication.class, args);
    }

    @Bean
    public Firestore databaseReference() throws IOException {

        InputStream fileInputStream = resourceFile.getInputStream();

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(fileInputStream))
                .build();

        FirebaseApp.initializeApp(options);
        return FirestoreClient.getFirestore();
    }

}
