public class VideojuegoFisico extends Videojuego {
    double precioEnvio = 1.99;

    public VideojuegoFisico() {
        super();
    }

    public double calcularPrecioFinal() {
        return precio + precioEnvio;
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