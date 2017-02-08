import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        int HorWidth,
                        VerWidth,
                        WidthSides,
                        HeightSides;
 
                        //Paint the background
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillRect(x1, y1, width+1, height+1);
//                        
//                        //Draw a border
//                        g.setColor(Color.CYAN);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw a border 2
//                        g.setColor(Color.MAGENTA);
//                        g.drawRect(x1+6, y1+6, width-12, height-12);
//                        
//                        //Draw diagonal Line1
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Draw diagonal Line2
//                        g.setColor(Color.BLACK);
//                        g.drawLine(x2, y1, x1, y2);
                        
                        HorWidth = width - 55;
                        VerWidth = height - 55;
                        WidthSides = HorWidth/2;
                        HeightSides = VerWidth/2;
                        
                        //Draw Oval
                        g.setColor(Color.ORANGE);
                        g.fillOval(WidthSides, HeightSides, 55, 55);
                        }
}