
public class Driver {
// 근로소득자와 사업소득자의 세금을 계산한다
	public static void main(String[] args) {
		
	// 이름이 ‘선남’이고 번호가 100이고 월급이 3,000,000인
	// SalaryTaxPayer 객체를 생성
	SalaryTaxPayer tax1 = new SalaryTaxPayer("선남", 100, 3000000);
	// tax1의 모든 데이터를 출력한다
	System.out.println(tax1.toString());
	// tax1의 세금을 계산하여 출력한다
	System.out.println(tax1.getName() + "의 세금 = " + tax1.computeTax());
	

	// 이름이 ‘선녀’이고 번호가 200이고 총매출액이 120,000,00이고
	// 총비용이 75,000,000인 BusinessTaxPayer 객체를 생성
	BusinessTaxPayer tax2 = new BusinessTaxPayer("선녀", 200, 120000000, 75000000);

	// tax2의 모든 데이터를 출력한다
	System.out.println(tax2.toString());
	// tax2의 세금을 계산하여 출력한다
	System.out.println(tax2.getName() + "의 세금 = " + tax2.computeTax());
	}
}
