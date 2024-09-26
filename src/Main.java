import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws consolaException.JuegoNoCompatibleException {

    VideojuegoFisico videojuego1 = new VideojuegoFisico();
    VideojuegoFisico videojuego2 = new VideojuegoFisico();
    videojuego2.tipo = Videojuego.TiposConsolas.PS5;
    videojuego2.nombre = "PACOS DUTY";
    videojuego2.genero = Videojuego.Generos.RPG;
    VideojuegoFisico videojuego3 = new VideojuegoFisico();
    videojuego3.tipo = Videojuego.TiposConsolas.PS5;
    VideojuegoDigital videojuego4 = new VideojuegoDigital();
    videojuego4.tipo = Videojuego.TiposConsolas.Switch;


    Switch switch1 = new Switch();
    switch1.instalarJuego(videojuego1);
    switch1.instalarJuego(videojuego4);



    xbox xbox1 = new xbox();
    //xbox1.instalarJuego(videojuego2);



    PS5 ps5 = new PS5();
    ps5.encender();
    //ps5.instalarJuego(videojuego3);
    //ps5.instalarJuego(videojuego2);
    System.out.println("-----------------");
    System.out.println(ps5.videojuegos);
    ps5.apagar();
    System.out.println("-----------------");
    ps5.encender();




    //ps5.jugarJuego();

    }
}