import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    VideojuegoFisico videojuego1 = new VideojuegoFisico();
    VideojuegoFisico videojuego2 = new VideojuegoFisico();
    videojuego2.tipo = Videojuego.TiposConsolas.xbox;
    VideojuegoFisico videojuego3 = new VideojuegoFisico();
    videojuego3.tipo = Videojuego.TiposConsolas.PS5;

    Switch switch1 = new Switch();
    switch1.instalarJuego(videojuego1);
    switch1.instalarJuego(videojuego2);
    switch1.instalarJuego(videojuego3);

    System.out.println(switch1.videojuegos);
    }
}