package strategy;

public class PaymentProvider {
    private Payable payment;

    public void setPayment(Payable payment) {
        this.payment = payment;
    }

    public void pay(){
        this.payment.pay();
    }
}
