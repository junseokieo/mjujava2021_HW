package exceptionTime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TimeScheduler {
// 학생들의 상담일정을 잡는 클래스
	public static void main(String[] args) {
		// 변수들
		Student[] std = new Student[6]; // 상담 시간을 예약하는 학생들을 저장하기 위한 배열
		int appointmentsMade =0 ;// 상담 예약한 학생들의 수
		int number;// 학번
		String name;// 이름
		boolean made;// 상담 예약 여부
		int time; // 원하는 상담 시간
		
		// 가능한 상담시간을 보여 준다
		System.out.println("상담 시간 예약하기");
		System.out.println("가능한 상담시간: 오후 1시, 2시, 3시. 4시, 5시, 6시\n");
		Scanner scan = new Scanner(System.in); // 스캐너 객체 변수
		
		while(appointmentsMade < 6) {
			System.out.print("학생의 학번을 입력하세요: ");
			number = scan.nextInt();
			System.out.print("학생의 이름을 입력하세요: ");
			name = scan.next();
			made = false;
			
			while(!made) { // 상담이 예약되기 전까지 반복한다.
				try {
					System.out.print("원하는 상담시간<1, 2, 3, 4, 5, 6 중 선택>: ");
					
					time = scan.nextInt(); // 원하는 상담 시간을 입력받는다.
					
					if (time < 1 || time > 6) {
						throw new InvalidTimeException("선택한 시간이 범위 밖에 있음");
					}
					if (std[time-1] != null) {
						throw new TimeInUseException("선택한 시간은 이미 예약됨");
					}
					std[time-1] = new Student(number, name);
					made = true;
					appointmentsMade++;
					
				}
				catch(InvalidTimeException e){
                    System.out.println("예외 처리함: " + e.getMessage());
                }catch (TimeInUseException e){
                    System.out.println("예외 처리함: " + e.getMessage());
                }catch(InputMismatchException e) { //일반 예외처리
                	System.out.println("예외 처리함: 시간은 정수여야 합니다");
                	scan = new Scanner(System.in);
                }
				
			}
		}
		// 상담 시간 예약 목록을 출력한다
        System.out.println("\n상담 시간 예약 목록\n");
        System.out.println("상담시간\t학번\t이름");
        for(int i=0; i<6; i++) {
        	System.out.println("  "+(i+1) +"\t" +std[i].toString());
        }
        
	}

}
