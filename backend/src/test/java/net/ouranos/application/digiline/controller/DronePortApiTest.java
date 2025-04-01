package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link DronePortApi} class.
 */
public class DronePortApiTest {

    private DronePortApi dronePortApi = new DronePortApi() {

        @Override
        public ResponseEntity<Object> dronePortGet(UUID xTracking, UUID dronePortid) {
            throw new UnsupportedOperationException("Unimplemented method 'dronePortGet'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = dronePortApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
