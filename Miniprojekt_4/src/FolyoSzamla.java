import java.util.List;
import java.util.Objects;

public class FolyoSzamla extends RegularisSzamla{
    private  int tranzakciokSzama ;
    private final static int ingyenestranszam=3;
    private final static double tranzakcioara=2.0;

    public FolyoSzamla(double egyenleg, String tulNev, int szamlaSzam) {
        super(egyenleg, tulNev, szamlaSzam);
    }


    @Override
    public double betesz(double osszeg) {
        super.betesz(osszeg);
        tranzakciokSzama++;
        return osszeg;
    }

    @Override
    public double kivesz(double osszeg) throws SajatHibaException{
        super.kivesz(osszeg);
        tranzakciokSzama++;
        return osszeg;
    }
    public void levonKoltseg() {
        if (tranzakciokSzama > ingyenestranszam) {
            double levonandoOsszeg = tranzakcioara * (tranzakciokSzama - ingyenestranszam);
            egyenleg-=levonandoOsszeg;
        }
          this.tranzakciokSzama=0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FolyoSzamla that = (FolyoSzamla) o;
        return tranzakciokSzama == that.tranzakciokSzama && ingyenestranszam == that.ingyenestranszam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tranzakciokSzama, ingyenestranszam);
    }

    @Override
    public String toString() {
        return "FolyoSzamla{" +
                "tranzakciokSzama=" + tranzakciokSzama +
                ", egyenleg=" + egyenleg +
                ", tulNev='" + tulNev + '\'' +
                ", szamlaSzam=" + szamlaSzam +
                ", tranzakciok=" + tranzakciok +
                '}';
    }

}
