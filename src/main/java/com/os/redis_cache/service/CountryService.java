package com.os.redis_cache.service;

import com.os.redis_cache.dto.request.CreateCountryRequest;
import com.os.redis_cache.dto.request.UpdateCountryRequest;
import com.os.redis_cache.model.Country;
import com.os.redis_cache.repository.CountryRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
    @Cacheable(value = "getAllCountry",key = "#root.methodName")
    public List<Country> getAllCountry()
    {
        return countryRepository.findAll();
    }
    @CacheEvict(value = "getAllCountry",allEntries = true)
    public Country createCountry(CreateCountryRequest request)
    {
        var country = countryRepository.save(request.toEntity(request));
        return country;
    }

}
