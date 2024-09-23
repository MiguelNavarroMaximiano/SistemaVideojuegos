public interface Iconsola {
    void encender();
    void apagar();
    void instalarJuego(Videojuego juego) throws JuegoNoCompatibleException;
    void jugarJuego();
    consola.Plataforma obtenerPlataforma();
}
