package pl.companycar.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class EmployeeTest {
    private Employee emp [] = {new Employee("Test","General","5543",3),
            new Employee("Bazuka","Gieno","44322",5),
            new Employee("Anno","Ratata","3543",2)
    };


    @Test
    public void testToString(){
        //is


        //then


        //expected
        Assert.assertEquals(emp[0].toString(),"Test;General;5543;3");

    }

    @Test
    public void testCoparatorSort(){
        //is
            Arrays.sort(emp);
        //then

        Employee empExpected [] = {new Employee("Anno","Ratata","3543",2),
                new Employee("Bazuka","Gieno","44322",5),
                new Employee("Test","General","5543",3)};
        //expected
        Assert.assertEquals(Arrays.toString(empExpected),Arrays.toString(emp));

    }
}
