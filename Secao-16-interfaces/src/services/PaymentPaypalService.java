package services;

public class PaymentPaypalService implements OnlinePaymentService {

    public static final Double INTEREST = 0.01;
    public static final Double TAX = 0.02;

    @Override
    public Double paymentFee(Double value) {
        return value * TAX;
    }

    @Override
    public Double interest(Integer months, Double value) {
        return months * INTEREST * value;
    }
}

