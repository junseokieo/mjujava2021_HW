import java.util.Random;

public class cylinder {
	// 원기둥의 부피와 표면적 계산 하는 클래스 
	public static void main(String[] args) {
		Random rand = new Random(); // random 객체 생성 
		
		int radius; // 반지름 
		int height; // 높이 
		double volume; // 부피 
		double area; // 표면적 
		
		radius = rand.nextInt(10)+1; //1~10 사이의 임의의 정수로 반지름 생성 
		height = rand.nextInt(10)+1; //1~10 사이의 임의의 정수로 높이 생성 
		
		volume = Math.PI*radius*radius*height; //부피=PI*반지름의 제곱*높이로 계산한다 
		area = 2*Math.PI*radius*height; //높이 = 2*PI*반지름*높이로 계산한다 
		
		// 반지름, 높이, 부피, 표면적을 출력한다.
		System.out.println("반지름 = "+radius);
		System.out.println("높이 = "+height);
		System.out.println("부피 = "+volume);
		System.out.println("표면적 = "+area);

	}

}
