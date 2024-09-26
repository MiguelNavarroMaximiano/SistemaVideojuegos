class consolaException{
    class JuegoNoCompatibleException extends Exception{
        public JuegoNoCompatibleException(){
        super("El juego no es compatible con la plataforma seleccionada");
        }
    }
    class juegoYaExistenteException extends Exception{
        juegoYaExistenteException(){
            super("El juego ya existe");
        }
    }
}
