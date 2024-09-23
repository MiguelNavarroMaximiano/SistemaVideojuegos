public class VideojuegoDigital extends Videojuego {
    double descuento = 0.80;


    public VideojuegoDigital() {
        super();
    }

    public double calcularPrecioFinal() {
    return precio * descuento;
    }

    public boolean comprobarCompatibilidad(consola.Plataforma plataforma) {
        String p = plataforma.toString();
        String t = tipo.toString();
        boolean isCompatible = false;

        if (t.equals(p)){
            isCompatible = true;
        }
        return isCompatible;
    }
}
