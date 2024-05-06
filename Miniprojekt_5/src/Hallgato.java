import java.util.ArrayList;

public class Hallgato {
    private static int nextID = 0;
    private final int ID;
    private final String vezeteknev;
    private final String keresztnev;
    private final ArrayList<Jegy> jegyek = new ArrayList<>();

    public Hallgato(String vezeteknev, String keresztnev) {
        this.ID = nextID++;
        this.vezeteknev = vezeteknev;
        this.keresztnev = keresztnev;
    }




    public int getID() {
        return ID;
    }

    public String getVezeteknev() {
        return vezeteknev;
    }

    public String getKeresztnev() {
        return keresztnev;
    }

    public void ujBejegyzes(Jegy jegy){
        jegyek.add(jegy);
    }
    public double tantargyAtlag(String tantargy){
        int db=0;
        int atlag=0;
        for (Jegy j:jegyek){
            if (j.getTantargy().equals(tantargy)){
                atlag+=j.getJegy();
                db++;
            }
        }
        return  (db == 0) ? 0 : (double) atlag / db;
    }
    public ArrayList<String> getTantargyak() {
        ArrayList<String> tantargyak = new ArrayList<>();
        for (Jegy j : jegyek) {
            String tantargy = j.getTantargy();
            if (!tantargyak.contains(tantargy)) {
                tantargyak.add(tantargy);
            }
        }
        return tantargyak;
    }
    public void listazas() {
        System.out.println(vezeteknev + " " + keresztnev);
        for (String j : getTantargyak()) {
            System.out.println(j + ": " + String.format("%.2f", tantargyAtlag(j)));
        }
    }

}
