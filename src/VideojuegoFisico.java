public class VideojuegoFisico extends Videojuego {
    double precioEnvio = 1.99;

    public VideojuegoFisico() {
        super();
    }

    public double calcularPrecioFinal() {
        return precio + precioEnvio;
    }

    public boolean comprobarCompatibilidad() {
    }

    }