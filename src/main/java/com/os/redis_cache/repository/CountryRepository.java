package com.os.redis_cache.repository;

import com.os.redis_cache.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
