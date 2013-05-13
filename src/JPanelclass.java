import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

class JPanelclass1 extends JPanel {
	
	//选项卡1的文本域
	JTextField ZJtextField11;
	JTextField ZJtextField12;
	JTextField ZJtextField21; 
	JTextField ZJtextField22; 
	JTextField ZJtextField31;
	JTextField ZJtextField32;
	
	
	public JPanelclass1(){
		setLayout(new BorderLayout(0, 0));
		setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		//选择面板
		JTabbedPane JT1 = new JTabbedPane(JTabbedPane.TOP);
		add(JT1);
		
		//选项卡1
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		JT1.addTab("增加教师信息", null, panel_1, null);
		
		JPanel J1 = new JPanel();
		J1.setBorder(new TitledBorder(null, "增加教师信息", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		J1.setLayout(new GridLayout(4, 1, 0, 0));
		panel_1.add(J1);
		
		JPanel Jp_1 = new JPanel();
		J1.add(Jp_1);
		JLabel Jl11 = new JLabel("读者号  ：");
		ZJtextField11 = new JTextField();
		ZJtextField11.setColumns(20);
		JLabel Jl12 = new JLabel("*必填");
		JLabel Jl13 = new JLabel("   姓    名：");
		ZJtextField12 = new JTextField();
		ZJtextField12.setColumns(20);
		JLabel Jl14 = new JLabel("*必填");
		Jp_1.add(Jl11);
		Jp_1.add(ZJtextField11);
		Jp_1.add(Jl12);
		Jp_1.add(Jl13);
		Jp_1.add(ZJtextField12);
		Jp_1.add(Jl14);
		
		JPanel Jp_2 = new JPanel();
		J1.add(Jp_2);
		JLabel Jl21 = new JLabel("性    别：");
		ZJtextField21 = new JTextField();
		ZJtextField21.setColumns(20);
		JLabel Jl23 = new JLabel("     ");
		JLabel Jl22 = new JLabel("   年    龄：");
		JTextField ZJtextField22 = new JTextField();
		JLabel Jl24 = new JLabel("     ");
		ZJtextField22.setColumns(20);
		Jp_2.add(Jl21);
		Jp_2.add(ZJtextField21);
		Jp_2.add(Jl23);
		Jp_2.add(Jl22);
		Jp_2.add(ZJtextField22);
		Jp_2.add(Jl24);
		
		JPanel Jp_3 = new JPanel();
		J1.add(Jp_3);
		JLabel Jl31 = new JLabel("部    门：");
		ZJtextField31 = new JTextField();
		ZJtextField31.setColumns(20);
		JLabel Jl32 = new JLabel("         联系方式：");
		ZJtextField32 = new JTextField();
		ZJtextField32.setColumns(20);
		JLabel Jl33 = new JLabel("*必填");
		Jp_3.add(Jl31);
		Jp_3.add(ZJtextField31);
		Jp_3.add(Jl32);
		Jp_3.add(ZJtextField32);
		Jp_3.add(Jl33);
		
		JPanel Jp_4 = new JPanel();
		J1.add(Jp_4);
		JButton Jb1 = new JButton("  增加  ");
		Jp_4.add(Jb1);
		
		//注册侦听器
		Jb1.addActionListener(new JPanelclass1_1Event(this));
		
		//选项卡2
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		JT1.addTab("删除教师信息", null, panel_2, null);
		
		JPanel J2 = new JPanel();
		J2.setBorder(new TitledBorder(null, "删除教师信息", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		J2.setLayout(new GridLayout(3, 1, 0, 0));
		panel_2.add(J2);
		
		JPanel Jp2_1 = new JPanel();
		J2.add(Jp2_1);
		JLabel Jl2_11 = new JLabel("请输入读者号：");
		JTextField textField2_11 = new JTextField();
		textField2_11.setColumns(20);
		JButton Jb2_1 = new JButton(" 查询 ");
		Jp2_1.add(Jl2_11);
		Jp2_1.add(textField2_11);
		Jp2_1.add(Jb2_1);
		
		JPanel Jp2_2 = new JPanel();
		Jp2_2.setBorder(new TitledBorder(null, "该教师的信息", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		J2.add(Jp2_2);
		
		JPanel Jp2_3 = new JPanel();
		J2.add(Jp2_3);
		JButton Jb2_2 = new JButton(" 删除 ");
		Jp2_3.add(Jb2_2);
		
		//注册侦听器
		Jb2_1.addActionListener(new JPanelclass1_2Event(this));
		Jb2_2.addActionListener(new JPanelclass1_2Event(this));
		
		//选项卡3
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		JT1.addTab("修改教师信息", null, panel_3, null);
		
		JPanel J3 = new JPanel();
		J3.setBorder(new TitledBorder(null, "修改教师信息", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		J3.setLayout(new GridLayout(2, 1, 0, 0));
		panel_3.add(J3);
		
		JPanel Jp3_1 = new JPanel();
		J3.add(Jp3_1);
		JLabel Jl3_11 = new JLabel("请输入读者号：");
		JTextField textField3_11 = new JTextField();
		textField3_11.setColumns(20);
		JButton Jb3_1 = new JButton(" 查询该教师 ");
		Jp3_1.add(Jl3_11);
		Jp3_1.add(textField3_11);
		Jp3_1.add(Jb3_1);
		
		JPanel Jp3_2 = new JPanel();
		Jp3_2.setBorder(new TitledBorder(null, "修改教师信息", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Jp3_2.setLayout(new GridLayout(4, 1, 0, 0));
		J3.add(Jp3_2);
					
		JPanel Jp3_21 = new JPanel();
		Jp3_2.add(Jp3_21);
		JLabel Jl3_21 = new JLabel("教师姓名：");
		JTextField textField3_21 = new JTextField();
		textField3_21.setColumns(20);
		JLabel Jl3_22 = new JLabel("  教师性别：");
		JRadioButton radioButton1 = new JRadioButton("男    ");
		JRadioButton radioButton2 = new JRadioButton("女    ");
		Jp3_21.add(Jl3_21 );
		Jp3_21.add(textField3_21);
		Jp3_21.add(Jl3_22);
		Jp3_21.add(radioButton1);
		Jp3_21.add(radioButton2);
		
		JPanel Jp3_22 = new JPanel();
		Jp3_2.add(Jp3_22);
		JLabel Jl3_221 = new JLabel("年    龄：");
		JTextField textField3_221 = new JTextField();
		textField3_221.setColumns(20);
		JLabel Jl3_222 = new JLabel("  部    门：");
		JTextField textField3_222 = new JTextField();
		textField3_222.setColumns(20);
		Jp3_22.add(Jl3_221);
		Jp3_22.add(textField3_221);
		Jp3_22.add(Jl3_222);
		Jp3_22.add(textField3_222);
		
		JPanel Jp3_23 = new JPanel();
		Jp3_2.add(Jp3_23);
		JLabel Jl3_231 = new JLabel("联系方式：");
		JTextField textField3_231 = new JTextField();
		textField3_231.setColumns(20);
		JLabel Jl3_232 = new JLabel("                                  ");
		Jp3_23.add(Jl3_231);
		Jp3_23.add(textField3_231);
		Jp3_23.add(Jl3_232);
		
		JPanel Jp3_24 = new JPanel();
		Jp3_2.add(Jp3_24);
		JButton Jb3_24 = new JButton(" 修改 ");
		Jp3_24.add(Jb3_24);
		
		//注册侦听器
		Jb3_1.addActionListener(new JPanelclass1_3Event(this));
		Jb3_24.addActionListener(new JPanelclass1_3Event(this));
		
		//选项卡4
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		JT1.addTab("查询教师信息", null, panel_4, null);
		
		JPanel J4 = new JPanel();
		J4.setBorder(new TitledBorder(null, "查询教师信息", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		J4.setLayout(new GridLayout(2, 1, 0, 0));
		panel_4.add(J4);
		
		JPanel Jp4_1 = new JPanel();
		J4.add(Jp4_1);
		JLabel Jl4_1 = new JLabel("请输入读者号：");
		JTextField textField4_1 = new JTextField();
		textField4_1.setColumns(20);
		JButton Jb4_1 = new JButton(" 查询该教师 ");
		Jp4_1.add(Jl4_1);
		Jp4_1.add(textField4_1);
		Jp4_1.add(Jb4_1);
		
		JPanel Jp4_2 = new JPanel();
		Jp4_2.setBorder(new TitledBorder(null, "查询结果", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		J4.add(Jp4_2);
		
	}
}

 class JPanelclass2 extends JPanel{
	public JPanelclass2(){
		setLayout(new BorderLayout(0, 0));
		setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		//选择面板
		JTabbedPane JT1 = new JTabbedPane(JTabbedPane.TOP);
		add(JT1);
		
		//选项卡1
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		JT1.addTab("增加图书信息", null, panel_1, null);
		
		JPanel J1 = new JPanel();
		J1.setBorder(new TitledBorder(null, "增加图书信息", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		J1.setLayout(new GridLayout(4, 1, 0, 0));
		panel_1.add(J1);
		
		JPanel Jp1_1 = new JPanel();
		J1.add(Jp1_1);
		JLabel Jl1_1 = new JLabel("  ISBN：");
		JTextField textField1_1 = new JTextField();
		textField1_1.setColumns(20);
		JLabel Jl1_12 = new JLabel("   书名：");
		JTextField textField1_12 = new JTextField();
		textField1_12.setColumns(20);
		Jp1_1.add(Jl1_1);
		Jp1_1.add(textField1_1);
		Jp1_1.add(Jl1_12);
		Jp1_1.add(textField1_12);
		
		JPanel Jp1_2 = new JPanel();
		J1.add(Jp1_2);
		JLabel Jl1_2 = new JLabel("出版社：");
		JTextField textField1_2 = new JTextField();
		textField1_2.setColumns(20);
		JLabel Jl1_22 = new JLabel("   价格：");
		JTextField textField1_22 = new JTextField();
		textField1_22.setColumns(20);
		Jp1_2.add(Jl1_2);
		Jp1_2.add(textField1_2);
		Jp1_2.add(Jl1_22);
		Jp1_2.add(textField1_22);
		
		JPanel Jp1_3 = new JPanel();
		J1.add(Jp1_3);
		JLabel Jl1_3 = new JLabel("类  型：");
		JTextField textField1_3 = new JTextField();
		textField1_3.setColumns(20);
		JLabel Jl1_32 = new JLabel("                               ");
		Jp1_3.add(Jl1_3);
		Jp1_3.add(textField1_3);
		Jp1_3.add(Jl1_32);
		
		JPanel Jp1_4 = new JPanel();
		J1.add(Jp1_4);
		JButton Jb1_4 = new JButton(" 增加 ");
		Jp1_4.add(Jb1_4);
		
		//选项卡2
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		JT1.addTab("删除图书信息", null, panel_2, null);
		
		JPanel J2 = new JPanel();
		J2.setBorder(new TitledBorder(null, "删除图书信息", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		J2.setLayout(new GridLayout(3, 1, 0, 0));
		panel_2.add(J2);
		
		JPanel Jp2_1 = new JPanel();
		J2.add(Jp2_1);
		JLabel Jl2_1 = new JLabel("请输入ISBN：");
		JTextField textField2_1 = new JTextField();
		textField2_1.setColumns(20);
		JButton Jb2_1 = new JButton("查询");
		Jp2_1.add(Jl2_1);
		Jp2_1.add(textField2_1);
		Jp2_1.add(Jb2_1);
		
		JPanel Jp2_2 = new JPanel();
		Jp2_2.setBorder(new TitledBorder(null, "查询结果", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		J2.add(Jp2_2);
		
		JPanel Jp2_3 = new JPanel();
		J2.add(Jp2_3);
		JButton Jb2_2 = new JButton(" 删除 ");
		Jp2_3.add(Jb2_2);
		
		//选项卡3
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		JT1.addTab("修改图书信息", null, panel_3, null);
		
		JPanel J3 = new JPanel();
		J3.setBorder(new TitledBorder(null, "修改图书信息", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		J3.setLayout(new GridLayout(2, 1, 0, 0));
		panel_3.add(J3);
		
		JPanel Jp3_1 = new JPanel();
		J3.add(Jp3_1);
		JLabel J3_1 = new JLabel("请输入ISBN：");
		JTextField textField3_1 = new JTextField();
		textField3_1.setColumns(20);
		JButton Jb3 = new JButton("查询");
		Jp3_1.add(J3_1);
		Jp3_1.add(textField3_1);
		Jp3_1.add(Jb3);
		
		JPanel Jp3_2 = new JPanel();
		Jp3_2.setBorder(new TitledBorder(null, "修改信息", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Jp3_2.setLayout(new GridLayout(3, 1, 0, 0));
		J3.add(Jp3_2);
		
		JPanel Jp3_21 = new JPanel();
		Jp3_2.add(Jp3_21);
		JLabel J3_21 = new JLabel("书  名：");
		JTextField textField3_21 = new JTextField();
		textField3_21.setColumns(20);
		JLabel J3_22 = new JLabel("  出版社：");
		JTextField textField3_22 = new JTextField();
		textField3_22.setColumns(20);
		Jp3_21.add(J3_21);
		Jp3_21.add(textField3_21);
		Jp3_21.add(J3_22);
		Jp3_21.add(textField3_22);
		
		JPanel Jp3_22 = new JPanel();
		Jp3_2.add(Jp3_22);
		JLabel J3_221 = new JLabel("价  格：");
		JTextField textField3_221 = new JTextField();
		textField3_221.setColumns(20);
		JLabel J3_222 = new JLabel("  类  型：");
		JTextField textField3_222 = new JTextField();
		textField3_222.setColumns(20);
		Jp3_22.add(J3_221);
		Jp3_22.add(textField3_221);
		Jp3_22.add(J3_222);
		Jp3_22.add(textField3_222);
		
		JPanel Jp3_23 = new JPanel();
		Jp3_2.add(Jp3_23);
		JButton Jb3_23 = new JButton(" 修改 ");
		Jp3_23.add(Jb3_23);
		
		//选项卡4
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		JT1.addTab("查询图书信息", null, panel_4, null);
		
		JPanel J4 = new JPanel();
		J4.setBorder(new TitledBorder(null, "查询图书信息", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		J4.setLayout(new GridLayout(2, 1, 0, 0));
		panel_4.add(J4);
		
		JPanel Jp4_1 = new JPanel();
		J4.add(Jp4_1);
		JLabel Jl4 = new JLabel("请输入ISBN：");
		JTextField textField14 = new JTextField();
		textField14.setColumns(20);
		JButton Jb4 = new JButton("查询");
		Jp4_1.add(Jl4);
		Jp4_1.add(textField14);
		Jp4_1.add(Jb4);
		
		JPanel Jp4_2 = new JPanel();
		Jp4_2.setBorder(new TitledBorder(null, "查询结果", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		J4.add(Jp4_2);
	}
}
 
class JPanelclass3 extends JPanel{
	public JPanelclass3(){
		setBorder(new TitledBorder(null, "图书借阅登记", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel Jp1 = new JPanel();
		add(Jp1);
		JLabel Jl11 = new JLabel("读者号  ：");
		JTextField textField11 = new JTextField();
		textField11.setColumns(20);
		JLabel Jl12 = new JLabel("     ISBN：");
		JTextField textField12 = new JTextField();
		textField12.setColumns(20);
		Jp1.add(Jl11);
		Jp1.add(textField11);
		Jp1.add(Jl12);
		Jp1.add(textField12);
		
		JPanel Jp2 = new JPanel();
		Jp2.setBorder(new TitledBorder(null, "借阅信息", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(Jp2);
		
		JPanel Jp3 = new JPanel();
		Jp3.setLayout(new GridLayout(3, 1, 0, 0));
		add(Jp3);
		JPanel Jp3_1 = new JPanel();
		Jp3.add(Jp3_1);
		JLabel Jl21 = new JLabel("当前时间：");
		JTextField textField21 = new JTextField();
		textField21.setColumns(20);
		JLabel Jl22 = new JLabel("  办理人  ：");
		JTextField textField22 = new JTextField();
		textField22.setColumns(20);
		Jp3_1.add(Jl21);
		Jp3_1.add(textField21);
		Jp3_1.add(Jl22);
		Jp3_1.add(textField22);
		JPanel Jp3_2 = new JPanel();
		Jp3.add(Jp3_2);
		JButton Jb3_2 = new JButton(" 借阅 ");
		Jp3_2.add(Jb3_2);
	}
}

class JPanelclass4 extends JPanel{
	public JPanelclass4(){
		setBorder(new TitledBorder(null, "图书归还登记", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel Jp1 = new JPanel();
		add(Jp1);
		JLabel Jl1 = new JLabel("读者号：");
		JTextField textField1 = new JTextField();
		textField1.setColumns(20);
		JButton Jb1 = new JButton(" 归还 ");
		Jp1.add(Jl1);
		Jp1.add(textField1);
		Jp1.add(Jb1);
		
		JPanel Jp2 = new JPanel();
		Jp2.setBorder(new TitledBorder(null, "归还提示", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(Jp2);
		
	}
}

class JPanelclass5 extends JPanel{
	public JPanelclass5(){
		setBorder(new TitledBorder(null, "违期催还", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel Jp1 = new JPanel();
		Jp1.setBorder(new TitledBorder(null, "过期信息", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		add(Jp1);
		
		JPanel Jp2 = new JPanel();
		add(Jp2);
		JButton Jb2 = new JButton(" 查询 ");
		Jp2.add(Jb2);
	}
}