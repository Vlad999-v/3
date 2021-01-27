import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Actor Robert_John_Downey = new Actor.Builder().withname("Robert_John")
                .withsurname("Downey")
                .withrowth(1.75)
                .withbirthdate(LocalDate.of(1965, 4, 4))
                .withbirthplace("USA,Mangetten")
                .build();

        Actor Chris_Hemswort = new Actor.Builder().withname("Chris")
                .withsurname("Hemswort")
                .withrowth(1.85)
                .withbirthdate(LocalDate.of(1983,8, 11))
                .withbirthplace("Australia, Melburn")
                .build();

        Actor Chris_Evans = new Actor.Builder().withname("Chris")
                .withsurname("Evans")
                .withrowth(1.80)
                .withbirthdate(LocalDate.of(1981,3, 13))
                .withbirthplace("Boston, Massachusets")
                .build();

        Actor Scarlet_Iohanson = new Actor.Builder().withname("Scarlet")
                .withsurname("Iohanson")
                .withrowth(1.70)
                .withbirthdate(LocalDate.of(1984,6, 22))
                .withbirthplace("Mangetten,USA")
                .build();

        Actor Mark_Raffalo = new Actor.Builder().withname("Mark")
                .withsurname("Raffalo")
                .withrowth(1.75)
                .withbirthdate(LocalDate.of(1967,8, 22))
                .withbirthplace("Viskonsin,USA")
                .build();

        ArrayList<Actor> actorsAvengers = new ArrayList<Actor>();
        actorsAvengers.add(Chris_Hemswort);
        actorsAvengers.add(Robert_John_Downey);
        actorsAvengers.add(Chris_Evans);
        actorsAvengers.add(Scarlet_Iohanson);
        actorsAvengers.add(Mark_Raffalo);

        List<Film.Genre> genresAvengers = new ArrayList<Film.Genre>();
        genresAvengers.add(Film.Genre.FEATUREFILM);
        genresAvengers.add(Film.Genre.FANTASY);

        Film Avengers = new Film.Builder().withname("Avengers")
                .withactors(actorsAvengers)
                .withbudget(220000000)
                .withdirector("Dzosh Uidon")
                .withcountry("USA")
                .withduration(210)
                .withgenres(genresAvengers)
                .withyear(2012)
                .build();
        System.out.println(Avengers);

        ServiceFilm servicefilm = new ServiceFilm();
        ArrayList<Actor> resultwithname= servicefilm.searchActorwithName(actorsAvengers,"Chris");
        System.out.println(resultwithname);


        System.out.println(actorsAvengers);
        ArrayList<Actor> resultwithsort= servicefilm.sortActorbyNameSurname(actorsAvengers);
        System.out.println(resultwithsort);

        ArrayList<Actor> resultwithsortstream= servicefilm.sortActorbyNameSurnamewithStream(actorsAvengers);
        System.out.println(resultwithsortstream);

        ArrayList<Actor> resultwithinterval= servicefilm.searchActorwithIntervalBirthDate(actorsAvengers,LocalDate.of(1982,05,22),LocalDate.of(2010,06,25));
        System.out.println(resultwithinterval);


    }
}
