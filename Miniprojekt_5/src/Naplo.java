
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Naplo {
    private ArrayList<Hallgato> hallgatok;

    public Naplo(ArrayList<Hallgato> hallgatok) {
        this.hallgatok = hallgatok;

    }

    public Naplo(String csvFile) {
        hallgatok = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String vezeteknev = parts[0];
                String keresztnev = parts[1];
                Hallgato hallgato = new Hallgato(vezeteknev, keresztnev);
                hallgatok.add(hallgato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listazNevek() {
        for (Hallgato j : hallgatok) {
            System.out.println(j.getID() + ". " + j.getVezeteknev() + " " + j.getKeresztnev());
        }
    }

    public void ujJegy(int ID, Jegy jegy) {
        for (Hallgato hallgato : hallgatok) {
            if (hallgato.getID() == ID) {
                hallgato.ujBejegyzes(jegy);
            }
        }
    }

    public void listazHallgatoiAdatok() {
        for (Hallgato hallgato : hallgatok) {
            System.out.println(hallgato.getVezeteknev() + " " + hallgato.getKeresztnev());
            for (String tantargy : hallgato.getTantargyak()) {
                System.out.println(tantargy + ": " + String.format("%.2f", hallgato.tantargyAtlag(tantargy)));
            }
            System.out.println();
        }
    }
}
