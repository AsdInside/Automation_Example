package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import Controller.Controller;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.DropMode;

public class Main {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.out.println("Avvio della gui");
					Controller controller= new Controller();
					Login login= new Login(controller);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

}