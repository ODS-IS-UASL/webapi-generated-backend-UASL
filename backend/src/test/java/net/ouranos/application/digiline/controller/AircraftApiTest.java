package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link AircraftApi} class.
 */
public class AircraftApiTest {

    private AircraftApi aircraftApi = new AircraftApi() {

        @Override
        public ResponseEntity<Object> aircraftGet(UUID xTracking, UUID aircraftid) {
            throw new UnsupportedOperationException("Unimplemented method 'aircraftGet'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = aircraftApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
