package com.os.redis_cache.controller;

import com.os.redis_cache.dto.request.CreateCountryRequest;
import com.os.redis_cache.model.Country;
import com.os.redis_cache.service.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/get/country")
    public List<Country> getAllCountry()
    {
        return countryService.getAllCountry();
    }
    @PostMapping("/create/country")
    public Country createCountry(@RequestBody CreateCountryRequest request)
    {
        return countryService.createCountry(request);
    }
}
