package biciPalma;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bicicleta.Bicicleta;

public class BicicletaTest {
    @Test
    public void bicicletaToStringTest(){
        Bicicleta bicicleta = new Bicicleta(5);
        assertEquals( "Bicicleta [id=" + 5 + "]", bicicleta.toString());
    }
    @Test
    public void getIdTest(){
        Bicicleta byke = new Bicicleta(1234);
        assertEquals(1234, byke.getId());
    }
}
