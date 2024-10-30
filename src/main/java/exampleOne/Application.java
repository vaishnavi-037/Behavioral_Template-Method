package exampleOne;

public class Application {
    public static void main(String[] args) {
        PaymentFlow paymentFlowToFriend = new PayToFriend();
        paymentFlowToFriend.sendMoney();

        System.out.println();

        PaymentFlow paymentFlowToMerchandise = new PayToMerchandise();
        paymentFlowToMerchandise.sendMoney();
    }
}
