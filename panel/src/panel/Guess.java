package panel;

import javax.swing.*;

public class Guess extends JFrame
{// 프레임을 나타내는 클래스
	public static void main(String[] args)
	{
		// 프레임의 제목을 ‘홀짝 맞추기 게임’으로 한다
		Guess frame = new Guess();
		frame.setTitle("홀짝 맞추기 게임");
		
		// 프레임의 우측 상단에 있는 X 표시의 닫기를 클릭하면 프로그램이 종료된다
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

	    // 패널을 만든다
      	GuessPanel newPanel = new GuessPanel();

	    // 패널을 프레임의 컨텐트 구획에 추가한다
      	frame.getContentPane().add(newPanel);

	    // 프레임을 보여준다
      	frame.pack();
      	frame.setVisible(true);
	}
}
