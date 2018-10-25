package com.kodilla.stream.world;

import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        Country poland = new Country(BigDecimal.valueOf(38476269L));
        Country portugal = new Country(BigDecimal.valueOf(10839514L));
        Country india = new Country(BigDecimal.valueOf(1281935911L));
        Country mexico = new Country(BigDecimal.valueOf(124574795L));
        Country indonesia = new Country(BigDecimal.valueOf(260580739L));
        Country nigeria = new Country(BigDecimal.valueOf(190632261L));
        Country madagascar = new Country(BigDecimal.valueOf(25054161L));
        Country antiguaAndBarbuda = new Country(BigDecimal.valueOf(94731L));
        Continent eurasia = new Continent();
        eurasia.getCountries().add(poland);
        eurasia.getCountries().add(portugal);
        eurasia.getCountries().add(india);
        eurasia.getCountries().add(indonesia);
        Continent africa = new Continent();
        africa.getCountries().add(madagascar);
        africa.getCountries().add(nigeria);
        Continent america = new Continent();
        america.getCountries().add(mexico);
        america.getCountries().add(antiguaAndBarbuda);
        World world = new World();
        world.getContinents().add(eurasia);
        world.getContinents().add(africa);
        world.getContinents().add(america);
        BigDecimal testResult = world.getPeopleQuantity();
        int testPeopleQuantity = 1932188381;
        BigDecimal expectedResult = new BigDecimal(testPeopleQuantity);
        Assert.assertEquals(expectedResult, testResult);
    }

}
