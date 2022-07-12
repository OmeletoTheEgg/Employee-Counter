import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;

import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;


public class Main {

	private JFrame frmNumbersToWords;
	private JTextField txtName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JFormattedTextField textField_Age;
	private JPanel panel_1;
	private JPanel panel_2;
	private GroupLayout gl_panel;
	private JPanel panel_2_2;
	private JTextPane textPane;
	private JLabel lblTheStudentIs;
	private GroupLayout gl_panel_2_2;
	private JPanel panel_2_1;
	private JLabel lblNewLabel;
	private JCheckBox chckbxGender;
	private JCheckBox chckbxMarried;
	private JLabel lblAge;
	private GroupLayout gl_panel_2_1;
	private GroupLayout gl_panel_2;
	private DefaultListModel editableList;
	private JList list;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private GroupLayout gl_panel_1;
	private JTextArea txtrData;
	private JTextArea txtrData_1;
	private JTextArea txtrData_3;
	private JTextArea txtrData_2;
	private JTextArea txtrData_5;
	private JTextArea txtrData_4;
	
	final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345674890";

	final java.util.Random rand = new java.util.Random();

	// consider using a Map<String,Boolean> to say whether the identifier is being used or not 
	final Set<String> identifiers = new HashSet<String>();

	public String randomIdentifier() {
	    StringBuilder builder = new StringBuilder();
	    while(builder.toString().length() == 0) {
	        int length = rand.nextInt(5)+5;
	        for(int i = 0; i < length; i++) {
	            builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
	        }
	        if(identifiers.contains(builder.toString())) {
	            builder = new StringBuilder();
	        }
	    }
	    return builder.toString();
	}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmNumbersToWords.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNumbersToWords = new JFrame();
		frmNumbersToWords.setFont(new Font("Dialog", Font.PLAIN, 30));
		frmNumbersToWords.setLocation(new Point(960, 540));
		frmNumbersToWords.setTitle("MEG Manufacturing Company Employee Counter");
		frmNumbersToWords.setBounds(0, 0, 1680, 1050);
		frmNumbersToWords.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNumbersToWords.setLocationRelativeTo(null);
		frmNumbersToWords.getContentPane().setLayout(new BorderLayout(0, 0));
		frmNumbersToWords.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		final Background panel = new Background();
		frmNumbersToWords.getContentPane().add(panel);
		
		Font font = new Font("Arial", Font.PLAIN, 17);
		
		panel_1 = new JPanel() {
			protected void paintComponent(Graphics g) {
		    	super.paintComponent(g);
		        final Graphics2D g2 = (Graphics2D) g.create();
		        Color color1 = new Color(3, 194, 146, 50).brighter();
		        g2.setPaint(color1);
		        g2.fillRect(0, 0, getWidth(), getHeight());
		        g2.dispose();
		    }
		};
		panel_1.setPreferredSize(new Dimension(0, 0));
		panel_1.setOpaque(false);
		
		panel_2 = new JPanel() {
			protected void paintComponent(Graphics g) {
		    	super.paintComponent(g);
		        final Graphics2D g2 = (Graphics2D) g.create();
		        Color color1 = new Color(3, 194, 146, 50).brighter();
		        g2.setPaint(color1);
		        g2.fillRect(0, 0, getWidth(), getHeight());
		        g2.dispose();
		    }
		};
		panel_2.setOpaque(false);
		
		gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		panel_2_2 = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
		        final Graphics2D g2 = (Graphics2D) g.create();
		        Color color1 = new Color(3, 194, 146, 50).brighter();
		        g2.setPaint(color1);
		        g2.fillRect(0, 0, getWidth(), getHeight());
		        g2.dispose();
			}
		};
		panel_2_2.setOpaque(false);
		
		textPane = new JTextPane();
		textPane.setOpaque(false);
		
		lblTheStudentIs = new JLabel("Company Employee Data Counter:");
		lblTheStudentIs.setForeground(Color.WHITE);
		lblTheStudentIs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtrData = new JTextArea();
		txtrData.setEditable(false);
		txtrData.setText("The total number of male employees: ");
		txtrData.setOpaque(false);
		txtrData.setLineWrap(true);
		txtrData.setForeground(Color.WHITE);
		txtrData.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtrData_1 = new JTextArea();
		txtrData_1.setText("The total number of female employees: ");
		txtrData_1.setOpaque(false);
		txtrData_1.setLineWrap(true);
		txtrData_1.setForeground(Color.WHITE);
		txtrData_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrData_1.setEditable(false);
		
		txtrData_3 = new JTextArea();
		txtrData_3.setText("Total female employees who are single and less than 22 years old: ");
		txtrData_3.setOpaque(false);
		txtrData_3.setLineWrap(true);
		txtrData_3.setForeground(Color.WHITE);
		txtrData_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrData_3.setEditable(false);
		
		txtrData_2 = new JTextArea();
		txtrData_2.setText("Total male employees who are single and less than 25 years old: ");
		txtrData_2.setOpaque(false);
		txtrData_2.setLineWrap(true);
		txtrData_2.setForeground(Color.WHITE);
		txtrData_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrData_2.setEditable(false);
		
		txtrData_5 = new JTextArea();
		txtrData_5.setText("Average age of all married female employees: ");
		txtrData_5.setOpaque(false);
		txtrData_5.setLineWrap(true);
		txtrData_5.setForeground(Color.WHITE);
		txtrData_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrData_5.setEditable(false);
		
		txtrData_4 = new JTextArea();
		txtrData_4.setText("Average age of all married male employees: ");
		txtrData_4.setOpaque(false);
		txtrData_4.setLineWrap(true);
		txtrData_4.setForeground(Color.WHITE);
		txtrData_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrData_4.setEditable(false);
		
		gl_panel_2_2 = new GroupLayout(panel_2_2);
		gl_panel_2_2.setHorizontalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblTheStudentIs, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2_2.createSequentialGroup()
									.addGap(1130)
									.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
								.addComponent(txtrData_1, GroupLayout.PREFERRED_SIZE, 1066, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrData, GroupLayout.PREFERRED_SIZE, 1066, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrData_2, GroupLayout.PREFERRED_SIZE, 1066, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrData_3, GroupLayout.PREFERRED_SIZE, 1066, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrData_4, GroupLayout.PREFERRED_SIZE, 1066, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrData_5, GroupLayout.PREFERRED_SIZE, 1066, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_2_2.setVerticalGroup(
			gl_panel_2_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTheStudentIs, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_panel_2_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 457, Short.MAX_VALUE)
							.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel_2_2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtrData, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtrData_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtrData_2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(txtrData_3, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtrData_4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(txtrData_5, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(344)))
					.addGap(11))
		);
		panel_2_2.setLayout(gl_panel_2_2);
		
		panel_2_1 = new JPanel() {
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
		        final Graphics2D g2 = (Graphics2D) g.create();
		        Color color1 = new Color(3, 194, 146, 50).brighter();
		        g2.setPaint(color1);
		        g2.fillRect(0, 0, getWidth(), getHeight());
		        g2.dispose();
			}
		};
		panel_2_1.setOpaque(false);
		
		lblNewLabel = new JLabel("Full Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		
		txtName = new JTextField();
		txtName.setFont(new Font("Dialog", Font.PLAIN, 23));
		txtName.setRequestFocusEnabled(true);
		txtName.setOpaque(true);
		txtName.setColumns(10);
		
		txtName.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
				detailsToEmployee((Employee) list.getSelectedValue());
				updateData();
			}
		});
		
		chckbxGender = new JCheckBox("Male (unchecked) / Female (checked)");
		chckbxGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsToEmployee((Employee) list.getSelectedValue());
				updateData();
			}
		});
		chckbxGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		chckbxGender.setForeground(Color.WHITE);
		chckbxGender.setOpaque(false);
		
		chckbxMarried = new JCheckBox("Single (unchecked) / Married (checked)");
		chckbxMarried.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detailsToEmployee((Employee) list.getSelectedValue());
				updateData();
			}
		});
		chckbxMarried.setOpaque(false);
		chckbxMarried.setForeground(Color.WHITE);
		chckbxMarried.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblAge = new JLabel("Age:");
		lblAge.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 16));

		textField_Age = new JFormattedTextField();
		textField_Age.setText("0");
		textField_Age.setColumns(10);
		

		
		textField_Age.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
			        e.consume();
			    } 
				
				if (Integer.parseInt(textField_Age.getText()) < 0) {
					textField_Age.setText(new String("0"));
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				detailsToEmployee((Employee) list.getSelectedValue()); 
				updateData();
			}
		});
		
		gl_panel_2_1 = new GroupLayout(panel_2_1);
		gl_panel_2_1.setHorizontalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addGap(35)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 983, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2_1.createSequentialGroup()
							.addGap(190)
							.addGroup(gl_panel_2_1.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxMarried, GroupLayout.PREFERRED_SIZE, 327, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_2_1.createSequentialGroup()
									.addComponent(chckbxGender)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblAge, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_Age, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_panel_2_1.setVerticalGroup(
			gl_panel_2_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_2_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxGender, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblAge, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
						.addComponent(textField_Age, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(3)
					.addComponent(chckbxMarried, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(76))
		);
		panel_2_1.setLayout(gl_panel_2_1);
		gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addGap(20)
					.addComponent(panel_2_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2_2, GroupLayout.DEFAULT_SIZE, 1157, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_2_1, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2_2, GroupLayout.PREFERRED_SIZE, 742, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		editableList = new DefaultListModel();

		editableList.addElement(new Employee("Moscosa, Arjhi P.", new Random().nextBoolean(), new Random().nextBoolean(), (int) ((Math.random() * (70 - 10)) + 10)));
		editableList.addElement(new Employee("Socias, Melvic C.", new Random().nextBoolean(), new Random().nextBoolean(), (int) ((Math.random() * (70 - 10)) + 10)));
		for (int i = 0; i < 25; i++) {
			editableList.addElement(new Employee(randomIdentifier() + " [auto-generated name]", new Random().nextBoolean(), new Random().nextBoolean(), (int) ((Math.random() * (45 - 10)) + 10)));
		}
		
		list = new JList(editableList)  {
			protected void paintComponent(Graphics g) {
		    	super.paintComponent(g);
		        final Graphics2D g2 = (Graphics2D) g.create();
		        Color color1 = new Color(3, 194, 146, 50).brighter();
		        g2.setPaint(color1);
		        g2.fillRect(0, 0, getWidth(), getHeight());
		        g2.dispose();
		    }
		};
		JScrollPane j = new JScrollPane(list);
		j.setViewportView(list);
		panel_1.add(j);
		
		list.setCellRenderer(new DefaultListCellRenderer() {
		    public Component getListCellRendererComponent(JList<?> list,
                    Object value,
                    int index,
                    boolean isSelected,
                    boolean cellHasFocus) {
				super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
				if (value instanceof Employee) {
					Employee ingredient = (Employee)value;
					setText(ingredient.name);
				}
				return this;
			}
		});
		
		list.setSelectionModel(new DefaultListSelectionModel() {
		    private int maxCount = 1;
		    @Override
		    public void setSelectionInterval(int index0, int index1) {
		        if (index1 - index0 >= maxCount) {
		            index1 = index0 + maxCount - 1;
		        }
		        super.setSelectionInterval(index0, index1);
		    }
		    @Override
		    public void addSelectionInterval(int index0, int index1) {
		        int selectionLength = list.getSelectedIndices().length;
		        if (selectionLength >= maxCount) return;
		        if (index1 - index0 >= maxCount - selectionLength) index1 = index0 + maxCount - 1 - selectionLength;
		        if (index1 < index0) return;
		        super.addSelectionInterval(index0, index1);
		    }
		});

		
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent listSelectionEvent) {
				
				if (!listSelectionEvent.getValueIsAdjusting()) {
					employeeToDetails((Employee) list.getSelectedValue());
	            }

			}
		});
		
		list.setSelectedIndex(0);
		employeeToDetails((Employee) list.getSelectedValue());
		updateData();

		btnNewButton = new JButton("Add Employee");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editableList.addElement(new Employee("[Enter name]"));
				list.setSelectedIndex(list.getLastVisibleIndex());

			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		btnNewButton_1 = new JButton("Remove Selected");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					editableList.remove(list.getSelectedIndex());
				} catch (Exception ee) {}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(list, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(list, GroupLayout.PREFERRED_SIZE, 874, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(gl_panel);
		frmNumbersToWords.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{panel, frmNumbersToWords.getContentPane()}));
		panel.addMouseMotionListener(new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				panel.mouseX = e.getX();
				panel.mouseY = e.getY();
			}
		});
	}
	
	private void detailsToEmployee(Employee employee) {
		employee.name = txtName.getText();
		employee.gender = chckbxGender.isSelected();
		employee.married = chckbxMarried.isSelected();
		employee.age = textField_Age.getText();
	}
	
	private void employeeToDetails(Employee employee) {
		txtName.setText(employee.name);
		chckbxGender.setSelected(employee.gender);
		chckbxMarried.setSelected(employee.married);
		textField_Age.setText(employee.age);
	}
	
	private void updateData() {
		int maleCount = 0;
		int femaleCount = 0;
		int maleSingle25 = 0;
		int femaleSingle22 = 0;
		double marriedMaleAge = 0;
		double marriedFemaleAge = 0;
		double aveMaleAge = 0;
		double aveFemaleAge = 0;
		
		for(int i = 0; i < editableList.getSize(); i++) {
			Employee employee = ((Employee) editableList.get(i));
			if (employee.gender == false) {
				maleCount++;
			}
			if (employee.gender == true) {
				femaleCount++;
			}
			if (employee.gender == false && (employee.married == false) && Integer.parseInt(employee.age) < 25) {
				maleSingle25++;
			}
			if (employee.gender == true && (employee.married == false) && Integer.parseInt(employee.age) < 22) {
				femaleSingle22++;
			}
			if (employee.gender == false && employee.married) {
				marriedMaleAge += Integer.parseInt(employee.age);
				aveMaleAge = marriedMaleAge / editableList.getSize();
			}
			if (employee.gender == true && employee.married) {
				marriedFemaleAge += Integer.parseInt(employee.age);
				aveFemaleAge = marriedFemaleAge / editableList.getSize();
			}
		}
		
		txtrData.setText("The total number of male employees: " + maleCount);
		txtrData_1.setText("The total number of female employees: " + femaleCount);
		txtrData_2.setText("Total male employees who are single and less than 25 years old: " + maleSingle25);
		txtrData_3.setText("Total female employees who are single and less than 22 years old: " + femaleSingle22);
		txtrData_4.setText("Average age of all married male employees: " + aveMaleAge);
		txtrData_5.setText("Average age of all married female employees: " + aveFemaleAge);
	}
}


