/*package weather;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class test01 extends JFrame {

	String name[] = {"DB저장","DB연동","파일입출력","하루치 오염 그래프","하루치 오염 데이터","월별 오염 현황"};
	Container myContainer = getContentPane();
	JMenuItem[] menuItem; 
	
	public test01() {
		super("대기오염 관리 프로그램");
		JMenuBar menuBar = new JMenuBar(); //메뉴바 생성
		menuItem = new JMenuItem[6];
		
		JMenu menu1 = new JMenu("파일"); //메뉴 생성
		JMenu menu2 = new JMenu("대기오염 현황");		

		JPanel panel = new JPanel();
		menuBar.add(menu1);
		menuBar.add(menu2);
		panel.add(menuBar);
		
		//DB 저장
		menuItem[0] = new JMenuItem(name[0]);
		menuItem[0].addActionListener(new MyActionListener());
		menu1.add(menuItem[0]);
		menu1.addSeparator();
		
		//DB 불러오기
		menuItem[1] = new JMenuItem(name[1]);
		menuItem[1].addActionListener(new MyActionListener());
		menu1.add(menuItem[1]);
		menu1.addSeparator();

		//CSV메뉴 
		menuItem[2] = new JMenuItem(name[2]);
		menuItem[2].addActionListener(new MyActionListener());
		menu1.add(menuItem[2]);
		
		
		menuItem[3] = new JMenuItem(name[3]);
		menuItem[3].addActionListener(new MyActionListener());
		menu2.add(menuItem[3]);
		menu2.addSeparator();
		
		//Menu2
		menuItem[4] = new JMenuItem(name[4]);
		menuItem[4].addActionListener(new MyActionListener());
		menu2.add(menuItem[4]);
		menu2.addSeparator();
		
		menuItem[5] = new JMenuItem(name[5]);
		menuItem[5].addActionListener(new MyActionListener());
		menu2.add(menuItem[5]);
		

		//JFrame에 메뉴바 설정
		setJMenuBar(menuBar);	

		myContainer.add(panel,BorderLayout.NORTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		setBounds(350,100,1000,800);
		setAlwaysOnTop(true);
		setTitle("대기오염도 관리 프로그램");
		setVisible(true);
		setBackground(Color.WHITE);
	}

	class MyActionListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent ae) {
			JMenuItem item = (JMenuItem)ae.getSource();
			myContainer.revalidate();
			myContainer.repaint();
			myContainer.removeAll();// 새로운 놈 부르면 화면 초기화 해주는 친구
			
			if(item == menuItem[0])
			{
				
			}
			else if(item == menuItem[1])
			{
				
			}
			else if(item == menuItem[2])
			{
				
			}
			else if(item == menuItem[3])
			{
				
			}
			else if(item == menuItem[4])
			{
				
			}
			else if(item == menuItem[5])
			{
				monthtest mt = new monthtest();
				myContainer.add(mt,BorderLayout.CENTER);
			}
		}
	};
	public static void main(String[] args) {
	new test01();
	}
}*/