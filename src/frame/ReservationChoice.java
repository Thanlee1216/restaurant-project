package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import static frame.Constant.PLACE_NAME_BASIC;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import restaurantDB.RestaurantList;

public class ReservationChoice extends JPanel{
	
	
	public ReservationChoice(RestaurantList restaurantList, String categoryName, String mood, int i) {
		//��׶��� ����
		setBackground(new Color(255, 192, 203));
		setLayout(null);
		setSize(400, 700);
		
		//(�� ������)���� �̹��� ����
		JLabel fImage=new JLabel(HtmlUtils.imgHtmlParser(restaurantList.Info().get(i).getImageUrl()));
        fImage.setSize(364,280);
        fImage.setLocation(18,70);
        add(fImage);
        
        
        JLabel choiceName = new JLabel(PLACE_NAME_BASIC+restaurantList.Info().get(i).getPlaceName());
        
	    choiceName.setSize(400,20);
	    choiceName.setLocation(40,370);
	    choiceName.setBackground(Color.BLACK);
	    choiceName.setFont(new Font("���� �߳�ü", Font.BOLD, 21));
	    add(choiceName);
        
        
        
        
        //����ð��� �и�
        long time = System.currentTimeMillis();
        
       SimpleDateFormat dayTime=new SimpleDateFormat("MM�� dd��(EE)");
       String str=dayTime.format(new Date(time)); 
       
        Choice reserTime=new Choice();
        String[] timeSlot= {
        		"�ð��� ����",
        		str+"09:00AM",
        		str+"10:00AM",
        		str+"11:00AM",
        		str+"12:00PM",
        		str+"13:00PM",
        		str+"14:00PM",
        		str+"15:00PM",
        		str+"16:00PM",
        		str+"17:00PM",
        		str+"18:00PM",
        		str+"19:00PM",
        		str+"20:00PM"	
        		
        };//��Ʈ�� �迭(����ð�)
        
        for (int j = 0; j < timeSlot.length; j++) {
        	reserTime.add(timeSlot[j]);
		}
        
        //�ο��� �迭
        Choice NOpeople=new Choice();
        String[] NOpeopleList= {
        		"�ο��� ����",
        		"1��",
        		"2��",
        		"3��",
        		"4��",
        		"5��",
        		"6��",
        		
        			
        		
        };//��Ʈ�� �迭(�ο���)
        
        for (int j = 0; j < NOpeopleList.length; j++) {
        	NOpeople.add(NOpeopleList[j]);
        	
		}
        
        
        
        reserTime.setFont(new Font("��������ڵ�",Font.BOLD,16));
        reserTime.setSize(340,190);
        reserTime.setLocation(43,400);
        add(reserTime);
        
        NOpeople.setFont(new Font("��������ڵ�",Font.BOLD,16));
        NOpeople.setSize(340,190);
        NOpeople.setLocation(43,450);
        add(NOpeople);
        
        
      //�ϴܸ޴�
      		JButton btnEnd = new JButton("");
      		JButton btnBack = new JButton("");
      		JButton btnHome = new JButton("");
      		
      	//�����ư ����
    		ImageIcon imageReservation = new ImageIcon("./src/����Ϸ�.png");
    		JButton reserButton =new JButton(imageReservation);
    		//�����ư ����
    		reserButton.setSize(220,90);
    		reserButton.setBorderPainted(false);
    		reserButton.setContentAreaFilled(false);
    		reserButton.setFocusPainted(false);
    		reserButton.setLocation(90,515);
    		add(reserButton);
      		

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
      		add(reserButton);
      		
      		//��ư�׼�
      		
      			reserButton.addActionListener(new ActionListener() {
      			
      			@Override
      			public void actionPerformed(ActionEvent e) {
      				if(reserTime.getSelectedItem().equals("�ð��� ����")) 
      					JOptionPane.showMessageDialog(null,"�ð��븦 ������ �ּ���");
      				else {
      					if(NOpeople.getSelectedItem().equals("�ο��� ����")) {
      						JOptionPane.showMessageDialog(null,"�ο����� ������ �ּ���");
      					}
      					else {
      						JOptionPane.showMessageDialog(null,reserTime.getSelectedItem() + "\n" + NOpeople.getSelectedItem() + "\n" + "����Ǿ����ϴ�.");
      						FrameBase.getDispose();
      						FrameBase.getInstance(new FrameBegin());
      					}
      					
      				}
      					
      					
   
      				
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
    				FrameBase.getInstance(new FrameGetRestaurantInfo(restaurantList, i, categoryName, mood));

    				
    			}
    		});
    		
    		btnHome.addActionListener(new ActionListener() {
    			
    			@Override
    			public void actionPerformed(ActionEvent e) {
    				FrameBase.getDispose();
    				FrameBase.getInstance(new FrameFrist());
    				
    			}
    		});
    		
        
	}//reservation
	
	

}