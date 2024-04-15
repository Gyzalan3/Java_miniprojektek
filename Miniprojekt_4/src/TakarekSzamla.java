import java.util.List;
import java.util.Objects;

public class TakarekSzamla extends RegularisSzamla{
    private double kamatRata;

    public TakarekSzamla(double egyenleg, String tulNev, int szamlaSzam, double kamatRata) {
        super(egyenleg, tulNev, szamlaSzam);
        this.kamatRata = kamatRata;

    }
    public void hozzaadKamat(){
        this.egyenleg+=this.egyenleg * (kamatRata / 100);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TakarekSzamla that = (TakarekSzamla) o;
        return Double.compare(kamatRata, that.kamatRata) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(kamatRata);
    }

    public double getKamatRata() {
        return kamatRata;
    }

    public void setKamatRata(double kamatRata) {
        this.kamatRata = kamatRata;
    }

    @Override
    public String toString() {
        return "TakarekSzamla{" + "tulNev: " + tulNev +
                "kamatRata=" + kamatRata +
                '}';
    }
}
