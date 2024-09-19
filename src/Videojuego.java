public abstract class Videojuego implements IVideojuego {
    double precio = 40;
    String nombre = "PEPES";

    public enum Generos{RPG,RTS,accion,aventura,construccion}

    public enum TiposConsolas{PS5,Switch,xbox}

    Generos genero = Generos.RTS;
    TiposConsolas tipo = TiposConsolas.Switch;

    public Videojuego(){
        double precio = this.precio;
        String nombre = this.nombre;
        Generos genero = this.genero;
        TiposConsolas tipo = this.tipo;
    }

    public abstract double calcularPrecioFinal();
    public abstract boolean comprobarCompatibilidad();

}
