import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Test1 extends JFrame implements ActionListener{
	private JPanel Jpanel;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
    private JTextField textField_5;
    public Test1(){
    	try{// ����Windows�۸�
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		    }catch(Exception e){
			System.out.println("Look and Feel Exception");
			System.exit(0);
		}
    	setTitle("ͼ�����ϵͳ");
    	setBounds(100, 100, 950, 620);
    	setResizable(false);
    	Container con=getContentPane();
    
    	String str[] = {"��ʦ��Ϣ����","ͼ����Ϣ����","  ����Ǽ�   ","  ����Ǽ�   ","   �߻�     "};
		String Pfilename[] = {"images/p1.png","images/p2.png","images/p3.png","images/p4.png","images/p5.png"};
		JButton Jbutton[] = new JButton[str.length];
		JButton jb = new JButton("��ʦ��Ϣ����");
		for(int i = 1;i < str.length;i++){
			Jbutton[i] = new JButton(str[i]);
			Jbutton[i].setIcon(new ImageIcon(Pfilename[i]));
			Jbutton[i].setHorizontalTextPosition(JButton.CENTER);
			Jbutton[i].setVerticalTextPosition(JButton.BOTTOM);        
		}
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		for(int i = 1;i < str.length;i++){
			//Jpanel.add(new Label(" "));
			panel.add(Jbutton[i]);
		}
		panel.add(jb);
		
		JPanel jpanel = new  JPanel();
		jpanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		jpanel.setLayout(new BoxLayout(jpanel, BoxLayout.Y_AXIS));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "��ӭʹ��ͼ�����ϵͳ", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		jpanel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "���ã���ӭ��¼ͼ�����ϵͳ", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		jpanel.add(panel_2);
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(5, 1, 0, 0));
		panel_2.add(jp);
		
		String str1[] = {"����Ա��ţ�","����Ա������","   �Ա�   ","   ���䣺   "," ��ϵ�绰�� "};
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
		
		Jpanel = new JPanel();
		Jpanel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("images/picture.jpg"));
		Jpanel.add(lblNewLabel);
		
		con.add(panel,"North");
		con.add(jpanel,"West");
		con.add(Jpanel,"Center");
		
		jb.addActionListener(this);
	}
    public void actionPerformed(ActionEvent e){
    	String btnLabel=e.getActionCommand();
		if (btnLabel.equals("��ʦ��Ϣ����")){
			Jpanel.removeAll();
			//getContentPane().add(new JPanelclass(),"Center");//this.
		}
    }
    public static void main(String []args){
    	Test1 frame = new Test1();
    	frame.setVisible(true);
    }
   
}
