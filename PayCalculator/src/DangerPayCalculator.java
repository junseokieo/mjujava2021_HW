
public class DangerPayCalculator extends BasicPayCalculator{
// 위험한 근무를 하는 직원의 평일뿐만이 아니라 위험한 근무를 포함하여 주급을 계산하는 클래스
	int dangerHour; // 위험 근무 시간
	
	public DangerPayCalculator(int newWeekHourWage) {
		super(newWeekHourWage);
		setDanger(0);
	}
	// 위험 근무 직원의 위험 근무 시간을 주어진 값으로 변경할 수 있어야 한다. 
	public void setDanger(int newDangerHour) {
		this.dangerHour = newDangerHour;
	}
	// 위험 근무 직원의 주급을 계산해야 한다.  위험 근무 직원이 위험한 일을 수행하면 시간당 임금이 평일 시간당 임금의 5배이다.
	public double wage() {
		if(weekWorkHour <= 40){
			this.weekPay = weekHourWage * weekWorkHour;
		}else{
			this.weekPay = 40 * weekHourWage + (weekWorkHour - 40) * weekHourWage * 1.5;
		}
		this.weekPay += dangerHour * (weekHourWage * 5);
		return this.weekPay;
	}
}
