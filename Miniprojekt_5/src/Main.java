import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hallgato hallgato = new Hallgato("Nagy", "Elemer");
        hallgato.ujBejegyzes( new Jegy("Matek", 10));

        hallgato.ujBejegyzes( new Jegy("Matek", 8));
        hallgato.ujBejegyzes( new Jegy("Roman", 7));
        hallgato.ujBejegyzes( new Jegy("Roman", 8));
        hallgato.ujBejegyzes( new Jegy("Magyar", 9));
        hallgato.listazas();

        System.out.println(new File(".").getAbsolutePath());
        Naplo naplo = new Naplo("hallgatok.csv");
        naplo.listazNevek();



        String path="jegyek.csv";
        String line="";
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {

                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(",");
                    int ID = Integer.parseInt(parts[0]);
                    String tantargy = parts[1];
                    int jegy  = Integer.parseInt(parts[2]);
                    Jegy jegyek=new Jegy(tantargy,jegy);
                    naplo.ujJegy(ID,jegyek);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


        naplo.listazHallgatoiAdatok();
    }
}
