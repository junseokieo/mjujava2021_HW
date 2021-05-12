public class BusinessTaxPayer extends TaxPayer
{// 사업소득자를 모델한다
	private int sales;		// 총매출액
	private int expenses; 	// 총비용

	// 사업소득자의 이름, 번호, 총매출액과 총비용을 주어진 값으로 초기화한다
	public BusinessTaxPayer(String name, int number, int sales, int expenses)
	{
        super(name, number);
        setSales(sales);
        setExpenses(expenses);
	}

	// 사업소득자의 총매출액을 반환한다
	public int getSales() {
        return sales;
	}

	// 사업소득자의 총비용을 반환한다
    public int getExpenses() {
    	return expenses;
    }

	// 사업소득자의 이름, 번호, 총매출액과 총비용을 반환한다
    public String toString()
	{
		String str = super.toString();
		str = str + ", 총매출액: " + getSales() + ", 총비용: " + getExpenses();
		return str;
	}
        

	// 사업소득자의 총매출액을 주어진 값으로 변경한다
	private void setSales(int newSales)
	{
        this.sales = newSales;
	}

	// 사업소득자의 총비용을 주어진 값으로 변경한다
	private void setExpenses(int newExpenses) {
		this.expenses = newExpenses;
	}
        

	// 사업소득자의 세금을 계산한다
    public double computeTax() {
    	if((this.getSales()-this.getExpenses()) <= 0) {
    		return 0;
    	}else if((this.getSales()-this.getExpenses()) <= 40000000) {
    		return (this.getSales()-this.getExpenses())*0.1;
    	}else {
    		return (this.getSales()-this.getExpenses())*0.2;
    	}
    }
}