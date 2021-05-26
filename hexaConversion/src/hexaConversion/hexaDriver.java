package hexaConversion;
import javax.swing.*;

public class hexaDriver extends JFrame{
// 프레임을 나타내는 클래스
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // 프레임 객체 참조 변수
		frame.setTitle("16 진수 변환");
		
		// 프레임의 우측 상단에 있는 X 표시의 닫기를 클릭하면 프로그램이 종료된다
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	    // 패널을 만든다
      	hexaConversion newPanel = new hexaConversion();

	    // 패널을 프레임의 컨텐트 구획에 추가한다
      	frame.getContentPane().add(newPanel);

	    // 프레임을 보여준다
      	frame.pack();
      	frame.setVisible(true);
	}
}