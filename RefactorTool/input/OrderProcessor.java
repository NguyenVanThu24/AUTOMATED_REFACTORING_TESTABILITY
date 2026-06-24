public class OrderProcessor {

    public void processOrder() {

        SQLPaymentGateway.getInstance()
                .executeTransfer(amount);

        EmailService.getInstance()
                .sendMail();

        Logger.getInstance()
                .log("done");
    }
}