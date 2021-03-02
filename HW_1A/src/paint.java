import java.util.Scanner;

public class paint {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
		System.out.println("사무실의 가로 길이를 입력하세요: ");
		double horizon = scan.nextInt();
		System.out.println("사무실의 세로 길이를 입력하세요: ");
		double vertical = scan.nextInt();
		System.out.println("사무실의 높이를 입력하세요: ");
		double height = scan.nextInt();
		System.out.println("가로: "+horizon);
		System.out.println("세로: "+vertical);
		System.out.println("높이: "+height);
		double area = (horizon*vertical)+(2*horizon*height)+(2*vertical*height);
		System.out.println("총 면적: "+ area);
		System.out.println("페인트 통수: "+(area/500));	
	}
}