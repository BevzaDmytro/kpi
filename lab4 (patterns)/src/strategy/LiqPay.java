package strategy;

public class LiqPay implements Payable {
    @Override
    public void pay() {
        System.out.println("Payment complete with LiqPay");
    }
}