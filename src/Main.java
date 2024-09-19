import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    VideojuegoFisico Videojuego1 = new VideojuegoFisico();
    VideojuegoDigital Videojuego2 = new VideojuegoDigital();

        System.out.println(Videojuego1.genero);
        System.out.println(Videojuego1.tipo);

        System.out.println(Videojuego1.calcularPrecioFinal());

        System.out.println(Videojuego2.genero);
        System.out.println(Videojuego2.tipo);

        System.out.println(Videojuego2.calcularPrecioFinal());


    }
}