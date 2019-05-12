package prototype;

public class Soldier   extends ClonableHuman{

    private String armyType;

    public Soldier(String name, int age, String armyType) {
        super(name, age);
        this.armyType = armyType;
    }

    public String getArmyType() {
        return armyType;
    }

    public Soldier(Soldier soldier) {
        super(soldier.getName(), soldier.getAge());
        this.armyType = soldier.getArmyType();

    }

    @Override
    public ClonableHuman clone() {
        return new Soldier(this);
    }
}
