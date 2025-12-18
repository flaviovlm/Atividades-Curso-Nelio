package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        this.grossSalary = ((percentage / 100) * grossSalary) + grossSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "Name ='" + name + '\'' +
                ", GrossSalary = " + grossSalary +
                ", Tax = " + tax +
                ", NetSalary = "+NetSalary()+"}";
    }
}
