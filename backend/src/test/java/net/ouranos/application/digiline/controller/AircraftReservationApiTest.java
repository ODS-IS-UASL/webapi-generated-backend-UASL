package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link AircraftReservationApi} class.
 */
public class AircraftReservationApiTest {

    private AircraftReservationApi aircraftReservationApi = new AircraftReservationApi() {

        @Override
        public ResponseEntity<Object> aircraftReservationGet(UUID xTracking,
        UUID aircraftReservationId) {
            throw new UnsupportedOperationException("Unimplemented method 'aircraftReservationGet'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = aircraftReservationApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
