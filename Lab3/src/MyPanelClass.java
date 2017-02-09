import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

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
//                        int HorWidth,
//                        VerWidth,
//                        WidthSides,
//                        HeightSides;
                        int xtri,
                        ytri;
                        
                        int ystr1,
                        ystr2,
                        strwidth;
 
                        //Paint the background
                        //Also the base for the flag
                        g.setColor(Color.RED);
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
                        
//                        HorWidth = width - 55;
//                        VerWidth = height - 55;
//                        WidthSides = HorWidth/2;
//                        HeightSides = VerWidth/2;
                        
                        //Draw Oval
                        //g.setColor(Color.ORANGE);
                        //g.fillOval(WidthSides, HeightSides, 55, 55);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        //Makes the White Stripes
                        
                        ystr1 = y1 + (height/5);
                        ystr2 = y1 + (3*(height/5));
                        strwidth = height/5;
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1,ystr1,width,strwidth);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, ystr2, width, strwidth);
                        
                        //Makes the Triangle
                        xtri = 8 * (width/14);
                        ytri = height/2;
                        
                        Polygon tri = new Polygon();
                        tri.addPoint(x1, y1);
                        tri.addPoint(x1, height);
                        tri.addPoint(xtri, ytri);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(tri);
                        
                        //Makes the Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        

                        }
}