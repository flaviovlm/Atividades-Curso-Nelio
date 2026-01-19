package entities;

public class LegalPerson extends TaxPayers{

	private int numberEmployees;

	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double annualIncome, int numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public Double taxPaid (){

		double tax = 0.0;

		if (numberEmployees > 10){
			tax = 0.14;
		} else {
			tax = 0.16;
		}

		return getAnnualIncome() * tax;

	}
}
