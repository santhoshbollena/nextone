import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * <applet code="UserPass" width=500 height=100>
 * </applet>
 */
public class UserPass extends JApplet
{
		JTextField jt1;
		JPasswordField jp1;
		JLabel jl1,jl2;
		JButton jb;
		public void init()
		{
			try
			{
				SwingUtilities.invokeAndWait(new Runnable()
				{
					public void run()
					{
						makeGUI();
					}
				});
			}
			catch(Exception r)
			{}
		}
		public void makeGUI()
		{
			setLayout(new FlowLayout());
			jb=new JButton();
			add(jb);
			jt1=new JTextField(15);
			add(jt1);
			jp1=new JPasswordField(15);
			jp1.setEchoChar('$');
			add(jp1);
			jl1=new JLabel("username   ");
			add(jl1);
			jl2=new JLabel("password   ");
			add(jl2);
			//jt1.addActionListener(arg0);
			jb.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					jl1.setText(jt1.getText());
					jl2.setText(jp1.getText());
				}
			}
					);
			
		}

}
