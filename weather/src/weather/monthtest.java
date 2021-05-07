package weather;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class monthtest extends JPanel{
	String year = "2018";
	String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
	String[] region = {"강남구","서초구","강동구","송파구","광진구","종로구","동대문구","..."};
	String[] pollutions = {"대기오염 종류","이산화질소", "오존농도", "이산화탄소","이황산가스", "미세먼지", "초미세먼지"};
	
	monthtest(){
		this.setLayout(new BorderLayout(10,10));
		
		showNorth();
		
		this.setBounds(1100,100,500,500);
		this.setVisible(true);
	}
	
	void showNorth() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel panel = new JPanel(new GridLayout(2,0));
		
		JLabel yr = new JLabel(year+" 년도 ");
		JComboBox reg = new JComboBox(region);
		JComboBox pollutionbox = new JComboBox(pollutions);
		JLabel text = new JLabel("평균 대기 오염 현황");
		JButton bb = new JButton("확인");
		
		p1.add(yr);
		p1.add(reg);
		p1.add(pollutionbox);
		p2.add(text);
		p2.add(bb);
		
		panel.add(p1);
		panel.add(p2);
		
		add(panel, BorderLayout.NORTH);
		
	}
	
	// 그래프 그리기
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawLine(96, 350, 420, 350); // 가로
		g.drawLine(96, 350, 96, 150); // 세로 
		
		g.drawString("1",100 , 370);
		g.drawString("2",125 , 370);
		g.drawString("3",150 , 370);
		g.drawString("4",175, 370);
		g.drawString("5",200, 370);
		g.drawString("6",225, 370);
		g.drawString("7",250, 370);
		g.drawString("8",275, 370);
		g.drawString("9",300, 370);
		g.drawString("10",330, 370);
		g.drawString("11",360, 370);
		g.drawString("12",390, 370);
	}
}
