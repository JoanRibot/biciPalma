package tarjetaUsuario;

public class TarjetaUsuario implements Autentificacion {
    private String id;
    private boolean activa;

    public TarjetaUsuario(String id, boolean activa) {
        this.id = id;
        this.activa = activa;
    }

    public String getId() {
        return this.id;
    }

    public boolean isActiva() {
        return this.activa;
    }

    public void setActiva(boolean activada) {
        this.activa = activada;
    }

	public void setActivada(boolean activada) {
        this.activa=activada;
	}
}
