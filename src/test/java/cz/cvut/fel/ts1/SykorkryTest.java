package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SykorkryTest {

    @Test
    public void factorial_nIs5_returns120(){
        // Arrange
        Sykorkry sykorkry = new Sykorkry();

        // Act
        int actual = sykorkry.factorial(5);

        //Assert
        Assertions.assertEquals(120,actual);
    }

    @Test
    public void factorial_nIs0_returns1(){
        // Arrange
        Sykorkry sykorkry = new Sykorkry();

        // Act
        int actual = sykorkry.factorial(0);

        //Assert
        Assertions.assertEquals(1,actual);
    }
}
