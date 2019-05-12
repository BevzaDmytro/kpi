package prototype;

import java.util.ArrayList;

public class ClonesArmy {
   private ArrayList<ClonableHuman> army;

    public ClonesArmy() {
        this.army = new ArrayList<>();
    }

    public void addSoldier(ClonableHuman soldier){
        this.army.add(soldier);
    }

    public ArrayList<ClonableHuman> getArmy() {
        return army;
    }
}
