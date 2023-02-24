package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Mariana",1193566441,20,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void ValidarDuplicado() {

        Person person = new Person("Mariana",1193566441,20,Gender.FEMALE,true);

        RegisterResult result1 = registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }

    @Test
    public void ValidarEstaMuerto() {

        Person person = new Person("Julio",79400552,75,Gender.MALE,false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void ValidaEsMenordeEdad() {

        Person person = new Person("Juanita",1141517655,14,Gender.FEMALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void ValidarEdadIncorrecta() {

        Person person = new Person("Antonio",78947,-13,Gender.MALE,true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }


}
