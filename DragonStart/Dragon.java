import java.awt.*;
/**
 * Write a description of class Dragon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dragon
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int size;
    private Color c;
    private String word;
    

    /**
     * Default Constructor for objects of class Dragon
     */
    public Dragon()
    {
        // initialise instance variables
        x = 50;
        y = 50;
        size = 1;
        c = Color.GREEN; // INS comment here.
        word = "Hi";
    }
    public Dragon(int x,int y, int size, Color c, String word){
        this.x = x;
        this.y = y;
        this.size = size;
        this.c = c; // You saw nothing.
        this.word = word;
    }
        
    
    /**
     * Overloaded Constructors go here
     */

    /** 
     * Accessor Methods
     */
    /**
     * drawDragon(Graphics g)
     * Starting of drawing, complete your Dragon....
     */
    public void drawDragon(Graphics g)
    {
        g.setColor(c); // Watermelon Dragon.
        g.fillRect(x, y , size * 25, size * 25); //Draw Head
        g.fillRect(x+size * 25, y + size*25, size *85, size * 50); //Draw Body
        g.fillRect(x+size * 25, (y + size*25) + size * 50, size * 10, size * 50); //Draw Leg #1
        g.fillRect(x+size * 100, (y + size*25) + size * 50, size * 10, size * 50);// Draw leg #2
        g.fillRect(x+size*25+size*85, y+size*25+(size*50/2),size*85/2,size*15);//tale
        
        g.setColor(Color.red);//damage bar color
        g.fillRect(x+size*55, (y + size * -45) +size * 15, size* 60, size * 10);// damamage bar
        g.setColor(Color.blue);//health full color
        g.fillRect(x+size*55, (y + size * -45) +size * 15, size* 60, size * 10);// health full
        
    }
    
    /**
     * Mutator Methods
     */
    public void dragonTalk(Graphics g){
        g.setColor(Color.red);
        g.drawRect( x + size*50, y +size*-10,size*15,size*10);
        
        g.setColor(Color.orange);
        g.drawString(word, x + size * -25,y + size*-25);
        
        
    }
    /**
     * toString
     */
    public String toString(){
        return "x coor: " + x + " y coord: " + y + " size: " + size + " Color: " + c;
    }
}
