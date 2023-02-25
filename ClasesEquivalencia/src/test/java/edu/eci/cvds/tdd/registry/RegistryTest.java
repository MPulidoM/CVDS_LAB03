package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
        // Arrange
        Person person = new Person("Mariana",1193566441,20,Gender.FEMALE,true);
        // Act
        RegisterResult result = registry.registerVoter(person);
        // Assert
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void ValidarDuplicado() {
        // Arrange
        Person person = new Person("Mariana",1193566441,20,Gender.FEMALE,true);
        // Act
        RegisterResult result1 = registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);
        // Assert
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }

    @Test
    public void ValidarEstaMuerto() {
        // Arrange
        Person person = new Person("Julio",79400552,75,Gender.MALE,false);
        // Act
        RegisterResult result = registry.registerVoter(person);
        // Assert
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void ValidaEsMenordeEdad() {
        // Arrange
        Person person = new Person("Juanita",1141517655,14,Gender.FEMALE,true);
        // Act
        RegisterResult result = registry.registerVoter(person);
        // Assert
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void ValidarEdadIncorrecta() {
        // Arrange
        Person person = new Person("Antonio",78947,-13,Gender.MALE,true);
        // Act
        RegisterResult result = registry.registerVoter(person);
        // Assert
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }


}
