package entities;

import java.util.Date;

public class NaturalPerson extends TaxPayers{

	private Double healthExpenses;

	public NaturalPerson() {
		super();
	}

	public NaturalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double taxPaid (){
		double tax = 0.0;

		if (getAnnualIncome() < 20000){
			tax = 0.15;
		} else {
			tax = 0.25;
		}
		double result = 0.0;
		if (healthExpenses > 0){
			result = (getAnnualIncome() * tax) - (healthExpenses * 0.50);
		} else {
			result = getAnnualIncome() * tax;
		}

		return result;
	}

}
