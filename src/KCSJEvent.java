import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

//��¼�����¼�����
class KCSJDLEvent implements ActionListener{
	private KCSJDL frame;
	public KCSJDLEvent(KCSJDL frame){
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e){
		String sql = "select * from Administrator";
		String btnLabel = e.getActionCommand();
		if (btnLabel.equals("  ��¼  ")) {
			if((!frame.textField1.getText().equals("")) && (!frame.textField2.getText().equals(""))){
				try {
						ResultSet rs = Dataclass.executeQuery(sql); // ���ز�ѯ�Ľ����
						//rs.first();
						int flag = -1;
						while(rs.next()){
						if ((frame.textField1.getText().equals(rs.getString("����Ա���").trim())) && (frame.textField2.getText().equals(rs.getString("����Ա����").trim()))){
							frame.dispose();
							KCSJMain main = new KCSJMain();
							main.setVisible(true);
							main.textField_1.setText(frame.textField1.getText());
							main.textField_1.setText(frame.textField1.getText());
							main.textField_1.setEditable(false);
							main.textField_2.setText(rs.getString("����Ա����"));
							main.textField_2.setEditable(false);
						    main.textField_3.setText(rs.getString("�Ա�"));
						    main.textField_3.setEditable(false);
						    main.textField_4.setText(rs.getString("����"));
						    main.textField_4.setEditable(false);
							main.textField_5.setText(rs.getString("��ϵ�绰"));
						    main.textField_5.setEditable(false);
						    main.textField_5.setText(rs.getString("��ϵ�绰"));
						    main.textField_5.setEditable(false);
						    flag = 1;
					        }}
						if(flag == -1){
							JOptionPane.showMessageDialog(null,"��¼ʧ�ܣ�����֤������Ĺ���Ա��������Ա�����Ƿ���ȷ��","��ʾ��",JOptionPane.INFORMATION_MESSAGE);
							//System.out.println("��¼ʧ�ܣ�����֤������Ĺ���Ա��������Ա�����Ƿ���ȷ��");
						}
						rs.close();
						Dataclass.close();
						
					 }catch(Exception e1) {
					     e1.printStackTrace();
				       }
			}
			else{
				JOptionPane.showMessageDialog(null,"����Ա��������Ա���붼����Ϊ�գ��������룡","��ʾ��",JOptionPane.INFORMATION_MESSAGE);
				//System.out.println("����Ա��������Ա���붼����Ϊ�գ�");
			}
		}
		else if(btnLabel.equals("  ע��  ")){
			
		}
	}
}

//��ʦ���ѡ�һ���¼�����
class JPanelclass1_1Event implements ActionListener{
	private JPanelclass1 J;
	public JPanelclass1_1Event(JPanelclass1 J){
		this.J = J;
	}
	public void actionPerformed(ActionEvent e){
		int b = 0;
		if((!J.ZJtextField11.getText().equals("")) && (!J.ZJtextField12.getText().equals("")) && (!J.ZJtextField32.getText().equals(""))){
			String str[] = new String[3];
			if(!J.ZJtextField21.getText().equals(""))//�ж��Ա��Ƿ�Ϊ��
				str[0] = "'��'";//str[0] = "'" + J.ZJtextField21.getText() + "'";
			else
				str[0] = "null";
			if(!J.ZJtextField21.getText().equals("")){//�ж������Ƿ�Ϊ��
				str[1] = J.ZJtextField21.getText();
			  b = Integer.parseInt(str[1]);
			}
			else
				str[1] = "null";
			if(!J.ZJtextField21.getText().equals(""))//�жϲ����Ƿ�Ϊ��
				str[2] = "'" + J.ZJtextField21.getText() + "'";
			else
				str[2] = "null";
			String sql = "insert into Teacher(���ߺ�,����,�Ա�,����,����,��ϵ��ʽ) values('" + J.ZJtextField11.getText() + "','" + J.ZJtextField12.getText() + "'," + str[0] + "," + b + "," + str[2] + ",'" + J.ZJtextField32.getText() +"')";
		    boolean result = Dataclass.executeUpdate(sql);
		    if(result){
		    	JOptionPane.showMessageDialog(null,"���ӳɹ���","��ʾ��",JOptionPane.INFORMATION_MESSAGE);
		    	J.ZJtextField11.setText(" ");
		    	J.ZJtextField12.setText(" ");
		    	J.ZJtextField21.setText(" ");
		    	//J.ZJtextField22.setText(" ");
		    	J.ZJtextField31.setText(" ");
		    	J.ZJtextField32.setText(" ");
		    }
		}
		else{
			JOptionPane.showMessageDialog(null,"���ߺš���������ϵ��ʽ������Ϊ�գ��������룡","��ʾ��",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}

class JPanelclass1_2Event implements ActionListener{
	private JPanelclass1 J;
	public JPanelclass1_2Event(JPanelclass1 J){
		this.J = J;
	}
	public void actionPerformed(ActionEvent e){
		String btnLabel = e.getActionCommand();
		if(btnLabel.equals(" ��ѯ ")){
			System.out.println("��ѯ");
		}
		else if(btnLabel.equals(" ɾ�� ")){
			System.out.println(" ɾ�� ");
		}
	}
}

class JPanelclass1_3Event implements ActionListener{
	private JPanelclass1 J;
	public JPanelclass1_3Event(JPanelclass1 J){
		this.J = J;
	}
	public void actionPerformed(ActionEvent e){
		String btnLabel = e.getActionCommand();
		if(btnLabel.equals(" ��ѯ�ý�ʦ ")){
			System.out.println(" ��ѯ�ý�ʦ ");
		}
		else if(btnLabel.equals(" �޸� ")){
			System.out.println(" �޸� ");
		}
	}
}
/*class KCSJDLEvent implements ActionListener {
	private KCSJDL F;
    public KCSJDLEvent(KCSJDL F) {
		this.F = F;
	}
    public void actionPerformed(ActionEvent e) {
		String btnLabel = e.getActionCommand();
		String sql1 = "use Java�γ�������ݿ�  select * from Administrator";
		if (btnLabel.equals("  ��¼  ")) {
			try {
				ResultSet rs = Dataclass.executeQuery(sql1); // ���ز�ѯ�Ľ����
				rs.first();
				if ((F.textField1.getText().equals(rs.getString("����Ա���").trim())) && (F.textField2.getText().equals(rs.getString("����Ա����").trim()))) {
				F.dispose();
				KCSJMain main = new KCSJMain();
				main.setVisible(true);
				main.textField_1.setText(F.textField1.getText());
				main.textField_1.setEditable(false);
				main.textField_2.setText(rs.getString("����Ա����"));
				main.textField_2.setEditable(false);
				main.textField_3.setText(rs.getString("�Ա�"));
				main.textField_3.setEditable(false);
				main.textField_4.setText(rs.getString("����"));
				main.textField_4.setEditable(false);
				main.textField_5.setText(rs.getString("��ϵ�绰"));
				main.textField_5.setEditable(false);
			    }
                else if(F.textField1.getText() == null || F.textField2.getText() == null){
                	
                }
                	//System.out.println("����");
				/*
				 * while (rs.next()) { rs.getString("����Ա���");
				 * rs.getString("����Ա����"); //�ӽ�����л�ò�ѯ��� }
				 */
			   /* } catch (Exception e1) {
			    	 e1.printStackTrace();
		          }
			
       }
	}
}*/
