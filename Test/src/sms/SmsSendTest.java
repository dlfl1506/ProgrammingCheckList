package sms;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import lombok.Data;

@Data
public class SmsSendTest extends JFrame {
	private JLabel lb1, lb2;
	private JTextField tf1, tf2;
	private JButton btn1, btn2;
	private Container c;
	private GridLayout gl;

	public void initObject() {
		lb1 = new JLabel("��ȭ��ȣ");
		lb2 = new JLabel("�޽���");

		tf1 = new JTextField();
		tf2 = new JTextField();

		btn1 = new JButton("����");
		btn2 = new JButton("�ʱ�ȭ");

		gl = new GridLayout(3, 2);
		c = getContentPane();
	}

	public void initSetting() {
		setSize(500, 500);
		setTitle("��������");
		c.setLayout(gl);

		setVisible(true);
	}

	public void initBatch() {
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ExampleSend es = new ExampleSend();
				es.��������(tf1.getText(), tf2.getText());

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");

			}
		});
		c.add(lb1);
		c.add(tf1);
		c.add(lb2);
		c.add(tf2);
		c.add(btn1);
		c.add(btn2);

	}

	public SmsSendTest() {

		initObject();

		initSetting();

		initBatch();

	}

	public static void main(String[] args) {
		new SmsSendTest();
	}

}