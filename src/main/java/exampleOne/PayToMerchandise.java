package exampleOne;

public class PayToMerchandise extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic flow for PayToMerchandise");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% fees is charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic of PayToMerchandise");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the remaining amount");
    }
}
