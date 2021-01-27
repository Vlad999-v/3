
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;


public class ServiceFilm {

    public ArrayList<Actor> sortActorbyNameSurname(ArrayList<Actor> actors){
        actors.sort(new ActorComparator());
        return actors;
    }

    public ArrayList<Actor> sortActorbyNameSurnamewithStream(ArrayList<Actor> actors){
        //actors.sort(new ActorComparator());
        actors.stream().sorted(new ActorComparator()).collect(Collectors.toList());

        return actors;
    }

    public ArrayList<Actor> searchActorwithName(ArrayList<Actor> actors, String name){
        ArrayList<Actor> result = new ArrayList<>();
        for (Actor actor:actors
             ) {
            if(actor.getName().contains(name)){
                result.add(actor);
            }
        }
        return result;
        
    }

    public ArrayList<Actor> searchActorwithIntervalBirthDate(ArrayList<Actor> actors, LocalDate a, LocalDate b){
        ArrayList<Actor> result = new ArrayList<>();
        for (Actor actor:actors
        ) {
            if(actor.getBirthdate().isBefore(b) && actor.getBirthdate().isAfter(a)){
                result.add(actor);
            }
        }
        return result;

    }

}






/*
package service;

        import model.Group;
        import model.Person;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.stream.Collectors;

public class GroupService {
    private Group group;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<Person> sortStudentsWithStream(){
        return group.getStudents().stream().sorted().collect(Collectors.toList());
    }

    public List<Person> sortStudents(){
        List<Person> result = new ArrayList<>();
        Collections.sort(group.getStudents());
        return result;
    }

    public List<Person> sortStudentsByAgeWithStream(){
        return group.getStudents().stream().sorted((s1,s2)->s2.getDateOfBirth()
                .compareTo(s1.getDateOfBirth())).collect(Collectors.toList());
    }

    public List<Person> sortStudentsByAge(){
        List<Person> result = new ArrayList<>();
        Collections.sort(group.getStudents(), (o1, o2) -> o2.getDateOfBirth()
                .compareTo(o1.getDateOfBirth()));
        return result;
    }

}




        import model.Group;
        import model.Person;
        import model.Subject;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;
        import java.util.Map;
        import java.util.stream.Collectors;

public class StudentService {
    private Person student;

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public boolean addGrade(Subject subject, Integer mark){
        return false;
    }

    public int markBySubjectName(String name){
        List<Map<Subject, Integer>> marks = new ArrayList<>();
        return 0;
    }


}

 */