import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ficheros {

    public ficheros() {
    }

    public static void leerFichero(String path, ArrayList<Videojuego> juegos) {

        File fichero = new File(path);

        Scanner sc = null;

        try {

            sc = new Scanner(fichero);

            while (sc.hasNextLine()) {
                String juego = sc.nextLine();
                System.out.println(juego);
                String [] sep = juego.split(",");
                String nombre = sep[0];
                Videojuego.TiposConsolas tipo = Videojuego.TiposConsolas.valueOf(sep[1]);
                Videojuego.Generos genero = Videojuego.Generos.valueOf(sep[2]);
                double precio = Double.parseDouble(sep[3]);
                String formato = sep[4];

                Videojuego videojuego = new VideojuegoFisico();
                videojuego.nombre = nombre;
                videojuego.tipo = tipo;
                videojuego.genero = genero;
                videojuego.precio = precio;
                videojuego.formato = formato;
                juegos.add(videojuego);
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
            fw.write(",");
            fw.write(String.valueOf(videojuego.precio));
            fw.write(",");
            fw.write(videojuego.formato);
            fw.write("\n");
        }
        fw.close();

       } catch (Exception e) {
           System.out.println(e.getMessage());
       }





    }

}
