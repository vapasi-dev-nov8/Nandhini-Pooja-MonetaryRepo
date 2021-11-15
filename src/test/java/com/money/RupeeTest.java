package com.money;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RupeeTest {
    @Test
    public void shouldCompareSameRupeeValues(){
        Rupee rupeeObject1 = new Rupee(4);
        Rupee rupeeObject2 = new Rupee(4);
        Assertions.assertTrue(rupeeObject1.equals(rupeeObject2));
    }
    @Test
    public void shouldCompareDifferentRupeeValues(){
        Rupee rupeeObject1 = new Rupee(14);
        Rupee rupeeObject2 = new Rupee(4);
        Assertions.assertFalse(rupeeObject1.equals(rupeeObject2));
    }
    @Test
    public void shouldAddRupeeValues(){
        Rupee rupeeObject1 = new Rupee(4);
        Rupee rupeeObject2 = new Rupee(6);
        Rupee expectedValueInRupeeObject = new Rupee(10);
        Assertions.assertEquals(expectedValueInRupeeObject,rupeeObject1.addingMonetaryValue(rupeeObject2));
    }
}
