import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

//登录界面事件处理
class KCSJDLEvent implements ActionListener{
	private KCSJDL frame;
	public KCSJDLEvent(KCSJDL frame){
		this.frame = frame;
	}
	public void actionPerformed(ActionEvent e){
		String sql = "select * from Administrator";
		String btnLabel = e.getActionCommand();
		if (btnLabel.equals("  登录  ")) {
			if((!frame.textField1.getText().equals("")) && (!frame.textField2.getText().equals(""))){
				try {
						ResultSet rs = Dataclass.executeQuery(sql); // 返回查询的结果集
						//rs.first();
						int flag = -1;
						while(rs.next()){
						if ((frame.textField1.getText().equals(rs.getString("管理员编号").trim())) && (frame.textField2.getText().equals(rs.getString("管理员密码").trim()))){
							frame.dispose();
							KCSJMain main = new KCSJMain();
							main.setVisible(true);
							main.textField_1.setText(frame.textField1.getText());
							main.textField_1.setText(frame.textField1.getText());
							main.textField_1.setEditable(false);
							main.textField_2.setText(rs.getString("管理员姓名"));
							main.textField_2.setEditable(false);
						    main.textField_3.setText(rs.getString("性别"));
						    main.textField_3.setEditable(false);
						    main.textField_4.setText(rs.getString("年龄"));
						    main.textField_4.setEditable(false);
							main.textField_5.setText(rs.getString("联系电话"));
						    main.textField_5.setEditable(false);
						    main.textField_5.setText(rs.getString("联系电话"));
						    main.textField_5.setEditable(false);
						    flag = 1;
					        }}
						if(flag == -1){
							JOptionPane.showMessageDialog(null,"登录失败！请验证您输入的管理员编号与管理员密码是否正确！","提示框",JOptionPane.INFORMATION_MESSAGE);
							//System.out.println("登录失败！请验证您输入的管理员编号与管理员密码是否正确！");
						}
						rs.close();
						Dataclass.close();
						
					 }catch(Exception e1) {
					     e1.printStackTrace();
				       }
			}
			else{
				JOptionPane.showMessageDialog(null,"管理员编号与管理员密码都不能为空！请您输入！","提示框",JOptionPane.INFORMATION_MESSAGE);
				//System.out.println("管理员编号与管理员密码都不能为空！");
			}
		}
		else if(btnLabel.equals("  注册  ")){
			
		}
	}
}

//教师版块选项卡一的事件处理
class JPanelclass1_1Event implements ActionListener{
	private JPanelclass1 J;
	public JPanelclass1_1Event(JPanelclass1 J){
		this.J = J;
	}
	public void actionPerformed(ActionEvent e){
		int b = 0;
		if((!J.ZJtextField11.getText().equals("")) && (!J.ZJtextField12.getText().equals("")) && (!J.ZJtextField32.getText().equals(""))){
			String str[] = new String[3];
			if(!J.ZJtextField21.getText().equals(""))//判断性别是否为空
				str[0] = "'男'";//str[0] = "'" + J.ZJtextField21.getText() + "'";
			else
				str[0] = "null";
			if(!J.ZJtextField21.getText().equals("")){//判断年龄是否为空
				str[1] = J.ZJtextField21.getText();
			  b = Integer.parseInt(str[1]);
			}
			else
				str[1] = "null";
			if(!J.ZJtextField21.getText().equals(""))//判断部门是否为空
				str[2] = "'" + J.ZJtextField21.getText() + "'";
			else
				str[2] = "null";
			String sql = "insert into Teacher(读者号,姓名,性别,年龄,部门,联系方式) values('" + J.ZJtextField11.getText() + "','" + J.ZJtextField12.getText() + "'," + str[0] + "," + b + "," + str[2] + ",'" + J.ZJtextField32.getText() +"')";
		    boolean result = Dataclass.executeUpdate(sql);
		    if(result){
		    	JOptionPane.showMessageDialog(null,"增加成功！","提示框",JOptionPane.INFORMATION_MESSAGE);
		    	J.ZJtextField11.setText(" ");
		    	J.ZJtextField12.setText(" ");
		    	J.ZJtextField21.setText(" ");
		    	//J.ZJtextField22.setText(" ");
		    	J.ZJtextField31.setText(" ");
		    	J.ZJtextField32.setText(" ");
		    }
		}
		else{
			JOptionPane.showMessageDialog(null,"读者号、姓名与联系方式都不能为空！请您输入！","提示框",JOptionPane.INFORMATION_MESSAGE);
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
		if(btnLabel.equals(" 查询 ")){
			System.out.println("查询");
		}
		else if(btnLabel.equals(" 删除 ")){
			System.out.println(" 删除 ");
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
		if(btnLabel.equals(" 查询该教师 ")){
			System.out.println(" 查询该教师 ");
		}
		else if(btnLabel.equals(" 修改 ")){
			System.out.println(" 修改 ");
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
		String sql1 = "use Java课程设计数据库  select * from Administrator";
		if (btnLabel.equals("  登录  ")) {
			try {
				ResultSet rs = Dataclass.executeQuery(sql1); // 返回查询的结果集
				rs.first();
				if ((F.textField1.getText().equals(rs.getString("管理员编号").trim())) && (F.textField2.getText().equals(rs.getString("管理员密码").trim()))) {
				F.dispose();
				KCSJMain main = new KCSJMain();
				main.setVisible(true);
				main.textField_1.setText(F.textField1.getText());
				main.textField_1.setEditable(false);
				main.textField_2.setText(rs.getString("管理员姓名"));
				main.textField_2.setEditable(false);
				main.textField_3.setText(rs.getString("性别"));
				main.textField_3.setEditable(false);
				main.textField_4.setText(rs.getString("年龄"));
				main.textField_4.setEditable(false);
				main.textField_5.setText(rs.getString("联系电话"));
				main.textField_5.setEditable(false);
			    }
                else if(F.textField1.getText() == null || F.textField2.getText() == null){
                	
                }
                	//System.out.println("错误！");
				/*
				 * while (rs.next()) { rs.getString("管理员编号");
				 * rs.getString("管理员密码"); //从结果集中获得查询结果 }
				 */
			   /* } catch (Exception e1) {
			    	 e1.printStackTrace();
		          }
			
       }
	}
}*/
