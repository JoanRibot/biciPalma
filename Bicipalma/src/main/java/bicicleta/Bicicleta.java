package bicicleta;

public class Bicicleta implements Movil {
    public int id;

    public Bicicleta(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    @Override
    public String toString() {
        return "Bicicleta [id=" + id + "]";
    }

   
        
}
