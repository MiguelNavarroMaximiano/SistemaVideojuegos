public abstract class consola implements Iconsola{

    public enum Plataforma{PS5,Switch,xbox}

    public consola(){
    }

    public void encender(){
    }

    public void apagar(){
    }

    public void instalarJuego(Videojuego juego) {

    }

    public void jugarJuego() {
    }

    public abstract Plataforma obtenerPlataforma();
}
