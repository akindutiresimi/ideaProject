package com.lastma.services;

import com.lastma.dtos.requests.RegisterDriverRequest;
import com.lastma.dtos.responses.RegisterDriverResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DriverServiceImplTest {
    @Autowired
    private DriverService driverService;

    @Test
    public void testThatICanRegisterADriver_IdIsGeneratedAfterRegister() {
        RegisterDriverRequest request = new RegisterDriverRequest();
        request.setFullName("John Lawrence");
        request.setEmail("johncow@gmail");
        request.setPassword("password");
        request.setPhoneNumber("070712356");

        RegisterDriverResponse response = driverService.registerDriver(request);
        assertNotNull(response);
        assertEquals("John lawrence", response.getFullName());
    }

}