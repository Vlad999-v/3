import java.util.Comparator;

public class ActorComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        if(o1.getName().compareTo(o2.getName())==0) {
            return o1.getSurname().compareTo(o2.getSurname());
        }
        return o1.getName().compareTo(o2.getName());
    }
}
