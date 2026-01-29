package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer numberContract;
    private LocalDate dataContract;
    private Double valueContract;

    private final List<Installment> installmentList = new ArrayList<>();

    public Contract() {
    }

    public Contract(Integer numberContract, LocalDate dataContract, Double valueContract) {
        this.numberContract = numberContract;
        this.dataContract = dataContract;
        this.valueContract = valueContract;

    }

    public Integer getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(Integer numberContract) {
        this.numberContract = numberContract;
    }

    public LocalDate getDataContract() {
        return dataContract;
    }

    public void setDataContract(LocalDate dataContract) {
        this.dataContract = dataContract;
    }

    public Double getValueContract() {
        return valueContract;
    }

    public void setValueContract(Double valueContract) {
        this.valueContract = valueContract;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }

    public void addInstallment (Installment installment){
        installmentList.add(installment);
    }

    public void removeInstallment (Installment installment){
        installmentList.remove(installment);
    }
}

