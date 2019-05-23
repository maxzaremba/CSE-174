/**
 * A program that displays a set of points on the screen.
 * Begin with an array of Point objects.  Send that array
 * to a PointDisplay object.  The PointDisplay object will
 * handle all the necessary drawing for you.
 *
 * @author Norm Krumpe
 * @version 3.0
 */
import javax.swing.JFrame;
import java.awt.Point;

public class PointPlotter  {
  public static void main(String[] args) throws Exception { 
    
    // For now, how JFrames work is unimportant. Our
    // focus is on using a PointDisplay object,
    // which requires an array of Point objects
    // in order to work.
    // DO NOT MODIFY THESE THREE LINES:
    JFrame frame = new JFrame("Show Some Points");
    frame.setBounds(300, 300, 615, 650);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // The next two lines are lines you can change.  They
    // affect the size of the points, and whether the points
    // are connected:
    boolean connect = true;
    int size = 10;
    
    // PointDisplay objects "consume" arrays of Point objects.
    // In other words, if you have an array of Point objects,
    // and pass that array to PointDisplay, it will draw
    // those points for you. 
    Point[] myPoints = gridOfPoints();
   // myPoints[0] = new Point(300, 300);
    //myPoints[1] = new Point(200, 200);
    //myPoints[2] = new Point(100, 100);
    
    
        
    // DON'T CHANGE THE REST OF THE CODE IN THIS METHOD:
    PointDisplay display = new PointDisplay(myPoints,
                                            size,
                                            connect);
    frame.add(display);
    frame.setVisible(true);
  }
  
  // Returns an array of a few points.  
  public static Point[] starArray() {    
    Point[] result = {
      new Point(300,300),
      new Point(350,150),
      new Point(400,300),
      new Point(250,225),
      new Point(430,225),
      new Point(300,300)
    };
    
    return result;
  }
  
  // Returns an array of random points (see lab
  // notes for how these should be generated):
  public static Point[] randomPoints() {    
    Point[] result = new Point[5000];
    //int x = (int)(Math.random()*200) + 200;
    //int y = (int)(Math.random()*50) + 350;
    for (int i = 0; i < result.length; i++){
       int x = (int)(Math.random()*200) + 200;
       int y = (int)(Math.random()*50) + 350;
       result[i] = new Point(x, y);
    }
    
    
    
    return result;
  }
  
  
  
  // Returns an array of points in a grid. 
  public static Point[] gridOfPoints() {    
    Point[] result = new Point[800];
    int index  = 0;
    
    for (int i = 0; i < 20; i++){
       for (int k = 0; k < 40; k++){
       result[index] = new Point(k * 15, i * 30);
       index++;
       }
    }
    
    
    return result;
  }
 
}

