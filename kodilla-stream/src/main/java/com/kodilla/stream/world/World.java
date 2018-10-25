//what

package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    private final Set<Continent> continents = new HashSet();

    public Set<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity).reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return peopleQuantity;
    }
}

