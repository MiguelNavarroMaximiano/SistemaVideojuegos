import java.util.ArrayList;

public class Switch extends consola {

    ArrayList <Videojuego> videojuegos = new ArrayList<Videojuego>();
    Plataforma plataforma = obtenerPlataforma();

    public Switch() {

    }

    public Plataforma obtenerPlataforma(){
        return Plataforma.Switch;
    }

    public void jugarJuego() {
        System.out.println(videojuegos.getFirst());
    }

    public void instalarJuego(Videojuego juego) throws JuegoNoCompatibleException{
        if (juego.comprobarCompatibilidad(plataforma)){
            videojuegos.add(juego);
        } else {
            throw new JuegoNoCompatibleException();
        }
    }
}
