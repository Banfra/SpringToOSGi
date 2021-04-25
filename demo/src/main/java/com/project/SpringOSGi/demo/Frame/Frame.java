package com.project.SpringOSGi.demo.Frame;

import javax.swing.JFrame;
import javax.swing.*;

public class Frame extends JFrame {
	public Frame(){
		this.setTitle("Sping OSGi");
		this.setSize(500, 500);
		this.setLayout(null);
		
		JButton BBluetooth = new JButton("Bluetooth");
		BBluetooth.setBounds(100, 100, 50, 30);
		
		this.add(BBluetooth);
		this.setVisible(true);
	}
}
