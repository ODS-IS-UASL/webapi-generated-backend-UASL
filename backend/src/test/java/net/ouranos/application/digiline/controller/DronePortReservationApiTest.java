package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link DronePortReservationApi} class.
 */
public class DronePortReservationApiTest {

    private DronePortReservationApi dronePortReservationApi = new DronePortReservationApi() {

        @Override
        public ResponseEntity<Object> dronePortReservationGet(UUID xTracking, UUID dronePortReservationid) {
            throw new UnsupportedOperationException("Unimplemented method 'dronePortReservationGet'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = dronePortReservationApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
