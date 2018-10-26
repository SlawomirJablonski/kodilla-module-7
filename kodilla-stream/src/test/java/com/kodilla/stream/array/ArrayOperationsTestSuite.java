package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given

        int[] array = new int[20];
        for (int i=0;i<array.length;i++){
            array[i]=50+i;
        }

        //When
        double result = ArrayOperations.getAverage(array);

        //Then
        int sum = Arrays.stream(array).sum();
        double expectedAverage = (double)sum/array.length;
        Assert.assertEquals(expectedAverage,result,0);
    }
}

