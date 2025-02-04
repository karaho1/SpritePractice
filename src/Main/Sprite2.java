package Main;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Sprite2 extends JFrame implements KeyListener{
	
	
	JLabel label;
	ImageIcon icon; 
	ImageIcon icon2;
	JLabel coords;
	JPanel room1;
	JPanel room2;
	JPanel room3;
	JPanel room4;
	JPanel room5;


	Sprite2(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,800);
		this.setBounds(0, 0, 1200, 800);
		this.setLayout(null);
		this.addKeyListener(this);
		
		
		icon = new ImageIcon("resources/dirtyBigSprite.png");
		icon2 = new ImageIcon("resources/dirtyBigSpriteRight.png");
		
		
		
		
		label = new JLabel();
		label.setBounds(50, 50, 150, 150);
		label.setIcon(icon);
		
		coords = new JLabel(label.getX() + " " + label.getY());
		coords.setBounds(200, 200, 100, 100);
		coords.setBackground(Color.white);
		coords.setOpaque(true);
		
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		
		
		this.getContentPane().setBackground(Color.red);
	
		
		this.add(coords);
		this.add(label);
		this.setVisible(true);
		
		
		if (label.getX() == 0) {
			
		}
		
		
		
	}
	
	
	
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		//gives a character output when a key is pressed
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//when a key is pressed, an int is returned (uses keycode)
		switch(e.getKeyCode()) {
			case 40: label.setLocation(label.getX(), label.getY() + 10);
			coords.setText(label.getX() + "," + label.getY());
				break;
			//move down
			case 38: label.setLocation(label.getX(), label.getY() - 10);
			coords.setText(label.getX() + "," + label.getY());
				break;
			//move up
			case 37: label.setLocation(label.getX() - 10, label.getY());
			coords.setText(label.getX() + "," + label.getY());
			label.setIcon(icon);
				break;
			//move left
			case 39: label.setLocation(label.getX() + 10, label.getY());
			coords.setText(label.getX() + "," + label.getY());
			label.setIcon(icon2);
				break;
			//move right
		}
		if(label.getX() == -30) {
			this.getContentPane().setBackground(Color.blue);
		}
		else if (label.getY() == -80) {
			this.getContentPane().setBackground(Color.orange);
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
		
	}

