package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import net.ouranos.domain.digiline.model.NearMissInformationRequest;

/**
 * Unit tests for the {@link NearMissInformationApi} class.
 */
public class NearMissInformationApiTest {

    private NearMissInformationApi nearMissInformationApi = new NearMissInformationApi() {


        @Override
        public ResponseEntity<Object> nearMissInformationPost(UUID xTracking, NearMissInformationRequest nearMissInformationRequest) {
            throw new UnsupportedOperationException("Unimplemented method 'nearMissInformationPost'");
        }

    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = nearMissInformationApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
