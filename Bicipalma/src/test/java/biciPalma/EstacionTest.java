package biciPalma;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import estacion.Estacion;

public class EstacionTest {
    Estacion estacionPrueba;

    @Before
    public void setup(){
        this.estacionPrueba=new Estacion(123,"Arenal", 6);
    }

    @Test
    public void constructorTest(){
        assertNotNull(estacionPrueba);
    }

    @Test
    public void anclajesLibresTest(){
        assertEquals(6, estacionPrueba.anclajesLibres());
    }
    }

