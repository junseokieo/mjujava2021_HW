import java.util.Scanner;

public class Driver {
// BasicPayCalculator, OverPayCalculator, DangerPayCalculator를 시험하는 클래스

	public static void main(String[] args) {
		// 주말 근무 직원 주급 객체 생성, 평일 시간당 임금 10000으로 설정
		OverPayCalculator worker1 = new OverPayCalculator(10000); 
		worker1.setWorkHour(20); // 평일 근무 시간을 20시간으로 설정
		worker1.addWeekExtraWork(21); /// 평일 근무 시간을 20시간으로 설정
		worker1.setSunWorkHour(5); // 일요일 근무 시간을 5시간으로 설정
		System.out.println("주말 근무 직원의 주급: " + worker1.wage()); // 주급 출력
		
		// 위험 근무 직원 주급 객체 생성, 평일 시간당 임금 10000으로 설정
		DangerPayCalculator worker2 = new DangerPayCalculator(10000);
		worker2.setWorkHour(20); // 평일 근무 시간을 20시간으로 설정
		worker2.addWeekExtraWork(21); // 평일 근무 시간을 20시간으로 설정
		worker2.setDanger(4); // 위험 근무 시간을 4시간으로 설정
		System.out.println("위험 근무 직원의 주급: " + worker2.wage()); //주급 출력
	}

}
