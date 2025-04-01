package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

/**
 * Unit tests for the {@link AirwayReservationsApi} class.
 */
public class AirwayReservationsApiTest {

    private AirwayReservationsApi airwayReservationsApi = new AirwayReservationsApi() {

        @Override
        public ResponseEntity<Object> airwayReservationsGet(UUID xTracking, String queryParam) {
            throw new UnsupportedOperationException("Unimplemented method 'airwayReservationsGet'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = airwayReservationsApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}