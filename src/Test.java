import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Test extends JFrame{
	private JPanel Jpanel1;
	private JPanel Jpanel2;
	public Test(){
		super("图书管理系统");
		try{// 设置Windows观感
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		    }catch(Exception e){
			System.out.println("Look and Feel Exception");
			System.exit(0);
		}
		setSize(800,600);
		setVisible(true);
		
		String str[] = {"教师信息管理","图书信息管理","  借书登记   ","  还书登记   ","   催还     "};
		String Pfilename[] = {"images/p1.png","images/p2.png","images/p3.png","images/p4.png","images/p5.png"};
		JButton Jbutton[] = new JButton[str.length];
		for(int i = 0;i < str.length;i++){
			Jbutton[i] = new JButton(str[i]);
			Jbutton[i].setIcon(new ImageIcon(Pfilename[i]));
			Jbutton[i].setHorizontalTextPosition(JButton.CENTER);
			Jbutton[i].setVerticalTextPosition(JButton.BOTTOM);        
		}
		
		JPanel Jpanel = new JPanel();
		Jpanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		Jpanel.setLayout(new BoxLayout(Jpanel, BoxLayout.X_AXIS));
		for(int i = 0;i < str.length;i++){
			//Jpanel.add(new Label(" "));
			Jpanel.add(Jbutton[i]);
		}
		
		Jpanel1 = new JPanel();
		Jpanel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Jpanel2 = new JPanel();
		Jpanel2.setLayout(new BoxLayout(Jpanel2, BoxLayout.Y_AXIS));
		Container con=getContentPane();
		//JLabel jl = new JLabel(new ImageIcon("images/picture.jpg"));
		JTabbedPane tabbedPane = new JTabbedPane();
		Jpanel1.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		JPanel panel_2 = new JPanel();
		JPanel panel_3 = new JPanel();
		JPanel panel_4 = new JPanel();
		panel_1.add(new JLabel("1"));
		panel_2.add(new JLabel("2"));
		panel_3.add(new JLabel("3"));
		panel_4.add(new JLabel("4"));
		
		tabbedPane.addTab("增加教师资料信息",panel_1);
		tabbedPane.addTab("删除教师资料信息",panel_2);
		tabbedPane.addTab("修改教师资料信息",panel_3);
		tabbedPane.addTab("查找教师资料信息",panel_4);
		
		
		
		
		
		
		
		
		/*TitledBorder TB1 = BorderFactory.createTitledBorder("欢迎使用图书管理系统");
		TB1.setTitleJustification(TitledBorder.CENTER);
		TitledBorder TB2 = BorderFactory.createTitledBorder("您好，欢迎登录图书管理系统");
		TB2.setTitleJustification(TitledBorder.CENTER);*/
		JPanel jl1 = new JPanel();
		jl1.setBorder(new TitledBorder(null, "欢迎使用图书管理系统", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Jpanel2.add(jl1);
		JPanel jl2 = new JPanel();
		jl2.setBorder(new TitledBorder(null, "您好，欢迎登录图书管理系统", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		Jpanel2.add(jl2);
		con.add(Jpanel,"North");
		con.add(Jpanel1,"West");
		con.add(Jpanel2,"Center");
		//pack();
		/*jpanel1 = new JPanel();
		jpanel2 = new JPanel();
		jpanel1.setSize(200,700);
		JPanel jp = new JPanel();
		jp.setLayout(new BoxLayout(jp, BoxLayout.X_AXIS));
        JButton jb1 = new JButton("教师信息管理");
        jb1.setIcon(new ImageIcon("images/20090908214230636.png"));
        jb1.setHorizontalTextPosition(JButton.CENTER);
        jb1.setVerticalTextPosition(JButton.BOTTOM);
        JButton jb2 = new JButton(new ImageIcon("images/20090908214231417.png"));
		JButton jb3 = new JButton(new ImageIcon("images/20090908214230346.png"));
		JButton jb4 = new JButton(new ImageIcon("images/20090908214231866.png"));
		JButton jb5 = new JButton(new ImageIcon("images/20090908214231936.png"));
		JLabel jl = new JLabel(new ImageIcon("images/picture.jpg"));
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jpanel2.add(jl);
		con.add("North",jp);
		con.add("East",jpanel1);
		con.add(jpanel2,"West");
		pack();*/
	}
	public static void main(String []args){
		Test t = new Test();
	}
}
