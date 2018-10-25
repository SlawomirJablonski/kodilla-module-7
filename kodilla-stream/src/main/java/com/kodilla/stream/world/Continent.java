package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public class Continent {

    private final Set<Country> countries = new HashSet<>();

    public Set<Country> getCountries(){
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        return countries.equals(continent.countries);
    }

    @Override
    public int hashCode() {
        return countries.hashCode();
    }

}
