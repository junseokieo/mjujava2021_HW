package panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessPanel extends JPanel
{
	// 객체 변수들
 private long secretNumber;	// 비밀 번호
 private boolean isEven;		// 홀짝 여부

 private JButton oddGuessButton;	// 짝수 단추
 private JButton evenGuessButton;// 홀수 단추

 private JLabel correctLabel;	// 정답 알림 레이블
 private JLabel wrongLabel;		// 오답 알림 레이블

 private JLabel answerLabel;		// 비밀 번호 알림 레이블

 // 패널을 만든다
 public GuessPanel()
 {
		// 0부터 100 사이의 임의의 정수인 비밀 번호를 생성한다
   		// 여기에 코드를 삽입하세요

		// 생성된 비밀 번호가 홀수인지 아니면 짝수인지 확인한다
   		// 여기에 코드를 삽입하세요

     // 패널의 바탕색을 흰 색으로 한다
   		// 여기에 코드를 삽입하세요

     // 패널의 크기를 가로 240 픽셀, 세로 100 픽셀로 한다
   		// 여기에 코드를 삽입하세요

     // ‘홀수’라는 레이블을 가진 단추를 만든다
   		// 여기에 코드를 삽입하세요

     // ‘짝수’라는 레이블을 가진 단추를 만든다
   		// 여기에 코드를 삽입하세요


     // 단추에서 일어나는 사건을 처리할 리스너 객체를 만든다
   		// 여기에 코드를 삽입하세요

     // 홀수 단추를 리스너에 등록한다
   		// 여기에 코드를 삽입하세요

     // 짝수 단추를 리스너에 등록한다
   		// 여기에 코드를 삽입하세요

     // 정답 알림 레이블을 만든다
   		// 여기에 코드를 삽입하세요

     // 오답 알림 레이블을 만든다
   		// 여기에 코드를 삽입하세요

     // 비밀 번호 알림 레이블을 만든다
   		// 여기에 코드를 삽입하세요

     // 처음에 3개의 레이블들이 화면에 보여지지 않게 한다
   		// 여기에 코드를 삽입하세요

     // 2개의 단추를 화면에 추가한다
   		// 여기에 코드를 삽입하세요


     // 3개의 레이블을 화면에 추가한다
   		// 여기에 코드를 삽입하세요
 }

	//  단추 누름 사건 리스너를 나타낸다
 private class ButtonListener implements ActionListener
 {
		public void actionPerformed(ActionEvent event)
		{
			// 사건이 발생한 컴포넌트가 단추이고
			// 정답을 맞추었으면 정답 알림 레이블을 화면에 보여지게 한다.
			// 맞추지 못했으면 오답 알림 레이블을 화면에 보여지게 한다.
   			// 여기에 코드를 삽입하세요

         // 비밀 번호 알림 레이블을 화면에 보여지게 한다
   			// 여기에 코드를 삽입하세요

         // 정답 알림 레이블이 화면에 보여지지 않게 한다
   			// 여기에 코드를 삽입하세요

         // 오답 알림 레이블이 화면에 보여지지 않게 한다
   			// 여기에 코드를 삽입하세요
		}
 }
}