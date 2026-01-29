package application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaymentPaypalService;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter localDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of contract: ");
        System.out.print("Number: ");
        Integer numberContract = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate dateContract = LocalDate.parse(sc.nextLine(), localDate);
        System.out.print("Value Contract: ");
        Double valueContract = sc.nextDouble();
        System.out.print("Enter the number of installments: ");
        Integer numberInstallments = sc.nextInt();
        sc.nextLine();

        Contract contract = new Contract(numberContract, dateContract, valueContract);
        OnlinePaymentService onlinePaymentService = new PaymentPaypalService();
        ContractService contractService = new ContractService(onlinePaymentService);

        contractService.processContract(contract, numberInstallments);

        System.out.println("PARCELAS: ");
        for (Installment i : contract.getInstallmentList()){
            System.out.println(i.getDueDate() + " - " + i.getAmount());
        }
    }
}