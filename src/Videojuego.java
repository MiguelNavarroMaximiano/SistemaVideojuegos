import java.util.ArrayList;
import java.util.Objects;

public abstract class Videojuego implements IVideojuego {
    String nombre = "PEPES";
    double precio = 40;
    String formato;

    public enum Generos{RPG,RTS,accion,aventura,construccion}

    public enum TiposConsolas{PS5,Switch,xbox}

    Generos genero = Generos.RTS;
    TiposConsolas tipo = TiposConsolas.Switch;

    public Videojuego(){
    }

    public abstract double calcularPrecioFinal();
    public abstract boolean comprobarCompatibilidad(consola.Plataforma plataforma);
    public abstract boolean comprobarExistencia(ArrayList<Videojuego> videojuegos);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return Double.compare(precio, that.precio) == 0 && Objects.equals(nombre, that.nombre) && Objects.equals(formato, that.formato) && genero == that.genero && tipo == that.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio, formato, genero, tipo);
    }
}
