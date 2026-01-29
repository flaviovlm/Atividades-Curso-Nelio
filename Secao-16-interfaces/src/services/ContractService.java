package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {

    OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract (Contract contract, Integer months){

        double valueInstallment = (contract.getValueContract() / months);

        for (int i = 1; i <= months; i++) {
            double interest = onlinePaymentService.interest(i, valueInstallment);
            double paymenFee = onlinePaymentService.paymentFee(interest + valueInstallment);
            double result = interest + paymenFee + valueInstallment;

            LocalDate date = contract.getDataContract().plusMonths(i);
            Installment installment = new Installment(i, date, result);
            contract.addInstallment(installment);
        }
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }
}
