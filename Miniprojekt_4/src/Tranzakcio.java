import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tranzakcio {
    public LocalDateTime idopont;
    public TranzakcioTipus tranzTipus;

    public double osszeg;

    public enum TranzakcioTipus {
        DEPOSIT,WITHDRAW
    }

    public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
        this.idopont = LocalDateTime.now();
        this.tranzTipus = tranzTipus;
        this.osszeg = osszeg;
    }

    @Override
    public String toString() {
        return  idopont.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))+ " " +
                ", tranzTipus=" + tranzTipus +
                ", osszeg=" + osszeg;
    }
}
