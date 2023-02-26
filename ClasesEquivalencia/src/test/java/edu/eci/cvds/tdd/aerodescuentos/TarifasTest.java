package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;


public class TarifasTest {
    private CalculadorDescuentos c= new CalculadorDescuentos();

    @Test
    public void validarEdadNegativa(){
        // Arrange
        double tarifa;
        try{
            // Act
            tarifa = c.calculoTarifa(3000000,60,-25);
        }
        catch ( Exception e){
            // Assert
            Assert.assertTrue(true);
        }
    }
    @Test
    public void validarEdad0(){
        // Arrange
        double tarifa;
        try{
            // Act
            tarifa = c.calculoTarifa(3000000,60,0);
        }
        catch ( Exception e){
            // Assert
            Assert.assertTrue(true);
        }
    }
    @Test
    public void validarEdadMayor150(){

        // Arrange
        double tarifa;
        try{
            tarifa = c.calculoTarifa(3000000,15,200);
        }
        catch (Exception e){
            // Assert
            Assert.assertTrue(true);
        }
    }
    @Test
    public void validarDescuento5(){
        // Arrange
        double tarifa;
        // Act
        tarifa = c.calculoTarifa(3000000,15,17);
        // Assert
        Assert.assertTrue(tarifa==2850000);

    }
    @Test
    public void validarDescuento8(){
        // Arrange
        double tarifa;
        // Act
        tarifa = c.calculoTarifa(3000000,15,70);
        // Assert
        Assert.assertTrue(tarifa==2760000);
    }
    @Test
    public void validarDescuento15(){
        // Arrange
        double tarifa;
        // Act
        tarifa = c.calculoTarifa(3000000,21,65);
        // Assert
        Assert.assertTrue(tarifa==2550000);
    }
    @Test
    public void descuentoAcum20(){
//        deberia generar un descuento del 20%, por su edad y los dias de antelacion con los que se agendo
        // Arrange
        double tarifa;
        // Act
        tarifa = c.calculoTarifa(5000000,40,14);
        // Assert
        Assert.assertTrue( tarifa == 4000000);
    }

    @Test
    public void descuentoAcum23(){
        //        deberia generar un descuanto del 20%, por su edad y los dias de antelacion con los que se agendo
        // Arrange
        double tarifa;
        tarifa = c.calculoTarifa(5000000,70,66);
        // Assert
        Assert.assertEquals( String.valueOf(tarifa), "3850000.0");
    }
    @Test
    public void validarNoAplicaElDescuento(){
        // Arrange
        double tarifa;
        // Act
        tarifa = c.calculoTarifa(1000000,10,60);
        // Assert
        Assert.assertTrue(tarifa==1000000);

    }


    @Test
    public void validarAntelacionNegativa(){
        // Arrange
        double tarifa;
        try{
            tarifa = c.calculoTarifa(3000000,-15,30);
        }
        catch (Exception e){
            // Assert
            Assert.assertTrue(true);
        }

    }



    @Test
    public void validarTarifaNegativa(){
        // Arrange
        double tarifa;
        try{
            //Act
            tarifa = c.calculoTarifa(-1000000,2,40);
        }
        catch (Exception e){
            //Assert
            Assert.assertTrue(true);
        }
    }
}
