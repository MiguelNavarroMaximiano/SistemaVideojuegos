import java.util.ArrayList;

public interface IVideojuego {

    double calcularPrecioFinal();
    boolean comprobarCompatibilidad(consola.Plataforma plataforma);
    boolean comprobarExistencia(ArrayList<Videojuego> videojuegos);
}
