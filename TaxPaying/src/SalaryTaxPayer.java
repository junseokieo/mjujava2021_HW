
public class SalaryTaxPayer extends TaxPayer{
// 근로 소득자를 나타내는 클래스 
	private int salary;		// 월급

	// 근로소득자의 이름, 번호와 월급을 주어진 값으로 초기화한다
	public SalaryTaxPayer(String name, int number, int salary)
	{
        super(name, number);
        setSalary(salary);
	}

	// 근로소득자의 월급을 반환한다
    public int getSalary() {
    	return salary;
    }

	// 근로소득자의 이름, 번호와 월급을 반환한다
	public String toString()
	{
		String str = super.toString();
		str = str +", 월급: "+ getSalary();
		return str;
	}

	// 근로소득자의 월급을 주어진 값으로 변경한다
	private void setSalary(int newSalary) {
		this.salary = newSalary;
	}

	// 근로소득자의 세금을 계산한다
	public double computeTax()
	{
		if((this.getSalary()*12) <= 20000000) {
			return (this.getSalary()*12)*0.05;
		}else if((this.getSalary()*12) <= 40000000) {
			return (this.getSalary()*12)*0.1;
		}else if((this.getSalary()*12) <= 60000000) {
			return (this.getSalary()*12)*0.15;
		}else if((this.getSalary()*12) <= 80000000) {
			return (this.getSalary()*12)*0.2;
		}else {
			return (this.getSalary()*12)*0.3;
		}
	}
}
