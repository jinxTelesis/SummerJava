
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MovingRects extends JPanel implements ActionListener {

   
    public void drawFrame(Graphics g, int frameNumber, int width, int height) {
        
      

        int inset; // Gap between edges of drawing area and the outer rectangle.

        int rectWidth, rectHeight;   // The size of one of the rectangles.

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0,0,width,height);  // Fill drawing area with light gray.

        g.setColor(Color.BLUE);  // Draw the rectangles in black.

        inset = frameNumber % 15;

        rectWidth = width - 2*inset;
        rectHeight = height - 2*inset;

        while (rectWidth >= 0 && rectHeight >= 0) {
            g.drawRect(inset, inset, rectWidth, rectHeight);
            inset += 15;       // rectangles are 15 pixels apart
            rectWidth -= 30;
            rectHeight -= 30;
        }
    }
    public static void main(String[] args) {
        
        JFrame window = new JFrame("Infinite motion");

        MovingRects drawingArea = new MovingRects();
        drawingArea.setBackground(Color.WHITE);
        window.setContentPane(drawingArea);

        drawingArea.setPreferredSize(new Dimension(600,450));

        window.pack();
        window.setLocation(100,50);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.setResizable(true);

        Timer frameTimer = new Timer(20,drawingArea);

        window.setVisible(true);
        frameTimer.start();

    } // end main

    private int frameNum;
    
    public void actionPerformed(ActionEvent evt) {
        frameNum++;
        repaint();
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g, frameNum, getWidth(), getHeight());
    }

}