package weather;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class daytest extends JPanel{
		String[] year = {"2018"};
		String[] month = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String[] days = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24","25","26","27","28","29","30","31"};
		String[] pollutions = {"대기오염 종류","이산화질소", "오존농도", "이산화탄소","이황산가스", "미세먼지", "초미세먼지"};
		String regionValue[][] = {{"강남구","1","2","3","4","5","6"},
				{"서초구","1","2","3","4","5","6"},
				{"종로구","1","2","3","4","5","6"},
				{"송파구","1","2","3","4","5","6"},
				{"광진구","1","2","3","4","5","6"},
				{"성동구","1","2","3","4","5","6"}};
		
		//생성자 메솓 
		daytest(){
			this.setLayout(new BorderLayout(10,10));
			
			showNorth();
			showTable();
			
			this.setBounds(1100,100,500,500);
			this.setVisible(true);
			}
			
		// NORTH BORDER
		void showNorth(){
				
			JPanel p1 = new JPanel();
			JPanel p2 = new JPanel();
			JPanel panel = new JPanel(new GridLayout(2,0));
			
			JLabel title = new JLabel("- 지역별");
			
			JComboBox pollutionbox = new JComboBox(pollutions);
			
			JLabel title2 = new JLabel("하루 오염 현황 -");
			
			JLabel lb = new JLabel("날짜 :");
			
			JComboBox yearbox = new JComboBox(year);
			
			JLabel yr = new JLabel("년");
			
			JComboBox monthbox = new JComboBox(month);
			
			JLabel mo = new JLabel("월");
			
			JComboBox daybox = new JComboBox(days);
			
			JLabel dy = new JLabel("일");
			
			JButton enter = new JButton("확인");
			
			p1.add(title);
			p1.add(pollutionbox);
			p1.add(title2);
			p2.add(lb);
			p2.add(yearbox);
			p2.add(yr);
			p2.add(monthbox);
			p2.add(mo);
			p2.add(daybox);
			p2.add(dy);
			p2.add(enter);
			
			panel.add(p1);
			panel.add(p2);
			
			add(panel, BorderLayout.NORTH);
			
			}
		
			
		// 그래프 그리기
		public void paint(Graphics g) {
			super.paint(g);
			
			g.drawLine(96, 350, 420, 350); // 가로
			g.drawLine(96, 350, 96, 150); // 세로 
			g.drawString("이산화질소",96 , 370);
			g.drawString("오존",155 , 370);
			g.drawString("이산화탄소",183 , 370);
			g.drawString("이황산가스",243 , 370);
			g.drawString("미세먼지",305, 370);
			g.drawString("초미세먼지",355, 370);
		}
		
		// table 그리기
		void showTable() {
			JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
			
			JTable tb = new JTable(regionValue,pollutions);
			JScrollPane sp = new JScrollPane(tb);
			tb.setSize(100,100);
			sp.setPreferredSize(new Dimension(450,100));
			
			panel.add(sp);
			
			add(panel, BorderLayout.SOUTH);
		}
		
}
