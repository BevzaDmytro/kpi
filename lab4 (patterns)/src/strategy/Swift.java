package strategy;

public class Swift implements Payable {
    @Override
    public void pay() {
        System.out.println("Payment complete via Swift");
    }
}
