package com.lucky.smartstay.Controllers;

import com.lucky.smartstay.Models.PropertyDetails;

import com.lucky.smartstay.Services.PropertyDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/propertyDetails")
public class PropertyDetailsController {

    @Autowired
    private PropertyDetailsService propertyDetailsService;

    @PostMapping({"{propertyId}"})
    public PropertyDetails addPropertyDetails(@RequestBody PropertyDetails propertyDetails, @PathVariable int propertyId) {
        return propertyDetailsService.addPropertyDetails(propertyDetails,propertyId);
    }

    // Add other propertyDetails-related endpoints as needed
}