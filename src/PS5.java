import java.util.ArrayList;

public class PS5 extends consola {

    ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
    Plataforma plataforma = obtenerPlataforma();

    boolean estado = false;

    String listaJuegosPath = "C:\\Users\\mignavmax\\IdeaProjects\\SistemaVideojuegos\\res\\listaPS5";

    public PS5(){

    }

    public void encender(){
        estado = true;
        ficheros.leerFichero(listaJuegosPath);

    }

    public void apagar(){
        ficheros.escribirFichero(videojuegos, listaJuegosPath);
        estado = false;
    }


    public Plataforma obtenerPlataforma(){
        return Plataforma.PS5;
    }

    public void jugarJuego() {
     System.out.println(videojuegos.getFirst());
    }

    public void instalarJuego(Videojuego juego) throws JuegoNoCompatibleException {
        if (juego.comprobarCompatibilidad(plataforma)) {
            videojuegos.add(juego);
        } else {
            throw new JuegoNoCompatibleException();
        }
    }

}
