package com.company.repository.Inter;

import com.company.domain.Country;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface CountryRepositoryInter {
    Optional<Country> selectById(String countryId) throws SQLException;
    boolean updateCountryName(String countryId,String countryName);
    boolean deleteCountryById(String id);
    List<Country> allCountry();

}
