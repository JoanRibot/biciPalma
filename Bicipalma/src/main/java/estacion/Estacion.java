package estacion;

import java.util.Arrays;
import java.util.Optional;

import bicicleta.Movil;
import tarjetaUsuario.Autentificacion;

public class Estacion {
    private int id;
    private String direccion;
    private Anclajes anclajes;
    
    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId(){
        return this.id;
    }

    private String getDireccion(){
        return this.direccion;
        
    }
    private Anclaje[] anclajes(){
        return anclajes.anclajes();
    }

    private int numAnclajes(){
        return anclajes().length;
    }
    
    public void consultarEstacion() {
        System.out.println(toString());
    }

    public long anclajesLibres(){
        return Arrays.stream(anclajes()).filter(a -> !a.isOcupado()).count();
    }

    public void consultarAnclajes(){

    int numeroAnclaje = 0;

    for (Anclaje anclaje : anclajes()) {
        numeroAnclaje +=  + 1;
        if (anclaje.isOcupado()) {
            System.out.println("Anclaje " + numeroAnclaje + " " + anclaje.getBicicleta().getId());
        } else {
            System.out.println("Anclaje " + numeroAnclaje + " " + " libre");
        }

    }
}
    public void anclarBicicleta(Movil bicicleta){
        Optional<Anclaje> anclajeLibre = Arrays.stream(anclajes()).filter(a -> !a.isOcupado()).findAny();
        if (anclajeLibre.isPresent()){
            anclajeLibre.get().anclarBici(bicicleta);
            System.out.println("Bicic");
        
        }
        else{
            System.out.println("No quedan anclajes libres;");
        }
    }

    public void mostrarAnclaje(Movil bicicleta,int numeroAnclaje){
        System.out.println("bicicleta " + bicicleta.getId() 
        + " anclada en el anclaje " + numeroAnclaje);
    }

    public boolean leerTarjetaUsuario(Autentificacion tarjetaUsuario){
        return tarjetaUsuario.isActiva();
    }

    public void retirarBicicleta(Autentificacion tarjetaUsuario){
        if(leerTarjetaUsuario(tarjetaUsuario)){
            Optional<Anclaje> anclajeOcupado = Arrays.stream(anclajes()).filter(a -> a.isOcupado()).findAny();
            if(anclajeOcupado.isPresent()){
                anclajeOcupado.get().liberarBici();
            }else{
                System.out.println("No hay bicicletas en este momento");
            }
        }else{
            System.out.println("Su tarjeta no está activa");
        }
    }

    public void mostrarBicicleta (Movil bici){
        System.out.println(bici.toString());
    }

    @Override
    public String toString() {
        return 	"id: " + getId() + '\n' +
        "direccion: " + getDireccion() + '\n' +
        "numeroAnclajes: " + numAnclajes();
    }


}
