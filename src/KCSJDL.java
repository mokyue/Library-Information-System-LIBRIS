import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class KCSJDL extends JFrame{
	JTextField textField1;
    JPasswordField textField2;
    public KCSJDL(){
    	try{// 设置Windows观感
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		    }catch(Exception e){
			System.out.println("Look and Feel Exception");
			System.exit(0);
		}
		setTitle("图书管理系统登录界面");
	  	setBounds(500, 300,  380, 300);
	   	setResizable(false);  
	   	Container con=getContentPane();
	   	
	   	JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("images/head.jpg"));
		
		JPanel Jpanel1 = new JPanel();
		Jpanel1.setLayout(new GridLayout(2, 1, 0, 0));
		JPanel Jpanel1_1 = new JPanel();
		Jpanel1_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
		Jpanel1.add(Jpanel1_1);
		JLabel lblNewLabel2 = new JLabel(" 管理员编号：");
		Jpanel1_1.add(lblNewLabel2);
		textField1 = new JTextField();
		Jpanel1_1.add(textField1);
		textField1.setColumns(25);
		
		JPanel Jpanel1_2 = new JPanel();
		Jpanel1_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));
		Jpanel1.add(Jpanel1_2);
		JLabel label_1 = new JLabel(" 管理员密码：");
		Jpanel1_2.add(label_1);
		textField2 = new JPasswordField();
		Jpanel1_2.add(textField2);
		textField2.setColumns(25);
		
		JPanel Jpanel2 = new JPanel();
		JLabel label = new JLabel("                         ");
		JButton button1 = new JButton("  登录  ");
		JButton button2 = new JButton("  注册  ");
		Jpanel2.add(label);
		Jpanel2.add(button1);
		Jpanel2.add(button2);
		
		con.add(lblNewLabel,"North");
		con.add(Jpanel1,"Center");
		con.add(Jpanel2,"South");
		
		button1.addActionListener(new KCSJDLEvent(this));
	}
    public static void main(String []args){
    	KCSJDL test = new KCSJDL();
    	test.setVisible(true);
    	test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
