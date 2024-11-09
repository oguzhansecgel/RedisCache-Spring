package com.os.redis_cache.dto.response;
import com.os.redis_cache.model.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateCountryResponse {
    private int id;
    private String countryName;

}
