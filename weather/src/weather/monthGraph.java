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

public class monthGraph  extends JPanel {
	
	String[] measureSpot = {"측정소","강남구","강남대로" , "강동구" ,"강변북로" , "강북구" , "강서구" ,
			"공항대로" , "관악구" , "광진구" ,"구로구" ,"금천구" , "노원구" ,"도봉구" ,"도산대로" , 
			"동대문구" ,"동작구" ,"동작대로" ,"마포구" , "서대문구" , "서초구" , "성동구" , "성북구" , 
			"송파구" , "신촌로" , "양천구" , "영등포구" , "영등포로" , "용산구" , "은평구" , "정릉로" , 
			"종로" ,	"종로구" , "중구","중랑구" , "천호대로" , "청계천로" , "한강대로" ,"홍릉로" , "화랑로"};
	String[] pollutions = {"대기오염 종류","이산화질소", "오존농도", "이산화탄소","아황산가스", "미세먼지", "초미세먼지"};
	JPanel panel1;
	JComboBox regionCombo;
	JButton returnButton;
	JComboBox pollutionCombo;
	
	monthGraph(){
		this.setLayout(new BorderLayout());
		showNorth();
		this.setVisible(true);
	}
	
	public void showNorth() {
		panel1 = new JPanel();
		regionCombo = new JComboBox(measureSpot);
		pollutionCombo = new JComboBox(pollutions);
		
		ButtonEventHandler eventHandler = new ButtonEventHandler();
		returnButton = new JButton("오염을 확인");
		returnButton.addActionListener(eventHandler);
		
		panel1.add(regionCombo);
		panel1.add(pollutionCombo);
		panel1.add(returnButton);
		
		add(panel1, BorderLayout.NORTH);
		
	}
	private class ButtonEventHandler implements ActionListener{
		private JButton button;
		public void actionPerformed(ActionEvent e) {
			button = (JButton)e.getSource();
			
			if(button.getText().contentEquals("오염을 확인")) {
				System.out.print("이벤트는 된다.");
			}
		}
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		//g.drawLine(0, 0, 1000, 755);
		
		//그래프 테두리 그리기
		
		g.setColor(Color.DARK_GRAY); // 선 색깔 
		g2.setStroke(new BasicStroke(3)); //선 두께 
		g.drawLine(150,600,850,600);
		g.drawLine(150, 600,  150, 130);
	}
		
		
}