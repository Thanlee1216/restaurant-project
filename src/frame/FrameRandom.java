package frame;

import static frame.Constant.*;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import restaurantDB.RestaurantList;

public class FrameRandom extends JPanel{
	
	public FrameRandom(RestaurantList restaurantList) {
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		setSize(400, 700);
		
		Choice md = new Choice();
		   
	    JLabel choiceName = new JLabel("��ȣ�ϴ� ����:");
	                    
	    choiceName.setSize(150,100);
	    choiceName.setLocation(60,25);
	    choiceName.setBackground(Color.BLACK);
	    choiceName.setFont(new Font("���� �߳�ü", Font.BOLD, 21));
	    add(choiceName);
	      
	      
	    md.add("���þ���");
	    md.add("������");
	    md.add("�����");
	    md.add("����������");
	      
	    md.setSize(170,0);
	    md.setLocation(212,63);
	    md.setBackground(Color.pink);
	    md.setFont(new Font("���� �߳�ü", Font.BOLD, 13));

	      
	    add(md);
		
		ImageIcon buttonImageKorean = new ImageIcon("./src/ī�װ�_�ѽ�.png");
		ImageIcon buttonImageChinese = new ImageIcon("./src/ī�װ�_�߽�.png");
		ImageIcon buttonImageJapanese = new ImageIcon("./src/ī�װ�_�Ͻ�.png");
		ImageIcon buttonImageWestern = new ImageIcon("./src/ī�װ�_���.png");
		ImageIcon buttonImageFastfood = new ImageIcon("./src/ī�װ�_�н�ƮǪ��.png");
		ImageIcon buttonImageSalad = new ImageIcon("./src/ī�װ�_������.png");
		ImageIcon buttonImageAllfood = new ImageIcon("./src/ī�װ�_����.png");
		
		JButton btnKorean = new JButton(buttonImageKorean);
		JButton btnChinese = new JButton(buttonImageChinese);
		JButton btnJapanese = new JButton(buttonImageJapanese);
		JButton btnWestern = new JButton(buttonImageWestern);
		JButton btnFastfood = new JButton(buttonImageFastfood);
		JButton btnSalad = new JButton(buttonImageSalad);
		JButton btnAllfood = new JButton(buttonImageAllfood);

		btnKorean.setSize(127, 100);
		btnKorean.setBorderPainted(false);
		btnKorean.setContentAreaFilled(false);
		btnKorean.setFocusPainted(false);
		
		btnKorean.setLocation(
				((int) getSize().getWidth() /2 -145), 
				(int) getLocation().getY() / 2 + 100);
		
		Label q1=new Label("�ѽ�");
		q1.setFont(new Font("���� �߳�ü", Font.BOLD, 18));
		q1.setLocation(((int) getSize().getWidth() /2 -145), 
				(int) getLocation().getY() / 2 + 100);
		add(q1);
		
		btnChinese.setSize(127, 100);
		btnChinese.setBorderPainted(false);
		btnChinese.setContentAreaFilled(false);
		btnChinese.setFocusPainted(false);
		
		btnChinese.setLocation(
				(int) btnKorean.getLocation().getX() + 155, 
				(int) btnKorean.getLocation().getY());
		
		btnChinese.setFont(new Font("���� �߳�ü", Font.BOLD, 18));
		
		btnJapanese.setSize(127, 100);
		btnJapanese.setBorderPainted(false);
		btnJapanese.setContentAreaFilled(false);
		btnJapanese.setFocusPainted(false);
		
		btnJapanese.setLocation(
				((int) btnKorean.getLocation().getX()), 
				(int) btnKorean.getLocation().getY() + 125);
		
		btnJapanese.setFont(new Font("���� �߳�ü", Font.BOLD, 18));
		
		btnWestern.setSize(127, 100);
		btnWestern.setBorderPainted(false);
		btnWestern.setContentAreaFilled(false);
		btnWestern.setFocusPainted(false);
		
		btnWestern.setLocation(
				(int) btnJapanese.getLocation().getX() + 155, 
				(int) btnJapanese.getLocation().getY());
		
		btnWestern.setFont(new Font("���� �߳�ü", Font.BOLD, 18));
		
		btnFastfood.setSize(127, 100);
		btnFastfood.setBorderPainted(false);
		btnFastfood.setContentAreaFilled(false);
		btnFastfood.setFocusPainted(false);
		
		btnFastfood.setLocation(
				(int) btnKorean.getLocation().getX(), 
				(int) btnJapanese.getLocation().getY() + 125);
		
		btnFastfood.setFont(new Font("���� �߳�ü", Font.BOLD, 16));
		
		btnSalad.setSize(127, 100);
		btnSalad.setBorderPainted(false);
		btnSalad.setContentAreaFilled(false);
		btnSalad.setFocusPainted(false);
		
		btnSalad.setLocation(
				(int) btnFastfood.getLocation().getX() + 155, 
				(int) btnFastfood.getLocation().getY());
		
		btnSalad.setFont(new Font("���� �߳�ü", Font.BOLD, 18));
		btnAllfood.setSize(285, 100);
		btnAllfood.setBorderPainted(false);
		btnAllfood.setContentAreaFilled(false);
		btnAllfood.setFocusPainted(false);
		
		btnAllfood.setLocation(
				(int) btnKorean.getLocation().getX(), 
				(int) btnFastfood.getLocation().getY() + 125);
		
		btnAllfood.setFont(new Font("���� �߳�ü", Font.BOLD, 18));

		add(btnKorean);
		add(btnChinese);
		add(btnJapanese);
		add(btnWestern);
		add(btnFastfood);
		add(btnSalad);
		add(btnAllfood);
		//�ϴܸ޴�
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
		
		btnKorean.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameRandomChioce(restaurantList, KOREAN, md.getSelectedItem()));
				
			}
		});
		
		btnChinese.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameRandomChioce(restaurantList, CHINESE, md.getSelectedItem()));
				
			}
		});
		
		btnJapanese.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameRandomChioce(restaurantList, JAPANESE, md.getSelectedItem()));
				
			}
		});
		
		btnWestern.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameRandomChioce(restaurantList, WESTERN, md.getSelectedItem()));
				
			}
		});
		
		btnFastfood.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameRandomChioce(restaurantList, FASTFOOD, md.getSelectedItem()));
				
			}
		});
		
		btnSalad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameRandomChioce(restaurantList, SALAD, md.getSelectedItem()));
				
			}
		});
		
		btnAllfood.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getDispose();
				FrameBase.getInstance(new FrameRandomChioce(restaurantList, RANDOM, md.getSelectedItem()));
				
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
				FrameBase.getInstance(new FrameBegin());
				
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
