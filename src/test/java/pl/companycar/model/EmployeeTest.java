package pl.companycar.model;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void testToString(){
        //is
        Employee employee = new Employee("Test","General","5543",3);

        //then
        String employeeToString = employee.toString();

        //expected
        Assert.assertEquals(employeeToString,"Test;General;5543;3");

    }
}
