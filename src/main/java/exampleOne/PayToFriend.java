package exampleOne;

public class PayToFriend extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic flow for PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% fees is charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic of PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the full amount");
    }
}
