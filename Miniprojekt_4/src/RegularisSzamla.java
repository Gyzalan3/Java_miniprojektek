import java.util.ArrayList;
import java.util.List;

public class RegularisSzamla implements Bankszamla{
    protected    double egyenleg;
    protected String tulNev;
    protected int szamlaSzam;
    private  static int kovSzamlaSzam=1;
    public ArrayList<Tranzakcio> tranzakciok=new ArrayList<>();

    public RegularisSzamla(double egyenleg, String tulNev, int szamlaSzam) {
        this.egyenleg =egyenleg;
        this.tulNev = tulNev;
        this.szamlaSzam = ujSzamlaSzam();

    }
    private  static synchronized int ujSzamlaSzam(){
        return ++kovSzamlaSzam;
    }

    @Override
    public double betesz(double osszeg) {
        egyenleg+=osszeg;
        tranzakciok.add(new Tranzakcio(Tranzakcio.TranzakcioTipus.DEPOSIT,osszeg));
        return this.egyenleg;


    }

    @Override
    public double kivesz(double osszeg) throws SajatHibaException {
        egyenleg-=osszeg;
        if (osszeg>egyenleg){
            throw new SajatHibaException("Nincs elég összeg a számlán.");
        }

        tranzakciok.add(new Tranzakcio(Tranzakcio.TranzakcioTipus.WITHDRAW,osszeg));

        return this.egyenleg;
    }

    @Override
    public double getEgyenleg() {
        return egyenleg;
    }

    @Override
    public String toString() {
        return "RegularisSzamla{" +
                "egyenleg=" + egyenleg +
                ", tulNev='" + tulNev + '\'' +
                ", szamlaSzam=" + szamlaSzam +
                ", tranzakciok=" + tranzakciok +
                '}';
    }
}
