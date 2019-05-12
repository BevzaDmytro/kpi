package flyweight;

import java.util.ArrayList;

public class DisciplineFactory {
    private static ArrayList<Discipline> disciplines;

    public static Discipline getDiscipline(String name){
        Discipline discipline = null;
        for (Discipline d: disciplines             ) {
            if(d.getName().equals(name)){
                discipline = d;
                break;
            }
        }

        if(discipline == null){
            discipline = new Discipline(name);
            disciplines.add(discipline);
        }
        return discipline;
    }
}
