
public class OverPayCalculator extends BasicPayCalculator{
	int satWorkHour; // 토요일 근무 시간
	int sunWorkHour; // 일요일 근무 시간
	
	public OverPayCalculator(int newWeekHourWage) {
		super(newWeekHourWage);
		setSatWorkHour(0);
		setSunWorkHour(0);
	}
	// 주말 근무 직원의 토요일 근무 시간을 주어진 값으로 변경할 수 잇어야 한다.
	public void setSatWorkHour(int newSatWorkHour) {
		this.satWorkHour = newSatWorkHour;
	}
	// 주말 근무 직원의 일요일 근무 시간을 주어진 값으로 변경할 수 잇어야 한다.
	public void setSunWorkHour(int newSunWorkHour) {
		this.sunWorkHour = newSunWorkHour;
	}
	// 주말 근무 직원의 주급을 계산한다. 토요일 근무시 시간당 임금이 평일보다 2배, 일요일 근무시 평일 보다 3배.
	public double wage() {
		if(weekWorkHour <= 40){
			this.weekPay = weekHourWage * weekWorkHour;
		}else{
			this.weekPay = 40 * weekHourWage + (weekWorkHour - 40) * weekHourWage * 1.5;
		}if(satWorkHour != 0) {
			this.weekPay += satWorkHour* (weekHourWage * 2);
		}else {
			this.weekPay += sunWorkHour* (weekHourWage * 3);
		}
		return this.weekPay;
	}
	
}
