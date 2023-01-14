package GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Transparency extends JPanel implements MouseListener, MouseMotionListener {
	// "transparancy" in slovene is "prosojnica"
	
	// TODO number of rectangles should be dynamic
	private Rectangle[] rectangles = new Rectangle[5];
	private BufferedImage image;
	
	
	// TODO refactor
	private Rectangle activeField;
	
	
	public Transparency() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
        try {
        	image = ImageIO.read(new File(Consts.filePath));
        } catch (IOException ex) {
            // TODO handle exception...
        }
        for (int i = 0; i < rectangles.length; i++) {
        	rectangles[i] = new Rectangle();
        }
        activeField = rectangles[0];
	}

    private void drawRectangles(Graphics g) {

    	Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.blue);
        
        for (Rectangle r : rectangles) {
        	if (r != null) {
        		g2d.drawRect(r.getX(), r.getY(), r.getA(), r.getB());        		
        	}
        }
        g2d.drawRect(activeField.getX(), activeField.getY(), activeField.getA(), activeField.getB());

    }

    @Override
    public void paintComponent(Graphics g) {
    	
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
        drawRectangles(g);
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		int a = e.getX() - activeField.getX();
		int b = e.getY() - activeField.getY();
 		activeField.setSides(a, b);
		repaint();
		
	}
	
	public void setActiveField(Rectangle r) {
		this.activeField = r;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		activeField.setXY(e.getX(), e.getY());
		activeField.log();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int a = e.getX() - activeField.getX();
		int b = e.getY() - activeField.getY(); 
 		activeField.setSides(a, b);
		activeField.log();
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void setImage(BufferedImage image) {
		this.image = image;
	}
}

