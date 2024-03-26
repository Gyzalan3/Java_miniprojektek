import java.util.ArrayList;
import java.util.Comparator;

public class Teszter {
    public static void main(String[] args) {
        Film film1= new Film("Forrest Gump",50);
        Film film2= new Film("Joker",660);
        Film film3= new Film("Keresztapa",700);
        Film film4= new Film("Batman",110);
        Film film5= new Film("Pokember",300);
        Film film6= new Film("Hitman",540);

        HorrorFilm hfilm1=new HorrorFilm("Hallowen",200,18);
        HorrorFilm hfilm2=new HorrorFilm("Ordoguzo",340,16);
        HorrorFilm hfilm3=new HorrorFilm("Az",550,18);
        HorrorFilm hfilm4=new HorrorFilm("Hallowen 2",60,18);
        HorrorFilm hfilm5=new HorrorFilm("Gonosz halott",230,16);
        HorrorFilm hfilm6=new HorrorFilm("Mosolyogj",850,18);


        ArrayList<Film> film_lista=new ArrayList<>();
        film_lista.add(film1);
        film_lista.add(film2);
        film_lista.add(film3);
        film_lista.add(film4);
        film_lista.add(film5);
        film_lista.add(film6);

        film_lista.add(hfilm1);
        film_lista.add(hfilm2);
        film_lista.add(hfilm3);
        film_lista.add(hfilm4);
        film_lista.add(hfilm5);
        film_lista.add(hfilm6);


        System.out.println("Eredeti lista:");
        for (Object obj : film_lista) {
            System.out.println(obj);
        }

        film_lista.sort(Comparator.comparingInt(Film::getAr));

        System.out.println("\nRendezett lista:");
        for (Film film : film_lista) {
            System.out.println(film);
        }

        ArrayList<IKorhataros> korhatarosfilmek=new ArrayList<>();
        for (Film filmtomb:film_lista){
            if(filmtomb instanceof HorrorFilm){
                korhatarosfilmek.add((HorrorFilm) filmtomb);
            }
        }

        System.out.println("\nKorhatáros filmek: ");
        for (IKorhataros hfilm:korhatarosfilmek){
            System.out.println(hfilm);
        }

        int osszBuntetes = 0;
        int kor = 15;
        for (IKorhataros film : korhatarosfilmek) {
            osszBuntetes += film.Buntetes(kor);
        }
        System.out.println("\nÖsszesen a büntetés: " + osszBuntetes);

    }
}
