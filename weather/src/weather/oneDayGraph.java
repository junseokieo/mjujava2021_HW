package weather;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class oneDayGraph extends JPanel {
	String month[] = {"월","01","02","03","04","05","06","07","08","09","10","11","12"};
	String[] days = {"일","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20",
			"21","22","23","24","25","26","27","28","29","30","31"};
	String[] measureSpot = {"측정소","강남구","강남대로" , "강동구" ,"강변북로" , "강북구" , "강서구" ,
			"공항대로" , "관악구" , "광진구" ,"구로구" ,"금천구" , "노원구" ,"도봉구" ,"도산대로" , 
			"동대문구" ,"동작구" ,"동작대로" ,"마포구" , "서대문구" , "서초구" , "성동구" , "성북구" , 
			"송파구" , "신촌로" , "양천구" , "영등포구" , "영등포로" , "용산구" , "은평구" , "정릉로" , 
			"종로" ,	"종로구" , "중구","중랑구" , "천호대로" , "청계천로" , "한강대로" ,"홍릉로" , "화랑로"};
	String[] pollutions = {"대기오염 종류","이산화질소", "오존농도", "이산화탄소","아황산가스", "미세먼지", "초미세먼지"};
	JPanel panel1 ; //NORTH panel
	JPanel panel2 ; //center PANEL
	JComboBox monthCombo; // 1.월 2.일 3.지역 4.오염 종류 
	JComboBox dayCombo;
	JComboBox regionCombo;
	JComboBox pollutionCombo;
	JLabel monthLabel;
	JLabel dayLabel;
	JButton drawGraph;
	
	JButton returnButton;
	
	public static String selectedMonth;
	public static String selectedDay;
	public static String selectedSpot;
	public static String selectedPollution;
	
	//생성자 클래스
	oneDayGraph() {
		this.setLayout(new BorderLayout(10,10));
		showNorth();
		panel2 = new JPanel();
		add(panel2, BorderLayout.CENTER);
		this.setBounds(100,100,500,500);
		this.setVisible(true);
		
	}
	
	void showNorth() {
		panel1 = new JPanel();
		
		ActionEventHandler actionHandler = new ActionEventHandler();
		monthCombo = new JComboBox(month);
		monthCombo.addActionListener(actionHandler);
		
		ActionEventHandler2 actionHandler2 = new ActionEventHandler2();
		dayCombo = new JComboBox(days);
		dayCombo.addActionListener(actionHandler2);
		
		ActionEventHandler3 actionHandler3 = new ActionEventHandler3();
		regionCombo = new JComboBox(measureSpot);
		regionCombo.addActionListener(actionHandler3);
		
		ActionEventHandler4 actionHandler4 = new ActionEventHandler4();
		pollutionCombo = new JComboBox(pollutions);
		pollutionCombo.addActionListener(actionHandler4);
		
		monthLabel = new JLabel("월");
		dayLabel = new JLabel("일");
		
		//drawGraph = new JButton("오염 확인");
		//drawGraph.addActionListener(new ActionListener());
		
		
		ButtonEventHandler eventHandler = new ButtonEventHandler();
		returnButton = new JButton("오염을 확인");
		returnButton.addActionListener(eventHandler);
		
		
		panel1.add(monthCombo);
		panel1.add(monthLabel);
		panel1.add(dayCombo);
		panel1.add(dayLabel);
		panel1.add(regionCombo);
		panel1.add(pollutionCombo);
		//panel1.add(drawGraph);
		
		panel1.add(returnButton);
		
		add(panel1, BorderLayout.NORTH);
		
	}
	public class ActionEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JComboBox cb = (JComboBox)e.getSource();
			selectedMonth = (String)cb.getSelectedItem();
		}
	}
	public class ActionEventHandler2 implements ActionListener{
		public void actionPerformed(ActionEvent e2) {
			JComboBox cb2 = (JComboBox)e2.getSource();
			selectedDay = (String)cb2.getSelectedItem();
		}
	}
	public class ActionEventHandler3 implements ActionListener{
		public void actionPerformed(ActionEvent e3) {
			JComboBox cb3 = (JComboBox)e3.getSource();
			selectedSpot = (String)cb3.getSelectedItem();
		}
	}
	public class ActionEventHandler4 implements ActionListener{
		public void actionPerformed(ActionEvent e4) {
			JComboBox cb4 = (JComboBox)e4.getSource();
			selectedPollution = (String)cb4.getSelectedItem();
		}
	}
	
	public class ButtonEventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			System.out.print(selectedMonth+" "+selectedDay+" "+selectedSpot+" "+selectedPollution+" "+"를 호출한 결과");
			drawGraph gp = new drawGraph();
			panel2.add(gp);
		}
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		//g.drawLine(0, 0, 1000, 755);
		
		//그래프 테두리 그리기
		
		g2.setColor(Color.DARK_GRAY); // 선 색깔 
		g2.setStroke(new BasicStroke(3)); //선 두께 
		g2.drawLine(150,600,850,600);
		g2.drawLine(150, 600,  150, 130);
		
		
	}
	
}
