class JuegoNoCompatibleException extends Exception {
    public JuegoNoCompatibleException() {
        super("El juego no es compatible con la plataforma seleccionada");
    }
}
