package estacion;

import bicicleta.Movil;

public class Anclajes {
    private final Anclaje[] anclajes;

    Anclajes(int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes(){
        for(int i = 0; i<anclajes.length; i++){
            this.anclajes[i] = new Anclaje();
        }
    }

    Anclaje[] anclajes(){
        return this.anclajes;
    }

    public void ocuparAnclajes(int posicion, Movil bici){
        this.anclajes[posicion].anclarBici(bici);
    }

    public boolean isAnclajeOcupado(int posicion){
        return this.anclajes[posicion].isOcupado();
    }

    public void liberarAnclaje(int posicion){
        this.anclajes[posicion].liberarBici();
    }
}
