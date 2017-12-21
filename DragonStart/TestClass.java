import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
   public static void main(String args[]){
       DrawingPanel panel = new DrawingPanel(800,800);
       Graphics g = panel.getGraphics();
       Scanner alpha = new Scanner(System.in);
       ArrayList<Dragon> dragon = new ArrayList<Dragon>();
       background b = new background(g);
      
       int num;
       
       do{
           System.out.println("Enter the amount of Dragons you would like:");
           num = alpha.nextInt();
        }
        while(num <= 0);
       
        for(int i = 1; i<= num; i++){
            Dragon temp = new Dragon(130*i+25 , 140*i+50, 1 , new Color(50 *i, 50*i, 50*i),"");
            dragon.add(temp);
        }
        
        while(num > 2){
            num--;
        }
        
        
        for(int i = 0; i < dragon.size(); i++){
            dragon.get(i).drawDragon(g);
            dragon.get(i).dragonTalk(g);
        }
    /*  
     * Dragon jen = new Dragon();
     *  
     *  jen.drawDragon(g);
     * jen.dragonTalk(g);
     
      *System.out.println(jen);
       
      *Dragon sarah = new Dragon(300,300,2, Color.BLACK, "sword");
      *sarah.drawDragon(g);
      *sarah.dragonTalk(g);
       
      *System.out.println(sarah);
      */
    }
}
