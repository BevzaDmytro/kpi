import prototype.ClonableHuman;
import prototype.ClonesArmy;
import prototype.Pilot;
import singleton.SingleTime;

public class Main {

    public static void main(String[] args) {

        SingleTime currentTime = SingleTime.getInstance();
        System.out.println(currentTime.getTime());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(currentTime.getTime());
//////////////////////////////


        /////////
        System.out.println("======prototype========");
        ClonesArmy army = new ClonesArmy();
        Pilot pilot1 = new Pilot("First",24,3);
        Pilot pilot2 = (Pilot) pilot1.clone();

        army.addSoldier(pilot1);
        army.addSoldier(pilot2);

        for ( ClonableHuman human  : army.getArmy()    ) {
            System.out.println(human.getAge() + " " + human.getName() + " " );
            if(human instanceof Pilot){
                System.out.println(((Pilot) human).getExperience());
            }
        }

    }
}
