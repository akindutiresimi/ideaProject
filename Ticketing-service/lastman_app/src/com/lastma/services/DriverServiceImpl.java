package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.data.repositories.DriverRepository;
import com.lastma.dtos.requests.RegisterDriverRequest;
import com.lastma.dtos.responses.RegisterDriverResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService{
    @Autowired
    private DriverRepository driverRepository;
    @Override
    public RegisterDriverResponse registerDriver(RegisterDriverRequest request) {

        Driver driver = new Driver();

        driver.setFullName(request.getFullName());
        driver.setEmail(request.getEmail());
        driver.setPassword(request.getPassword());
        driver.setPhoneNumber(request.getPhoneNumber());

        Driver savedDriver = driverRepository.save(driver);

        RegisterDriverResponse response = new RegisterDriverResponse();
        response.setFullName(savedDriver.getFullName());
        response.setId(savedDriver.getId());

        return response;
    }
}
