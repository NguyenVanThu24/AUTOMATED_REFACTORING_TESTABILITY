public class OrderProcessor {
    private PaymentGateway paymentGateway;
    private EmailService emailService;
    private Logger logger;

    public OrderProcessor(PaymentGateway paymentGateway, EmailService emailService, Logger logger) {
        this.paymentGateway = paymentGateway;
        this.emailService = emailService;
        this.logger = logger;
    }


    public void processOrder() {

        paymentGateway
                .executeTransfer(amount);

        emailService
                .sendMail();

        logger
                .log("done");
    }
}