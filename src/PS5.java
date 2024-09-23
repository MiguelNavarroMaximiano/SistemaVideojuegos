import java.util.ArrayList;

public class PS5 extends consola {

    ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
    Plataforma plataforma = obtenerPlataforma();


    public PS5(){

    }

    public Plataforma obtenerPlataforma(){
        return Plataforma.PS5;
    }

    public void jugarJuego() {
     System.out.println(videojuegos.getFirst());
    }

    public void instalarJuego(Videojuego juego) throws JuegoNoCompatibleException {
        if (juego.comprobarCompatibilidad(plataforma)){
            videojuegos.add(juego);
        } else {
            throw new JuegoNoCompatibleException();
        }
    }

}
