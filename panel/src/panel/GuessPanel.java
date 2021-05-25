package panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GuessPanel extends JPanel
{
	private long secret;	// 비밀 번호
	private boolean isEven;		// 홀짝 여부

	private JButton odd;	// 짝수 단추
	private JButton even;// 홀수 단추
	
	private JLabel correct;	// 정답 알림 레이블
	private JLabel wrong;		// 오답 알림 레이블	
	private JLabel answer;		// 비밀 번호 알림 레이블

 // 패널을 만든다
 public GuessPanel(){
	 
	 // 0부터 100 사이의 임의의 정수인 비밀 번호를 생성한다
	 Random rand = new Random();
	 secret = rand.nextInt(100);

	 // 생성된 비밀 번호가 홀수인지 아니면 짝수인지 확인한다
	 if(secret%2 == 0) {
		 isEven = true;
	 }else {
		 isEven = false;
	 }
	 System.out.println(secret);
	 System.out.println(isEven);
	 
     // 패널의 바탕색을 흰 색으로 한다
	 setBackground(Color.WHITE);
	 
     // 패널의 크기를 가로 240 픽셀, 세로 100 픽셀로 한다
	 setPreferredSize(new Dimension(240, 100));
	 
     // ‘홀수’라는 레이블을 가진 단추를 만든다
	 odd = new JButton("홀수");
	 
     // ‘짝수’라는 레이블을 가진 단추를 만든다
	 even = new JButton("짝수");

     // 단추에서 일어나는 사건을 처리할 리스너 객체를 만든다
	 ButtonListener handler = new ButtonListener();
	 
     // 홀수 단추를 리스너에 등록한다
	 odd.addActionListener(handler);
	 
     // 짝수 단추를 리스너에 등록한다
	 even.addActionListener(handler);
	 
     // 정답 알림 레이블을 만든다
	 correct = new JLabel("맞았습니다.");

     // 오답 알림 레이블을 만든다
	 wrong = new JLabel("틀렸습니다.");

     // 비밀 번호 알림 레이블을 만든다
	 answer = new JLabel("비밀번호 = " + secret);
	 // 2개의 단추를 화면에 추가한다
	 add(odd);
	 add(even);
	 
	 // 3개의 레이블을 화면에 추가한다
	 add(correct);
	 add(wrong);
	 add(answer);
	 
     // 처음에 3개의 레이블들이 화면에 보여지지 않게 한다
	 correct.setVisible(false);
	 wrong.setVisible(false);
	 answer.setVisible(false);
 }

 //  단추 누름 사건 리스너를 나타낸다
 private class ButtonListener implements ActionListener
 {
	 public void actionPerformed(ActionEvent event)
	 {
		 even.setVisible(false);
		 odd.setVisible(false);
			
		 if(event.getSource() == odd) { //홀수를 골랐을 때
			 if(isEven == false) { // 홀수면
				 correct.setVisible(true);
				 }else {
					 wrong.setVisible(true);
					 }
			 }else if(event.getSource() == even){// 짝수를 골랐을 때
				 if(isEven == true) { // 짝수면
					 correct.setVisible(true);
					 }else {
						 wrong.setVisible(true);
						 }
				 }
		 // 비밀 번호 알림 레이블을 화면에 보여지게 한다
		 answer.setVisible(true);
		 }
	 }
}