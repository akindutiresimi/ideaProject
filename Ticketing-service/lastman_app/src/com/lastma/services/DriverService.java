package com.lastma.services;

import com.lastma.data.models.Driver;
import com.lastma.dtos.requests.RegisterDriverRequest;
import com.lastma.dtos.responses.RegisterDriverResponse;
import org.springframework.stereotype.Service;


@Service
public interface DriverService {
    RegisterDriverResponse registerDriver(RegisterDriverRequest request);
}
