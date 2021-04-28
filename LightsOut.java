import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LightsOut extends JFrame {
    private JCheckBox box11;
    private JCheckBox box12;
    private JCheckBox box13;
    private JCheckBox box14;
    private JCheckBox box21;
    private JCheckBox box22;
    private JCheckBox box23;
    private JCheckBox box24;
    private JCheckBox box31;
    private JCheckBox box32;
    private JCheckBox box33;
    private JCheckBox box34;
    private JCheckBox box41;
    private JCheckBox box42;
    private JCheckBox box43;
    private JCheckBox box44;
    private JLabel response;
    
    public LightsOut() {
        super();
        Container ctPane = getContentPane();
        
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(4,4));
        //ctPane.setLayout(new GridLayout(3,3));
        response = new JLabel();
        response.setText("Lets Play!");
        ctPane.add(response,BorderLayout.NORTH);
        
        box11 = new JCheckBox(); box11.setSelected(false);
        box12 = new JCheckBox(); box12.setSelected(false);
        box13 = new JCheckBox(); box13.setSelected(false);
        box14 = new JCheckBox(); box14.setSelected(false);
        box21 = new JCheckBox(); box21.setSelected(false);
        box22 = new JCheckBox(); box22.setSelected(false);
        box23 = new JCheckBox(); box23.setSelected(false);
        box24 = new JCheckBox(); box24.setSelected(false);
        box31 = new JCheckBox(); box31.setSelected(false);
        box32 = new JCheckBox(); box32.setSelected(false);
        box33 = new JCheckBox(); box33.setSelected(false);
        box34 = new JCheckBox(); box34.setSelected(false);
        box41 = new JCheckBox(); box41.setSelected(false);
        box42 = new JCheckBox(); box42.setSelected(false);
        box43 = new JCheckBox(); box43.setSelected(false);
        box44 = new JCheckBox(); box44.setSelected(false);
        
        gridPanel.add(box11); gridPanel.add(box12); gridPanel.add(box13); gridPanel.add(box14);
        gridPanel.add(box21); gridPanel.add(box22); gridPanel.add(box23); gridPanel.add(box24);
        gridPanel.add(box31); gridPanel.add(box32); gridPanel.add(box33); gridPanel.add(box34);
        gridPanel.add(box41); gridPanel.add(box42); gridPanel.add(box43); gridPanel.add(box44);
        ctPane.add(gridPanel, BorderLayout.CENTER);
        
        ActionListener theLightDoer = new DoLights();
        box11.addActionListener(theLightDoer);
            box12.addActionListener(theLightDoer);
                box13.addActionListener(theLightDoer);
                	box14.addActionListener(theLightDoer);
        box21.addActionListener(theLightDoer);
            box22.addActionListener(theLightDoer);
                box23.addActionListener(theLightDoer);
                	box24.addActionListener(theLightDoer);
        box31.addActionListener(theLightDoer);
            box32.addActionListener(theLightDoer);
                box33.addActionListener(theLightDoer);
                	box34.addActionListener(theLightDoer);
        box41.addActionListener(theLightDoer);
        		box42.addActionListener(theLightDoer);
        			box43.addActionListener(theLightDoer);
        				box44.addActionListener(theLightDoer);
    }
    private class DoLights implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            Object source = e.getSource();
            
            if(source == box11) {
                if(box12.isSelected()) { box12.setSelected(false);}
                else                   { box12.setSelected(true);}
                if(box21.isSelected()) { box21.setSelected(false);}
                else                   { box21.setSelected(true);}
            }
            else if(source == box12) {
                if(box11.isSelected()) { box11.setSelected(false);}
                else                   { box11.setSelected(true);}
                if(box22.isSelected()) { box22.setSelected(false);}
                else                   { box22.setSelected(true);}
                if(box13.isSelected()) { box13.setSelected(false);}
                else                   { box13.setSelected(true);}
            }
            else if(source == box13) {
                if(box12.isSelected()) { box12.setSelected(false);}
                else                   { box12.setSelected(true);}
                if(box23.isSelected()) { box23.setSelected(false);}
                else                   { box23.setSelected(true);}  
                if(box14.isSelected()) { box14.setSelected(false);}
                else                   { box14.setSelected(true);}
            }
            else if(source == box14) {
                if(box13.isSelected()) { box13.setSelected(false);}
                else                   { box13.setSelected(true);}
                if(box24.isSelected()) { box24.setSelected(false);}
                else                   { box24.setSelected(true);}    
            }
            else if(source == box21) {
                if(box11.isSelected()) { box11.setSelected(false);}
                else                   { box11.setSelected(true);}
                if(box22.isSelected()) { box22.setSelected(false);}
                else                   { box22.setSelected(true);}
                if(box31.isSelected()) { box31.setSelected(false);}
                else                   { box31.setSelected(true);}
            }
            else if(source == box22) {
                if(box12.isSelected()) { box12.setSelected(false);}
                else                   { box12.setSelected(true);}
                if(box21.isSelected()) { box21.setSelected(false);}
                else                   { box21.setSelected(true);}
                if(box23.isSelected()) { box23.setSelected(false);}
                else                   { box23.setSelected(true);}
                if(box32.isSelected()) { box32.setSelected(false);}
                else                   { box32.setSelected(true);}
            }
            else if(source == box23) {
                if(box13.isSelected()) { box13.setSelected(false);}
                else                   { box13.setSelected(true);}
                if(box22.isSelected()) { box22.setSelected(false);}
                else                   { box22.setSelected(true);}
                if(box24.isSelected()) { box24.setSelected(false);}
                else                   { box24.setSelected(true);}    
                if(box33.isSelected()) { box33.setSelected(false);}
                else                   { box33.setSelected(true);}
            }
            else if(source == box24) {
                if(box23.isSelected()) { box23.setSelected(false);}
                else                   { box23.setSelected(true);}
                if(box14.isSelected()) { box14.setSelected(false);}
                else                   { box14.setSelected(true);}   
                if(box34.isSelected()) { box34.setSelected(false);}
                else                   { box34.setSelected(true);}    
            }
            
            else if(source == box31) { 
                if(box21.isSelected()) { box21.setSelected(false);}
                else                   { box21.setSelected(true);}
                if(box32.isSelected()) { box32.setSelected(false);}
                else                   { box32.setSelected(true);}
                if(box41.isSelected()) { box41.setSelected(false);}
                else                   { box41.setSelected(true);}
            }
            else if(source == box32) { 
                if(box31.isSelected()) { box31.setSelected(false);}
                else                   { box31.setSelected(true);}
                if(box22.isSelected()) { box22.setSelected(false);}
                else                   { box22.setSelected(true);}
                if(box33.isSelected()) { box33.setSelected(false);}
                else                   { box33.setSelected(true);}
                if(box42.isSelected()) { box42.setSelected(false);}
                else                   { box42.setSelected(true);}
            }
            else if(source == box33) { 
                if(box23.isSelected()) { box23.setSelected(false);}
                else                   { box23.setSelected(true);}
                if(box32.isSelected()) { box32.setSelected(false);}
                else                   { box32.setSelected(true);}
                if(box34.isSelected()) { box34.setSelected(false);}
                else                   { box34.setSelected(true);}
                if(box43.isSelected()) { box43.setSelected(false);}
                else                   { box43.setSelected(true);}
            }
            else if(source == box34) { 
                    if(box33.isSelected()) { box33.setSelected(false);}
                    else                   { box33.setSelected(true);}
                    if(box24.isSelected()) { box24.setSelected(false);}
                    else                   { box24.setSelected(true);}
                    if(box44.isSelected()) { box44.setSelected(false);}
                    else                   { box44.setSelected(true);}
                }
            else if(source == box41) { 
                if(box31.isSelected()) { box31.setSelected(false);}
                else                   { box31.setSelected(true);}
                if(box42.isSelected()) { box42.setSelected(false);}
                else                   { box42.setSelected(true);}
            }
            else if(source == box42) { 
                if(box41.isSelected()) { box41.setSelected(false);}
                else                   { box41.setSelected(true);}
                if(box43.isSelected()) { box43.setSelected(false);}
                else                   { box43.setSelected(true);}
                if(box32.isSelected()) { box32.setSelected(false);}
                else                   { box32.setSelected(true);}
            }
            else if(source == box43) { 
                if(box42.isSelected()) { box42.setSelected(false);}
                else                   { box42.setSelected(true);}
                if(box33.isSelected()) { box33.setSelected(false);}
                else                   { box33.setSelected(true);}
                if(box44.isSelected()) { box44.setSelected(false);}
                else                   { box44.setSelected(true);}
            }
            else if(source == box44) { 
                if(box34.isSelected()) { box34.setSelected(false);}
                else                   { box34.setSelected(true);}
                if(box43.isSelected()) { box43.setSelected(false);}
                else                   { box43.setSelected(true);}
            }
        if(box11.isSelected() &&
            box12.isSelected() && 
            box13.isSelected() &&
            box14.isSelected() &&
            box21.isSelected() && 
            box22.isSelected() && 
            box23.isSelected() &&
            box24.isSelected() &&
            box31.isSelected() &&
            box32.isSelected() &&
            box33.isSelected() &&
            box34.isSelected() &&
            box41.isSelected() && 
            box42.isSelected() && 
            box43.isSelected() && 
            box44.isSelected()) {response.setText("You Won!");}

                
        }
    }
    public LightsOut(String title) {
        this();
        setTitle(title);
    }
}
