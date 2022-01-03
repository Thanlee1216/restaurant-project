package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import restaurantDB.RestaurantList;


public class FrameBegin extends JPanel{
	
	public FrameBegin() {
		
		RestaurantList restaurantList=new RestaurantList();

		//JPanel ����
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		setSize(400, 700);

		//�̹���
		ImageIcon imageMain = new ImageIcon("./src/������3.png");
		ImageIcon imageCategory = new ImageIcon("./src/��ƺ���.png");
		ImageIcon imageRandom = new ImageIcon("./src/��õ�ޱ�.png");
		JLabel lblImageMain = new JLabel(imageMain);
		lblImageMain.setSize(360, 700);
		lblImageMain.setLocation(20, -130);
		add(lblImageMain);

		//ī�װ�, �����̱� ��ư ����
		JButton btnCategory = new JButton(imageCategory);
		JButton btnRandom = new JButton(imageRandom);
		//�ϴ� ��ư
		JButton btnEnd = new JButton("");
		JButton btnBack = new JButton("");
		JButton btnHome = new JButton("");

		//ī�װ�, �����̱� ��ư ����(��ġ, ũ�� ��)
		btnCategory.setBackground(new Color(255, 255, 255)); 
		btnRandom.setBackground(new Color(255, 255, 255));

		btnCategory.setSize(160, 220);
		btnCategory.setBorderPainted(false); //��ư �ܰ��� �����
		btnCategory.setContentAreaFilled(false); //��ư �����ϰ� �����(�̹����� ����)
		btnCategory.setFocusPainted(false); //��ư ����ǥ�� �����
		
		btnCategory.setLocation(
				((int) getSize().getWidth() /2 -166), 
				(int) getLocation().getY() / 2 + 390);
		
		btnRandom.setSize(160, 220);
		btnRandom.setBorderPainted(false);
		btnRandom.setContentAreaFilled(false);
		btnRandom.setFocusPainted(false);
		
		btnRandom.setLocation(
				(int) btnCategory.getLocation().getX() + 165, 
				(int) btnCategory.getLocation().getY());
		
		
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
		
		
		add(btnCategory);
		add(btnRandom);
		add(btnEnd);
		add(btnBack);
		add(btnHome);
		
		//��ư �̺�Ʈ
		btnCategory.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameCategory(restaurantList));
			}
		});	
		
		btnRandom.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameRandom(restaurantList));
				
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

}
