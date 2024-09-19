public class VideojuegoDigital extends Videojuego {
    double descuento = 0.80;


    public VideojuegoDigital() {
        super();
    }

    public double calcularPrecioFinal() {
    return precio * descuento;
    }

    public boolean comprobarCompatibilidad(){

    }
}
