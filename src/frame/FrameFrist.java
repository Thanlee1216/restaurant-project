package frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameFrist extends JPanel {
	JLabel foodImageLable;

	public FrameFrist() {

		// JPanel ����
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		setSize(400, 700);

		// �̹���
		ImageIcon imageMain = new ImageIcon("./src/������3.png");
		ImageIcon imageStart = new ImageIcon("./src/Start.png");
		JLabel lblImageMain = new JLabel(imageMain);
		lblImageMain.setSize(363, 700);
		lblImageMain.setLocation(19, -130);
		

		
		ImageIcon label_restaurant = new ImageIcon("�����̱���1.jpg");
		foodImageLable = new JLabel(label_restaurant);
		foodImageLable.setSize(363, (142+75));
		foodImageLable.setLocation(19, 348);
		add(lblImageMain);
		add(foodImageLable);
		
		(new homeImageThread()).start();
		
		JButton btnStart = new JButton(imageStart);
		btnStart.setBackground(new Color(255, 255, 255));

		btnStart.setSize(160, 40);
		btnStart.setBorderPainted(false); // ��ư �ܰ��� �����
		btnStart.setContentAreaFilled(false); // ��ư �����ϰ� �����(�̹����� ����)
		btnStart.setFocusPainted(false); // ��ư ����ǥ�� �����
		
		btnStart.setLocation(
				((int) getSize().getWidth() / 2 - 77), 
				(int) getLocation().getY() / 2 + 578);

		add(btnStart);
		// �ϴ� ��ư
		JButton btnEnd = new JButton("");
		JButton btnBack = new JButton("");
		JButton btnHome = new JButton("");
		
		btnEnd.setSize(50, 50);
		btnEnd.setBorderPainted(false);
		btnEnd.setContentAreaFilled(false);
		btnEnd.setFocusPainted(false);
		
		btnEnd.setLocation(
				((int) getSize().getWidth() /2 + 90),
				(int) getLocation().getY() / 2 + 630);
		
		
		btnBack.setSize(50, 50);
		btnBack.setBorderPainted(false);
		btnBack.setContentAreaFilled(false);
		btnBack.setFocusPainted(false);
		
		btnBack.setLocation(
				((int) getSize().getWidth() /2 -27), 
				(int) getLocation().getY() / 2 + 630);
		
		
		btnHome.setSize(50, 50);
		btnHome.setBorderPainted(false);
		btnHome.setContentAreaFilled(false);
		btnHome.setFocusPainted(false);
		
		btnHome.setLocation(
				((int) getSize().getWidth() /2 -138), 
				(int) getLocation().getY() / 2 + 630);
		
		
		add(btnEnd);
		add(btnBack);
		add(btnHome);




		btnStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameBegin());

			}
		});
		
		btnEnd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameFrist());
				
			}
		});
		
		btnHome.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameFrist());
				
			}
		});

	}
	class homeImageThread extends Thread {
	    public void run() {
	        String[] imgs = {"�����̱���1.jpg","�����̱���2.jpg","�����̱���3.jpg","�����̱���4.jpg","�����̱���5.jpg","�����̱���6.jpg"};
	        while (true) {
	            for (int i = 0; i < imgs.length; i++) {
	                try {
	                    Thread.sleep(1000);
	                    ImageIcon icon = new ImageIcon(imgs[i]);
//	                    foodImageLable = new JLabel(icon);
//	                    foodImageLable.setSize(375, 142);
//	            		foodImageLable.setLocation(0, 375);
//	                    //add(foodImageLable);
	            		foodImageLable.setIcon(icon);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }
	}

}


