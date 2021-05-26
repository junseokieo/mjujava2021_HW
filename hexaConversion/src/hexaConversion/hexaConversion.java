package hexaConversion;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hexaConversion extends JPanel{
// 패널을 나타내는 클래스
	private JLabel inputMessage; // 입력 메세지 레이블
	private JLabel resultMessage; // 결과 메세지 레이블
	private JButton activate; // 변환 버튼
	private JTextField tenNum; // 십진수의 양의정수를 입력하는 텍스트 필드
	
	public hexaConversion() {// 생성자 메소드
		
		// 화면 설정	
		setBackground(Color.white);
		setPreferredSize(new Dimension(300, 200));
		
		inputMessage = new JLabel("양의 정수를 입력하세요");
		resultMessage = new JLabel();
		activate = new JButton("16진수로 변환");
		tenNum = new JTextField(10);
		
		// 리스너 객체 변수
		ButtonListener handler = new ButtonListener();
		
		activate.addActionListener(handler);
		
		// 각 레이블과 버튼, 텍스트 필드를 추가한다.
		add(inputMessage);
		add(tenNum);
		add(activate);
		add(resultMessage);
		
		resultMessage.setVisible(false);
	}
	// 버튼을 누른 것에 대한 이벤트 처리
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			String hexa = ""; // 16진수로 변환한 값
			if (event.getSource() == activate) { // activate가 눌렸을 경우
				hexa = Integer.toHexString(Integer.parseInt(tenNum.getText())).toUpperCase();
			}
			resultMessage.setText(hexa);
			resultMessage.setVisible(true);
		}
	}
}
