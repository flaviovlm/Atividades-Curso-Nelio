package services;

public interface OnlinePaymentService {

        Double paymentFee (Double value);
        Double interest (Integer months, Double amount);
}
