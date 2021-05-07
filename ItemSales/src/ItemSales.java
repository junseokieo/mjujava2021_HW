import java.text.DecimalFormat;

public class ItemSales {
// 편의점에 파는 한 물품의 판매를 추적하는 클래스
	
	int num; // 판매 수량  
	double price; // 판매 가격 
	double DCprice; // 할인된 가격
	
	int bignum; // 대량 판매 수량 
	double bigDCper; // 대량 판매 할인율
	
	int totalnum; // 누적 판매 수량 
	double sum; // 누적 판매 금액 
	double sumDC; // 누적 할인 금액

	// 생성자 메소드
	public ItemSales() { 
	}
	// 접근자 메소드
	public int getnum() {
		return num;
	}
	public double getprice() {
		return price;
	}
	public double getDCprice() {
		return DCprice;
	}
	public int getbignum() {
		return bignum;
	}
	public double getbigDCper() {
		return bigDCper;
	}
	public int gettotalnum() {
		return totalnum;
	}
	public double getsum() {
		return sum;
	}
	public double getsumDC() {
		return sumDC;
	}
	// 변경자 메소드
	public void setnum(int newnum) { // 도시락이 n개 팔림을 나타내는 메소드
		if(newnum > 0) {
			num = newnum;
			totalnum = totalnum + newnum; // 개수 누적시켜줌
			
			if (totalnum > this.getbignum()) {
				DCprice = this.getprice() - (this.getprice()*this.getbigDCper());
			}else {
				DCprice = this.getprice();
			}
			sum = sum + this.getDCprice()*newnum;
			sumDC = sumDC + (this.getprice()*newnum)-(this.getDCprice()*newnum);
		}
		
	}
	public void setbigDCper(double newbigDCper) {
		bigDCper = newbigDCper*0.01;
	}
	public void setprice(int newprice) {
		price = newprice;
	}
	public void setbignum(int newbignum) {
		bignum = newbignum;
	}
	public String toString() {
		String str = "";
		DecimalFormat formatter = new DecimalFormat("###,###");
		str = str + "도시락 ";
		if(this.getnum() == 1) {
			str = str + "한 개를 팔았다." + "\n";
		}else {
			str = str + this.getnum() + " 개를 팔았다." + "\n";
		}
		if(gettotalnum() > this.getbignum()) {
			str = str + "할인율이 적용되어 판매 가격은 " + formatter.format(this.getDCprice()*this.getnum()) + "원이다.\n\n";
		}else {
			str = str + "할인율이 적용되지 않아 판매 가격은 " +
		formatter.format(this.getprice()*this.getnum())
		 + "원이다.\n\n";
		}
		str = str + "누적 판매 수량 = " + gettotalnum() + "개, " + 
				"누적 판매금액 = " + getsum()+ "원, 누적 할인금액 = " + getsumDC()+"원\n";
		return str;
	}
}
