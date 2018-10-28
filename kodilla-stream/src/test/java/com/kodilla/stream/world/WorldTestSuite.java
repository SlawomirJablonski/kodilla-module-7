
package com.kodilla.stream.world;

import org.junit.Test;
import org.junit.Assert;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(BigDecimal.valueOf(38476269));
        Country portugal = new Country(BigDecimal.valueOf(10839514));
        Country india = new Country(BigDecimal.valueOf(1281935911));
        Country mexico = new Country(BigDecimal.valueOf(124574795));
        Country indonesia = new Country(BigDecimal.valueOf(260580739));
        Country nigeria = new Country(BigDecimal.valueOf(190632261));
        Country madagascar = new Country(BigDecimal.valueOf(25054161));
        Country antiguaAndBarbuda = new Country(BigDecimal.valueOf(94731));

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

        //When
        BigDecimal testResult = world.getPeopleQuantity();

        //Then
        int testPeopleQuantity = 38476269+10839514+1281935911+124574795+260580739+190632261+25054161+94731;
        BigDecimal expectedResult = new BigDecimal(testPeopleQuantity);
        Assert.assertEquals(expectedResult, testResult);
    }
}
