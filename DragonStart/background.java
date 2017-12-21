import java.awt.*;
/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background
{
    // instance variables - replace the example below with your own
    private int width;//how long the the scene is still needs all varibles
    private int hight;// how tall the scene is still needs all vasribles
    private Color h; //horizon
    private Color gr;// ground
    private Color s;//sun



public  background(Graphics g)
{
    g.setColor(Color.cyan);
    g.fillRect(0,0,800,600);
    g.setColor(Color.green);
    g.fillRect(0,600,800,200);
    g.setColor(Color.yellow);
    g.fillOval(500,80,75,75);

}
}

    /**
     * Constructor for objects of class background
     */

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
