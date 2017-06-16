package addressbook;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;


/**
 * The Class AddressBookOptions.
 */
@SuppressWarnings("serial")
public class AddressBookOptions extends JFrame implements ActionListener { 
	

	
	/** The frame. */
	private JFrame frame;
	
	
	/** The button group. */
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressBookOptions window = new AddressBookOptions();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	/**
	 * Address book options, add, edit, delete or search.
	 */
	public AddressBookOptions() {
		initialize();
	}

	
	
	/**
	 * Initialize.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 321, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		 
	     	
		JButton btnAddContacts = new JButton("Add Contacts");
		btnAddContacts.setBackground(UIManager.getColor("Button.light"));
		btnAddContacts.setForeground(Color.MAGENTA);
		
		buttonGroup.add(btnAddContacts);		
		btnAddContacts.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnAddContacts.setBounds(31, 173, 245, 28);
		frame.getContentPane().add(btnAddContacts);
		btnAddContacts.addActionListener(this);
		
		JButton btnSearchContacts = new JButton("Search Contacts");
		btnSearchContacts.setForeground(Color.MAGENTA);
		buttonGroup.add(btnSearchContacts);
		btnSearchContacts.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnSearchContacts.setBounds(31, 277, 245, 28);
		frame.getContentPane().add(btnSearchContacts);
		
		JButton btnUpdateContacts = new JButton("Update Contacts");
		btnUpdateContacts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUpdateContacts.setForeground(Color.MAGENTA);
		buttonGroup.add(btnUpdateContacts);
		btnUpdateContacts.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnUpdateContacts.setBounds(31, 225, 245, 28);
		frame.getContentPane().add(btnUpdateContacts);
		
		JButton btnDeleteContacts = new JButton("Delete Contacts");
		btnDeleteContacts.setForeground(Color.MAGENTA);
		buttonGroup.add(btnDeleteContacts);
		btnDeleteContacts.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnDeleteContacts.setBounds(31, 427, 245, 28);
		frame.getContentPane().add(btnDeleteContacts);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnExit.setBounds(203, 21, 81, 47);
		frame.getContentPane().add(btnExit);
		
		JLabel lblNewLabel = new JLabel("Add Peeps Here");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(31, 68, 245, 76);
		frame.getContentPane().add(lblNewLabel);
	}

	 
 	/* (non-Javadoc)
	  * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	  */
	 public void actionPerformed(ActionEvent event) {
		 ContactInfo nci = new ContactInfo();   	       
	       nci.setVisible(true);
	      frame.dispose();
       
      
    
       
     }
}



	




