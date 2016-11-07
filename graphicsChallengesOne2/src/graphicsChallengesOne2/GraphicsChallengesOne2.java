package graphicsChallengesOne2;
import java.awt.*;
import javax.swing.*;
public class GraphicsChallengesOne2 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        GraphicsChallengesOne2 canvas = new GraphicsChallengesOne2();
	        JFrame frame = new JFrame();
	        frame.setSize(300, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null);
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{	        
	        graphics.setColor(Color.red);
	        graphics.fillRect(10,10,250,250);
    		}
    	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(50);
    					} catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
    	}
