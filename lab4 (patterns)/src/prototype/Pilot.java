package prototype;

public class Pilot extends ClonableHuman {

    private int experience;

    public Pilot(String name, int age,int experience) {
        super(name, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    private Pilot(Pilot pilot) {
        super(pilot.getName(), pilot.getAge());
        this.experience = pilot.getExperience();
    }

    @Override
    public ClonableHuman clone() {
        return new Pilot(this);
    }
}
