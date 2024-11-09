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
public class UpdateCountryRequest {
    private int id;
    private String countryName;

    public Country toEntity(UpdateCountryRequest request)
    {
        return Country.builder()
                .id(request.id)
                .countryName(request.countryName)
                .build();
    }
}
