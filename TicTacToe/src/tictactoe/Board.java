
import java.awt.*;
import java.awt.event.*;

public class Board extends Frame{

	private static final long serialVersionUID = 1L;

	Board(){
		 Button b1=new Button(""); 
		 Button b2=new Button("");
		 Button b3=new Button("");
		 Button b4=new Button("");
		 Button b5=new Button("");
		 Button b6=new Button("");
		 Button b7=new Button("");
		 Button b8=new Button("");
		 Button b9=new Button("");
	        
	        // setting button position on screen
	       	b1.setBounds(75, 75, 50, 50);
	        b2.setBounds(125, 75, 50, 50);
	        b3.setBounds(175, 75, 50, 50);
	        b4.setBounds(75, 125, 50, 50);
	        b5.setBounds(125, 125, 50, 50);
	        b6.setBounds(175, 125, 50, 50);
	        b7.setBounds(75, 175, 50, 50);
	        b8.setBounds(125, 175, 50, 50);
	        b9.setBounds(175, 175, 50, 50);
	        
	        
	        //adding button into frame 
	        add(b1);
	        add(b2);
	        add(b3);
	        add(b4);
	        add(b5);
	        add(b6);
	        add(b7);
	        add(b8);
	        add(b9);
	        
	        //Setting Frame width and height
	        setSize(300,300); 
	        
	        //Setting the title of Frame
	        setTitle("TicTacToe"); 
	        
	        //Setting the layout for the Frame
	        setLayout(null);
	        
	        
	        
	        /* By default frame is not visible so 
	         * we are setting the visibility to true 
	         * to make it visible.
	         */
	        setVisible(true);  
	        
	        //Add all listeners to buttons
	        
	        //Closes window
	        addWindowListener(new WindowAdapter(){
	        	public void windowClosing(WindowEvent e) {
	        		dispose();
	        	}
	        });
	        
	        //button 1 on press
	        b1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		
	        	}
	        });
	}
	
	
	
	public static void main(String args[]) {
		Board bf = new Board();
	}
        
        public static String[] reset(String[] board){
            for (int i = 0; i < 9; i++){
                board[i] = Integer.toString(i+1);
            }
            return board;
    }
    
}
