package pl.companycar.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class VehicleTest {
    private Vehicle vehicle [] = {new Vehicle("Audi","A4","1.6",2020),
            new Vehicle("BMW","4","1.1",2013),
            new Vehicle("Kia","Rio","2.0",2015)};

    @Test
    public void TestToString(){
        //is

        //then

        //Expected
        Assert.assertEquals(vehicle[0].toString(),"Audi; A4; 1.6; 2020");
        Assert.assertEquals(vehicle[1].toString(),"BMW; 4; 1.1; 2013");
        Assert.assertEquals(vehicle[2].toString(),"Kia; Rio; 2.0; 2015");
    }
}
