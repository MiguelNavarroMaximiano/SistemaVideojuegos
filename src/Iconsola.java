public interface Iconsola {
    void encender();
    void apagar();
    void instalarJuego(Videojuego juego) throws consolaException.JuegoNoCompatibleException, consolaException.juegoYaExistenteException;
    void jugarJuego();
    consola.Plataforma obtenerPlataforma();
}
