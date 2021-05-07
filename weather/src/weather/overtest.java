package weather;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class overtest extends JPanel{
	JPanel p1 ;
	JComboBox reg;
	JLabel text ;
	JButton bb ;
	String[] region = {"강남구","서초구","강동구","송파구","광진구","종로구","동대문구"};
	
	overtest(){
		this.setLayout(new BorderLayout(10,10));
		this.setBounds(1100,100,500,500);
		
		showNorth();
		this.setVisible(true);
		this.setBackground(Color.WHITE);
	}
	
	void showNorth() {
		p1 = new JPanel();
		text = new JLabel("기준치 초과 대기 오염 일 수");
		
		
		
		//지역을 고르는 콤보박스 그리고 그에 대한 이벤트 
		reg = new JComboBox(region); 
		
		//확인을 누르면 콤보박스에 있는 데이터를 인덱스로 가져오고 인덱스 별 다른 값을 출력.
		bb = new JButton("확인"); 
		bb.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int index = reg.getSelectedIndex();
						if(index == 0) {
							System.out.println("강남구의 초과 일 수 = 3 ");
						}
						if(index == 1) {
							System.out.println("서초구의 초과 일 수 = 1");
						}
						if(index == 2) {
							System.out.println("강동구의 초과 일 수 = 2 ");
						}
						if(index == 3) {
							System.out.println("송파구의 초과 일 수 = 5 ");
						}
					}
		});
		
		p1.add(reg);
		p1.add(text);
		p1.add(bb);
		
		add(p1, BorderLayout.NORTH);
	}
	
	// 그래프 그리기
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g.setColor(Color.BLACK); // 선 색깔 
		g2.setStroke(new BasicStroke(3)); //선 두께 
		
		g.drawLine(96, 350, 420, 350); // 가로
		g.drawLine(96, 350, 96, 150); // 세로 
		
		// x좌표 이름
		g.drawString("이산화질소",96 , 370);
		g.drawString("오존",155 , 370);
		g.drawString("이산화탄소",183 , 370);
		g.drawString("이황산가스",243 , 370);
		g.drawString("미세먼지",305, 370);
		g.drawString("초미세먼지",355, 370);
	}
	
}
