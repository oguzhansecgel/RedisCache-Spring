package com.os.redis_cache.dto.request;

import com.os.redis_cache.model.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCountryRequest {
    private String countryName;


       public Country toEntity(CreateCountryRequest request)
       {
           return Country.builder()
                   .countryName(request.getCountryName())
                   .build();
       }
}
