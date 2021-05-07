
public class Driver {

	public static void main(String[] args) {
		// itemSales 객체 생성 
		ItemSales item1 = new ItemSales();
		item1.setprice(1000);
		item1.setbignum(10);
		item1.setbigDCper(30);
		
		item1.setnum(1);
		System.out.println(item1.toString());
		item1.setnum(9);
		System.out.println(item1.toString());
		item1.setnum(10);
		System.out.println(item1.toString());
		item1.setnum(50);
		System.out.println(item1.toString());
	}

}
