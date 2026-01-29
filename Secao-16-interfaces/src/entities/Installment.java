package entities;

import java.time.LocalDate;

public class Installment {

    private Integer numberInstallment;
    private LocalDate dueDate;
    private Double amount;

    public Installment(Integer numberInstallment, LocalDate dueDate, Double amount) {
        this.numberInstallment = numberInstallment;
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Integer getNumberInstallment() {
        return numberInstallment;
    }

    public void setNumberInstallment(Integer numberInstallment) {
        this.numberInstallment = numberInstallment;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
