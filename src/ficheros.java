import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ficheros {

    public ficheros() {
    }

    public static void leerFichero(String path) {

        File fichero = new File(path);

        Scanner sc = null;

        try {

            sc = new Scanner(fichero);

            while (sc.hasNextLine()) {
                String juego = sc.nextLine();
                System.out.println(juego);
            }



        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if (sc != null) {
                    sc.close();
                }
            } catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }


    }

    public static void escribirFichero(ArrayList<Videojuego> juegos, String path) {

       try{
        FileWriter fw = new FileWriter(path);
        for (Videojuego videojuego : juegos) {
            fw.write(videojuego.nombre);
            fw.write(",");
            fw.write(videojuego.tipo.toString());
            fw.write(",");
            fw.write(videojuego.genero.toString());
            fw.write("\n");
        }
        fw.close();

       } catch (Exception e) {
           System.out.println(e.getMessage());
       }





    }

}
