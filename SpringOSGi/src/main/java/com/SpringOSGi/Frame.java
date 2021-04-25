package com.SpringOSGi;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame {
    private JFrame frame;
    private int battery;
    private JButton bluetoothButton;
    private JButton wifiButton;
    private JButton addBatteryButton;
    private JButton removeBatteryButton;
    private JLabel labelBattery;

	Frame(){
        this.frame = new JFrame();
		this.frame.setTitle("Sping OSGi");
		this.frame.setSize(500, 500);
		this.frame.setLayout(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bluetoothButton = new JButton("Bluetooth");
		bluetoothButton.setBounds(50, 100, 150, 30);

        wifiButton = new JButton("Wifi");
		wifiButton.setBounds(50, 150, 150, 30);
		
        battery = 50;
        labelBattery = new JLabel(battery+ "%");
        labelBattery.setBounds(450, 5, 30, 30);

        addBatteryButton = new JButton("Add battery");
        addBatteryButton.setBounds(320, 100, 150, 30);

        removeBatteryButton = new JButton("Remove battery");
        removeBatteryButton.setBounds(320, 150, 150, 30);

		this.frame.add(bluetoothButton);
        this.frame.add(wifiButton);
        this.frame.add(labelBattery);
        this.frame.add(addBatteryButton);
        this.frame.add(removeBatteryButton);
		this.frame.setVisible(true);
        actionListeners();
	}

    public void actionListeners(){
        addBatteryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(battery <= 95)
                    battery += 5;
                updateframe();
            }
        });

        removeBatteryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if(battery > 0)
                    battery -= 5;
                updateframe();
            }
        });
        
    }

    public void updateframe(){
        this.labelBattery.setText(battery + "%");
        this.frame.revalidate();
    }

}
