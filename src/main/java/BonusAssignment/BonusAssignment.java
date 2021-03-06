/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BonusAssignment;

/**
 *
 * @author Larry Jackson
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

//The creates the window form
public class BonusAssignment extends JFrame implements ActionListener {
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;
    
    // Pixel sizes for border lines
    public static final int SMALL = 5;
    public static final int MEDIUM = 10;
    public static final int LARGE = 20;
    private JLabel bordersLabel = new JLabel();
    public BonusAssignment()
  {
     
    setSize(WIDTH, HEIGHT);
    //Creates the title of the window form 
    setTitle("Borders Sampler");
    
    //Creating the menu to add all the different kinds of border
    Container contentPane = getContentPane();
    contentPane.setLayout(new BorderLayout());
    JMenu bordersMenu = new JMenu("Borders");
    JMenuItem m;
    
    //Adding (Raised) Beveled Borders in the borders menu
    JMenu bevelMenu = new JMenu("Beveled Borders");
    m = new JMenuItem("Raised");
    m.setActionCommand("Raised Bevel");
    m.addActionListener(this);
    bevelMenu.add(m);
    
    //Adding (Lowered) Beveled Borders in the borders menu
    m = new JMenuItem("Lowered");
    m.setActionCommand("Lowered Bevel");
    m.addActionListener(this);
    bevelMenu.add(m);
    
    //Adding (Raised) Etched Borders in the borders menu
    bordersMenu.add(bevelMenu);
    JMenu etchedMenu = new JMenu("Etched Borders");
    m = new JMenuItem("Raised");
    m.setActionCommand("Raised Etch");
    m.addActionListener(this);
    etchedMenu.add(m);
    
    //Adding (Lowered) Etched Borders in the borders menu
    m = new JMenuItem("Lowered");
    m.setActionCommand("Lowered Etch");
    m.addActionListener(this);
    etchedMenu.add(m);
    bordersMenu.add(etchedMenu);
    
    //Creating a line border named small
    JMenu lineMenu = new JMenu("Line Borders");
    JMenu smallMenu = new JMenu("Small");
    
    //Adding (Small) Black lines in the menu
    m = new JMenuItem("Black");
    m.setActionCommand("Small Black");
    m.addActionListener(this);
    smallMenu.add(m);
    
    //Adding (Small) Red lines in the menu
    m = new JMenuItem("Red");
    m.setActionCommand("Small Red");
    m.addActionListener(this);
    smallMenu.add(m);

   //Adding (Small) Blue lines in the menu
    m = new JMenuItem("Blue");
    m.setActionCommand("Small Blue");
    m.addActionListener(this);
    smallMenu.add(m);

    //Defining the line borders as medium
    lineMenu.add(smallMenu);
    JMenu mediumMenu = new JMenu("Medium");

    //Adding (Medium) Black lines in the menu
    m = new JMenuItem("Black");
    m.setActionCommand("Medium Black");
    m.addActionListener(this);
    mediumMenu.add(m);

    //Adding (Medium) Red lines in the menu
    m = new JMenuItem("Red");
    m.setActionCommand("Medium Red");
    m.addActionListener(this);
    mediumMenu.add(m);

    //Adding (Medium) Blue lines in the menu
    m = new JMenuItem("Blue");
    m.setActionCommand("Medium Blue");
    m.addActionListener(this);
    mediumMenu.add(m);

    //Creating a line border named Large
    lineMenu.add(mediumMenu);
    JMenu largeMenu = new JMenu("Large");
    
    //Adding (Large) Black lines in the menu
    m = new JMenuItem("Black");
    m.setActionCommand("Large Black");
    m.addActionListener(this);
    largeMenu.add(m);

    //Adding (Large) Red lines in the menu
    m = new JMenuItem("Red");
    m.setActionCommand("Large Red");
    m.addActionListener(this);
    largeMenu.add(m);
    
    //Adding (Large) Blue lines in the menu
    m = new JMenuItem("Blue");
    m.setActionCommand("Large Blue");
    m.addActionListener(this);
    largeMenu.add(m);

    //Adding an exit to exit the window form
    lineMenu.add(largeMenu);
    bordersMenu.add(lineMenu);
    m = new JMenuItem("Exit");
    m.addActionListener(this);
    bordersMenu.add(m);

    JMenuBar mBar = new JMenuBar();
    mBar.add(bordersMenu);
    setJMenuBar(mBar);
    
    //Display a messsage in the center of the frame
    bordersLabel.setText("Select a border from menu");
    contentPane.add(bordersLabel, BorderLayout.CENTER);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    String actionCommand = e.getActionCommand();

        //Set the borders to a Raised Bevel
        if (actionCommand.equals("Raised Bevel")) {
        //Displays a message to show that the border is a Raised Beveled Border
        bordersLabel.setText("   Raised Beveled Border");
        bordersLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
        }

        //Set the borders to a Lowered Bevel
        else if (actionCommand.equals("Lowered Bevel")) {
        //Displays a message to show that the border is a Lowered Beveled Border
        bordersLabel.setText("   Lowered Beveled Border");
        bordersLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        }

        //Set the borders to a Raised Etch
        else if (actionCommand.equals("Raised Etch")){
        //Displays a message to show that the border is a Raised Etched Border
        bordersLabel.setText("   Raised Etched Border");
        bordersLabel.setBorder(new EtchedBorder(
        EtchedBorder.RAISED, Color.GREEN, Color.BLUE));
        }

        //Set the borders to a Lowered Etch
        else if (actionCommand.equals("Lowered Etch")){
        //Displays a message to show that the border is a Lowered Etched Border
        bordersLabel.setText("   Lowered Etched Border");
        bordersLabel.setBorder(new EtchedBorder(
        EtchedBorder.LOWERED, Color.GREEN, Color.BLUE));
        }

        //Set the line borders to Small Black
        else if (actionCommand.equals("Small Black")) {
        //Displays a message to show that the border is a Small Black Line Border
        bordersLabel.setText("   Small Black Line Border");
        bordersLabel.setBorder(new LineBorder(Color.BLACK, SMALL));
        }

        //Set the line borders to Medium Black
        else if (actionCommand.equals("Medium Black")){
        //Displays a message to show that the border is a Medium Black Line Border
        bordersLabel.setText("   Medium Black Line Border");
        bordersLabel.setBorder(new LineBorder(Color.BLACK, MEDIUM));
        }

        //Set the line borders to Large Black
        else if (actionCommand.equals("Large Black")){
        //Displays a message to show that the border is a Large Black Line Border
        bordersLabel.setText("   Large Black Line Border");
        bordersLabel.setBorder(new LineBorder(Color.BLACK, LARGE));
        }

        //Set the line borders to Small Red
        else if (actionCommand.equals("Small Red")){
        //Displays a message to show that the border is a Small Red Line Border
        bordersLabel.setText("   Small Red Line Border");
        bordersLabel.setBorder(new LineBorder(Color.RED, SMALL));
        }

        //Set the line borders to Medium Red
        else if (actionCommand.equals("Medium Red")){
        //Displays a message to show that the border is a Medium Red Line Border
        bordersLabel.setText("   Medium Red Line Border");
        bordersLabel.setBorder(new LineBorder(Color.RED, MEDIUM));
        }

        //Set the line borders to Large Red
        else if (actionCommand.equals("Large Red")){
        //Displays a message to show that the border is a Large Red Line Border
        bordersLabel.setText("   Large Red Line Border");
        bordersLabel.setBorder(new LineBorder(Color.RED, LARGE));
        }

        //Set the line borders to Small Blue
        else if (actionCommand.equals("Small Blue")){
        //Displays a message to show that the border is a Small Blue Line Border
        bordersLabel.setText("   Small Blue Line Border");
        bordersLabel.setBorder(new LineBorder(Color.BLUE, SMALL));
        }

        //Set the line borders to Medium Blue
        else if (actionCommand.equals("Medium Blue")){
        //Displays a message to show that the border is a Medium Blue Line Border
        bordersLabel.setText("   Medium Blue Line Border");
        bordersLabel.setBorder(new LineBorder(Color.BLUE, MEDIUM));
        }

        //Set the line borders to Large Blue
        else if (actionCommand.equals("Large Blue")){
        //Displays a message to show that the border is a Large Blue Line Border
        bordersLabel.setText("   Large Blue Line Border");
        bordersLabel.setBorder(new LineBorder(Color.BLUE, LARGE));
        }

        // if the user press Exit in the meun this action will close the window
        else if (actionCommand.equals("Exit")){
        System.exit(0);
        }
        else {
        bordersLabel.setText("   Error in Borders Sampler interface");
        }
 }
    
public static void main(String[] args) {
    BonusAssignment gui = new BonusAssignment();
    gui.setVisible(true);
    }
}