import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/*вивести всіх акторів які народилися в даному місці вивести всіх акторів які народилися проміжку від і до відсортувати список акторів по прізвищу імені*/
public class Film {
    public enum Genre {
        FEATUREFILM, ACTION, ADVENTURE, COMEDY, DRAMA, HORROR, FANTASY;
    }
    private String name;
    private String director;
    private int duration;
    private String country;
    private int year;
    private int budget;
    private List<Genre> genres = new ArrayList<Genre>();
    private List<Actor> actors = new ArrayList<Actor>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public static class Builder{
        private Film newfilm;

        public Builder() {
            newfilm = new Film();
        }

        public Builder withname(String name){
            newfilm.name = name;
            return this;
        }

        public Builder withdirector(String director){
            newfilm.director = director;
            return this;
        }

        public Builder withduration(int duration){
            newfilm.duration = duration;
            return this;
        }

        public Builder withcountry(String country){
            newfilm.country = country;
            return this;
        }

        public Builder withyear(int year){
            newfilm.year = year;
            return this;
        }

        public Builder withbudget(int budget){
            newfilm.budget = budget;
            return this;
        }

        public Builder withgenres(List<Genre> genres){
            newfilm.genres = genres;
            return this;
        }

        public Builder withactors(List<Actor> actors){
            newfilm.actors = actors;
            return this;
        }

        public Film build(){
            return newfilm;
        }
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", duration=" + duration +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", budget=" + budget +
                ", genres=" + genres +
                ", actors=" + actors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(name, film.name) &&
                Objects.equals(director, film.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, director);
    }
}
