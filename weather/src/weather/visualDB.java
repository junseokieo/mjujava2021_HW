package weather;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class visualDB extends JPanel {
	String month[] = {"월","01","02","03","04","05","06","07","08","09","10","11","12"};
	String[] days = {"일","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20",
			"21","22","23","24","25","26","27","28","29","30","31"};
	String[] measureSpot = {"측정소","강남구","강남대로" , "강동구" ,"강변북로" , "강북구" , "강서구" ,
			"공항대로" , "관악구" , "광진구" ,"구로구" ,"금천구" , "노원구" ,"도봉구" ,"도산대로" , 
			"동대문구" ,"동작구" ,"동작대로" ,"마포구" , "서대문구" , "서초구" , "성동구" , "성북구" , 
			"송파구" , "신촌로" , "양천구" , "영등포구" , "영등포로" , "용산구" , "은평구" , "정릉로" , 
			"종로" ,	"종로구" , "중구","중랑구" , "천호대로" , "청계천로" , "한강대로" ,"홍릉로" , "화랑로"};
	JPanel panel1;
	JComboBox monthCombo; // 1.월 2.일 3.지역 4.오염 종류 
	JComboBox dayCombo;
	JComboBox regionCombo;
	JLabel monthLabel;
	JLabel dayLabel;
	JButton returnButton;
	
	visualDB(){
		this.setLayout(new BorderLayout());
		showNorth();
		
		this.setVisible(true);
	}
	
	public void showNorth() {
		panel1 = new JPanel();
		monthCombo = new JComboBox(month);
		dayCombo = new JComboBox(days);
		regionCombo = new JComboBox(measureSpot);
		
		monthLabel = new JLabel("월");
		dayLabel = new JLabel("일");
		
		ButtonEventHandler eventHandler = new ButtonEventHandler();
		returnButton = new JButton("오염을 확인");
		returnButton.addActionListener(eventHandler);
		
		panel1.add(monthCombo);
		panel1.add(monthLabel);
		panel1.add(dayCombo);
		panel1.add(dayLabel);
		panel1.add(regionCombo);
		
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
}