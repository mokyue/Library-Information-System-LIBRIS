import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

class KCSJMain extends JFrame {//implements ActionListener
	JPanel Jpanel;
	JPanel Jpanel1;
	JPanel Jpanel2;
	JPanel Jpanel3;
	JPanel Jpanel4;
	JPanel Jpanel5;
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	JTextField textField_4;
    JTextField textField_5;
    public KCSJMain(){
    	try{// 设置Windows观感
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		    }catch(Exception e){
			System.out.println("Look and Feel Exception");
			System.exit(0);
		}
    	setTitle("图书管理系统");
    	setBounds(200, 200, 950, 620);
    	setResizable(false);
    	Container con=getContentPane();
    	
    	String str[] = {"    首页    ","教师信息管理","图书信息管理","   借书登记   ","   还书登记   ","    催还    "};
		String Pfilename[] = {"images/p6.png","images/p1.png","images/p2.png","images/p3.png","images/p4.png","images/p5.png"};
		JButton Jbutton[] = new JButton[str.length];
		for(int i = 0;i < str.length;i++){
			Jbutton[i] = new JButton(str[i]);
			Jbutton[i].setIcon(new ImageIcon(Pfilename[i]));
			Jbutton[i].setHorizontalTextPosition(JButton.CENTER);
			Jbutton[i].setVerticalTextPosition(JButton.BOTTOM);        
		}
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		for(int i = 0;i < str.length;i++){
			//Jpanel.add(new Label(" "));
			panel.add(Jbutton[i]);
		}
		
		//左边
		JPanel jpanel = new  JPanel();
		jpanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "欢迎使用图书管理系统", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		jpanel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "您好，欢迎登录图书管理系统", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		jpanel.add(panel_2);
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(5, 1, 0, 0));
		panel_2.add(jp);
		
		String str1[] = {"管理员编号：","管理员姓名：","   性别：   ","   年龄：   "," 联系电话： "};
		JPanel JP[] = new JPanel[str1.length];
		JLabel label[] = new JLabel[str1.length];
		for(int i = 0;i < str1.length;i++){
			JP[i] = new JPanel();
			label[i]= new JLabel(str1[i]);
			JP[i].add(label[i]);
			jp.add(JP[i]);
		}
		textField_1 = new JTextField();
		textField_1.setColumns(20);
		JP[0].add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(20);
		JP[1].add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(20);
		JP[2].add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(20);
		JP[3].add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(20);
		JP[4].add(textField_5);
		
		//面板
		Jpanel = new JPanel();
		Jpanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("images/picture.jpg"));
		Jpanel.add(lblNewLabel);
		
		Jpanel1 = new JPanelclass1();
		Jpanel2 = new JPanelclass2();
		Jpanel3 = new JPanelclass3();
		Jpanel4 = new JPanelclass4();
		Jpanel5 = new JPanelclass5();
		
		con.add(panel,"North");
		con.add(jpanel,"West");
		con.add(Jpanel,"Center");
		
		//注册事件侦听器
		Jbutton[0].addActionListener(new ButtonEvent(this,Jpanel));
		Jbutton[1].addActionListener(new ButtonEvent(this,Jpanel1));
		Jbutton[2].addActionListener(new ButtonEvent(this,Jpanel2));
		Jbutton[3].addActionListener(new ButtonEvent(this,Jpanel3));
		Jbutton[4].addActionListener(new ButtonEvent(this,Jpanel4));
		Jbutton[5].addActionListener(new ButtonEvent(this,Jpanel5));
	}
   /*public void actionPerformed(ActionEvent e){
    	String btnLabel=e.getActionCommand();
		if (btnLabel.equals("教师信息管理")){
			//Jpanel1.setVisible(false);
			add(Jpanel2,"Center");
			Jpanel2.setVisible(true);
		}
	}*/
    /*public static void main(String []args){
    	KCSJ frame = new KCSJ();
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }*/
   
}

//事件类
class ButtonEvent implements ActionListener {
	private KCSJMain frame;
	private JPanel jpanel;
	public ButtonEvent(KCSJMain frame,JPanel jpanel){
		this.frame = frame;
		this.jpanel = jpanel;
	}
	public void actionPerformed(ActionEvent e){
		frame.Jpanel.setVisible(false);
		frame.Jpanel1.setVisible(false);
		frame.Jpanel2.setVisible(false);
		frame.Jpanel3.setVisible(false);
		frame.Jpanel4.setVisible(false);
		frame.Jpanel5.setVisible(false);
		frame.add(jpanel,"Center");
		jpanel.setVisible(true);
	}
}
