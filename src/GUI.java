import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI {
	
	public static final int SCREEN_WIDTH = 1000;
	
	public JLabel prompt;
	public JButton[] options;
	public JFrame frame;
	
	private ImageIcon Pic;
	private JLabel bagel;
	

	public GUI() {
		this.options = new JButton[4];
		for (int i = 0; i < options.length; i++) {
			options[i] = new JButton();
		}
	}
	
	
    public void setUp() {
    	
    	final Color PINK = new Color(255, 192, 203);
    	
        // Creating the Frame
    	frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SCREEN_WIDTH, SCREEN_WIDTH - 200);
    
        // Creating the question at top
        JPanel panel = new JPanel();
        prompt = new JLabel(); // assign later
        panel.add(prompt); // Flow Layout
        
        // GridBag Layout (Buttons)
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        pane.setBackground(PINK);
        
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = .5;
        c.weighty = .5;
        c.gridwidth = 200;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(7, 7, 7, 7);
        options[0].addActionListener(new ButtonListener());
        pane.add(options[0], c);

        c.gridx = SCREEN_WIDTH/2;
        c.gridy = 0;
        c.weightx = .5;
        c.weighty = .5;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(7, 7, 7, 7);
        options[1].addActionListener(new ButtonListener());
        pane.add(options[1], c);
        
        c.gridx = 0;
        c.gridy = SCREEN_WIDTH/2;
        c.weightx = .5;
        c.weighty = .5;
        c.gridwidth = 200;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(7, 7, 7, 7);
        options[2].addActionListener(new ButtonListener());
        pane.add(options[2], c);
        
        c.gridx = SCREEN_WIDTH/2;
        c.gridy = SCREEN_WIDTH/2;
        c.weightx = .5;
        c.weighty = .5;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;
        c.insets = new Insets(7, 7, 7, 7);
        options[3].addActionListener(new ButtonListener());
        pane.add(options[3], c);
        
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, pane);
        
        frame.setVisible(true);
    }
    
    
    public void finalScreen(int bagelFlavor, Results results){
        frame.getContentPane().removeAll();
        
    	
    	JPanel panel = new JPanel();
    	JTextArea description = new JTextArea(results.description);
    	description.setWrapStyleWord(true);
    	description.setLineWrap(true);
    	description.setEditable(false);
    	description.setBounds(SCREEN_WIDTH/2, 0, SCREEN_WIDTH/2, SCREEN_WIDTH/2);
    	description.setBackground(null);
    	description.setFont(description.getFont().deriveFont(24f));
        panel.add(description); // Flow Layout

        JPanel pane = new JPanel();
		Pic = new ImageIcon(getClass().getResource(results.picture));
		bagel = new JLabel(Pic);
		pane.setBounds(0, 0, SCREEN_WIDTH/2, SCREEN_WIDTH/2);
		pane.add(bagel);
		
		frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.getContentPane().add(BorderLayout.WEST, pane);

        frame.setVisible(true);
    }
    
    
    public void change(Question ques) {
    	prompt.setFont(new Font("Serif", Font.BOLD, 20));
    	prompt.setText(ques.prompt);
    	for (int i = 0; i < options.length; i++) {
        	options[i].setFont(new Font("Ariel", Font.PLAIN, 20));
    		options[i].setText(ques.answers[i]);
    	}
    }
    
    
    static class ButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			JButton button = (JButton) event.getSource();
			Driver.choice = button.getText();
			Driver.pressed = true;
			
		}
	}
}