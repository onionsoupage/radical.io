package addressbook;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



import java.awt.SystemColor;

/**
 * The Class ContactInfo --- this class lets you add contact information
 */
@SuppressWarnings("serial")
public class ContactInfo extends JFrame implements ActionListener{
	
	
	
	/** The content pane. */
	private JPanel contentPane;
	
	private JTextField LastNameField;
	

	private JTextField PhoneNumberField;
	

	private JTextField emailTxtField;
	
	
	private JTextField firstNameField;

	
	/**
	 * The main method. --- this starts the application
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactInfo frame = new ContactInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	

	



	/**
	 * add new contacts details here
	 */
	public ContactInfo()  {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 530);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddNewContact = new JLabel("Add New Contact");
		lblAddNewContact.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewContact.setFont(new Font("Avenir", Font.PLAIN, 20));
		lblAddNewContact.setBounds(26, 11, 251, 33);
		contentPane.add(lblAddNewContact);
		
		JLabel FirstNameLabel = new JLabel("First Name");
		FirstNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		FirstNameLabel.setBounds(26, 64, 86, 14);
		contentPane.add(FirstNameLabel);
		
		
		
		JLabel LastNameLabel = new JLabel("Last Name");
		LastNameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		LastNameLabel.setBounds(26, 122, 135, 14);
		contentPane.add(LastNameLabel);
		
		LastNameField = new JTextField();
		LastNameField.setColumns(10);
		LastNameField.setBounds(26, 136, 251, 33);
		contentPane.add(LastNameField);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhoneNumber.setBounds(26, 180, 135, 14);
		contentPane.add(lblPhoneNumber);
		
		PhoneNumberField = new JTextField();
		PhoneNumberField.setColumns(10);
		PhoneNumberField.setBounds(26, 194, 251, 33);
		contentPane.add(PhoneNumberField);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmailAddress.setBounds(26, 238, 108, 14);
		contentPane.add(lblEmailAddress);
		
		emailTxtField = new JTextField();
		emailTxtField.setColumns(10);
		emailTxtField.setBounds(26, 252, 251, 33);
		contentPane.add(emailTxtField);
		
		JButton buttonSave = new JButton("Save");
		buttonSave.setForeground(Color.BLACK);
		buttonSave.setBackground(new Color(0, 255, 0));
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonSave.setFont(new Font("Avenir", Font.PLAIN, 14));
		buttonSave.setBounds(101, 312, 102, 52);
		contentPane.add(buttonSave);
		
		JButton buttonCancel = new JButton("Cancel");
		buttonCancel.setBackground(Color.RED);
		buttonCancel.setForeground(Color.BLACK);
		buttonCancel.setFont(new Font("Avenir", Font.PLAIN, 14));
		buttonCancel.addActionListener(this);
		buttonCancel.setBounds(100, 404, 103, 52);
		contentPane.add(buttonCancel);		
		
		firstNameField = new JTextField();
		firstNameField.setColumns(10);
		firstNameField.setBounds(26, 78, 251, 33);
		contentPane.add(firstNameField);
		       
		
		
	}

	
 	 /*
	  * Closes the page when button is clicked
	  */
	 public void actionPerformed(ActionEvent event) {
		 dispose();
		
	       
	       
	       

	
		
	 }
}

		


