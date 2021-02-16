package estacion;

import bicicleta.Movil;

public class Anclaje {
    private boolean ocupado = false;
    private Movil bicicleta = null;

    public boolean isOcupado(){
        return this.ocupado;
    }

    public Movil getBicicleta() {
        return this.bicicleta;
    }

    public void anclarBici(Movil bici){
        this.bicicleta = bici;
        this.ocupado=true;
    }

    public void liberarBici(){
        this.bicicleta  = null;
        this.ocupado=false;
    }
}
