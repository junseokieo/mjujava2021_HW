
public class BasicPayCalculator {
// 직원의 평일 근무에 대한 주급을 계산하는 클래스
	int weekHourWage;// 평일 시간당 임금
	int weekWorkHour; // 평일 근무 시간
	double weekPay; // 주급
	
	// 평일 시간당 임금을 주어진 값으로 초기화하고 
	// 평일 근무 시간은 0으로 초기화하면서 객체를 생성
	// 생성자 메소드
	public BasicPayCalculator(int newWeekHourWage) {
		setWorkHour(0);
		setHourWage(newWeekHourWage);
	}
	
	// 직원의 평일 추가 근무시간을 넘겨 받아 평일 근무시간에 더한다
	public void addWeekExtraWork(int extraTime) {
		this.weekWorkHour += extraTime;
	}
	
	// 직원의 평일 근무시간을 각각 주어진 값으로 변경
	public void setWorkHour(int newWorkHour) {
		weekWorkHour = newWorkHour;
	}
	
	// 평일 시간당 임금을 각각 주어진 값으로 변경
	public void setHourWage(int newHourWage) {
		weekHourWage = newHourWage;
	}
	
	// 직원의 주급은 주말 근무나 위험한 근무 여부가 결정되지 않아 계산을 할 수 없어 0으로 계산한다.
	public double wage() {
		this.weekPay = 0;
		return this.weekPay;
	}
	
}
