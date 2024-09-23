import java.util.ArrayList;

public class xbox extends consola {

    ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
    Plataforma plataforma = obtenerPlataforma();


    public xbox(){

    }

    public Plataforma obtenerPlataforma(){
        return Plataforma.xbox;
    }

    public void instalarJuego(Videojuego juego) throws JuegoNoCompatibleException {
        if (juego.comprobarCompatibilidad(plataforma)){
            videojuegos.add(juego);
        } else {
            throw new JuegoNoCompatibleException();
        }
    }
}
