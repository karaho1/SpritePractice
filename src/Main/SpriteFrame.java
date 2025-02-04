package Main;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;



public class SpriteFrame extends Main {
	
	static JFrame frame1 = new JFrame();
	static ImageIcon icon = new ImageIcon("resources/dirtyBigSprite.png");
	static ImageIcon icon2 = new ImageIcon("resources/dirtyBigSpriteRight.png");
	//background = new ImageIcon("resource/mapDD.png"); 
	static JPanel empty = new JPanel();
	static JPanel room1 = new JPanel();
	static JPanel room2 = new JPanel();
	//static JFrame frame1;
	static JLabel label1 = new JLabel();
	//static ImageIcon icon; 
	//static ImageIcon icon2;
	static JLabel backLabel;
	//ImageIcon background;
	//static JPanel empty;
	static JLabel coords;
	//static JPanel room2;
	static JPanel room3;
	JPanel room4;
	JPanel room5;
	
	

	public static void Sprite(){
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(1200,800);
		frame1.setBounds(0, 0, 1200, 800);
		frame1.setLayout(null);
		empty.setBounds(0,0,1200,800);
		empty.setBackground(Color.pink);
		
		frame1.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				//gives a character output when a key is pressed
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				//when a key is pressed, an int is returned (uses keycode)
				switch(e.getKeyCode()) {
					case 40: label1.setLocation(label1.getX(), label1.getY() + 10);
					coords.setText(label1.getX() + "," + label1.getY());
						break;
					//move down
					case 38: label1.setLocation(label1.getX(), label1.getY() - 10);
					coords.setText(label1.getX() + "," + label1.getY());
						break;
					//move up
					case 37: label1.setLocation(label1.getX() - 10, label1.getY());
					coords.setText(label1.getX() + "," + label1.getY());
					label1.setIcon(icon);
						break;
					//move left
					case 39: label1.setLocation(label1.getX() + 10, label1.getY());
					coords.setText(label1.getX() + "," + label1.getY());
					label1.setIcon(icon2);
						break;
					//move right
				}
				
				if (label1.getX() == 1200) {
					roomOne();
					if (empty.isAncestorOf(label1)==(true) && label1.getX() == 1200) {
						roomtTwo();
					}
					
				} 
				
							
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				//called whenever a button is released
				//System.out.println("You released key character: " + e.getKeyChar());
				//System.out.println("You released key code: " + e.getKeyCode());
				
				//up is 38
				//down is 40
				//left is 37
				//right is 39
			}
		});
		
		label1 = new JLabel();
		label1.setBounds(50, 50, 150, 150);
		label1.setIcon(icon);
	
		coords = new JLabel(label1.getX() + " " + label1.getY());
		coords.setBounds(200, 200, 100, 100);
		coords.setBackground(Color.red);
		coords.setOpaque(true);
		
		label1.setBackground(Color.red);
		label1.setOpaque(true);
	
		
		frame1.add(label1);
		frame1.add(coords);
		frame1.add(empty);
		//this.add(backLabel);
		frame1.setVisible(true);
		
		
		
	
		
		}
	
	
	
	public static void roomOne() {
		frame1.remove(empty);
		frame1.remove(label1);
		frame1.add(label1);
		label1.setLocation(0, label1.getY());
		frame1.repaint();
		//JPanel room1 = new JPanel();
		room1.setBounds(0,0,1200,800);
		room1.setBackground(Color.magenta);
		
		frame1.add(room1);
		frame1.repaint();
		frame1.revalidate();
		
		if (label1.getX() == 1200) {
			roomtTwo();
		} 
		
	}
	
	public static void roomtTwo() {
		frame1.remove(room1);
		frame1.remove(label1);
		frame1.add(label1);
		
		label1.setLocation(0, label1.getY());
		frame1.repaint();	
		
		//JPanel room2 = new JPanel();
		room2.setBounds(0,0,1200,800);
		room2.setBackground(Color.orange);
		frame1.add(room2);
		frame1.repaint();
		frame1.revalidate();
		
		if (label1.getX() == 1200) {
			roomThree(frame1, room2);
		} 
		
	}
	
	public static void roomThree(JFrame frame, JPanel panel) {
		frame.remove(panel);
		frame.remove(label1);
		frame.add(label1);
		
		label1.setLocation(0, label1.getY());
		frame.repaint();	
		
		JPanel room3 = new JPanel();
		room3.setBounds(0,0,1200,800);
		room3.setBackground(Color.yellow);
		
		
		
		
		
		
		frame.add(room3);
		frame.repaint();
		frame.revalidate();
	}
	

	
		
	}

