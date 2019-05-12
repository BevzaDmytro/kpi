import decorator.MessageSender;
import decorator.StandartSender;
import decorator.VideoMessageDecorator;
import prototype.ClonableHuman;
import prototype.ClonesArmy;
import prototype.Pilot;
import singleton.SingleTime;
import strategy.LiqPay;
import strategy.PaymentProvider;
import strategy.Swift;

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
        /////////////////
        System.out.println("====strategy=====");
        PaymentProvider paymentProvider = new PaymentProvider();

        boolean swift = true;
        if(swift){
            paymentProvider.setPayment(new Swift());
        }
        else paymentProvider.setPayment(new LiqPay());

        paymentProvider.pay();

        /////////////////////////
        System.out.println("=======decorator==========");
        MessageSender messageSender = new StandartSender();
        messageSender.send("First message");

        messageSender = new VideoMessageDecorator(messageSender);
        messageSender.send("second");
    }
}
