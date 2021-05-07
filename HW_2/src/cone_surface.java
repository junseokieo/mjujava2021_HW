import java.util.Scanner;

public class cone_surface {

	public static void main(String[] args) {
		//원뿔의 부피와 표면적을 계산하는 클래스 
		Scanner scan = new Scanner(System.in); //입력받기 위해 Scanner 객체 생성 
		
		double radius; //반지름 길이.
		double height; // 원뿔의 높이.
		double volume; // 원뿔의 부피.
		double area; // 원뿔의 표면적.
		
		System.out.println("원뿔 밑의 원의 반지름을 입력하시오."); 
		
		radius = scan.nextInt(); //반지름의 길이를 입력받는다.
		
		System.out.println("원뿔의 높이를 입력하시오.");
		
		height = scan.nextInt(); //높이를 입력 받는다.
		
		volume = Math.PI*radius*radius*height; // 부피 = PI*반지름*반지름*높이 로 계산한다.
		
		area = Math.PI*Math.sqrt((radius*radius)+(height*height))
				+ Math.PI*radius*radius; // 표면적=PI*((반지름*반지름)+(높이*높이))의 제곱근+PI*반지름*반지름 으로 계산한다.
		
		//원뿔의 반지름, 높이, 부피, 표면적을 출력한다.
		System.out.println("원뿔 밑의 원의 반지름 = "+radius);
		System.out.println("원뿔의 높이 = "+height);
		System.out.println("원뿔의 부피 = "+volume);
		System.out.println("원뿔의 표면적 = " +area);
	}
}
