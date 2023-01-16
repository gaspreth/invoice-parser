package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

import sthtorename.DataField;
import util.Util;

@SuppressWarnings("serial")
public class Transparency extends JPanel implements MouseListener, MouseMotionListener {
	// "transparancy" in slovene is "prosojnica"
	
	private DataField[] dataFields;
	private BufferedImage image;
	
	private DataField activeDataField;
	
	
	public Transparency() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

    private void drawRectangles(Graphics g) {
    	
    	Graphics2D g2d = (Graphics2D) g;
    	
    	if (dataFields != null) {
    		
    		g2d.setColor(Color.blue);
    		
    		for (DataField df : dataFields) {
    			Rectangle r = df.getRectangle();
    			if (r != null) {
    				g2d.drawRect(r.getX(), r.getY(), r.getA(), r.getB());        		
    			}
    		}  		
    	}
    }
    

    @Override
    public void paintComponent(Graphics g) {
    	
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
        drawRectangles(g);
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		if (activeDataField != null) {
			Rectangle r = activeDataField.getRectangle();
			int a = e.getX() - r.getX();
			int b = e.getY() - r.getY();
			r.setSides(a, b);
			repaint();			
		}
	}
	


	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		if (activeDataField != null) {
			Rectangle r = activeDataField.getRectangle();
			r.setXY(e.getX(), e.getY());
			r.log();			
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (activeDataField != null) {
			Rectangle r = activeDataField.getRectangle();
			int a = e.getX() - r.getX();
			int b = e.getY() - r.getY(); 
			r.setSides(a, b);
			// activeDataField.setRectangle(r);
			r.log();
			repaint();
			if (a > 0 && b > 0) {
				// TODO dynamic path
				Util.cropImage(this.image, ".\\data\\new.png", r.getX(), r.getY(), a, b);		
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
	
	public void setImage(BufferedImage image) {
		this.image = image;
		repaint();
	}
	public void setActiveDataField(DataField df) {
		this.activeDataField = df;
	}
	public void setActiveDataField(int i) {
		this.activeDataField = this.dataFields[i];
	}
	
	public void setDataFields(DataField[] dfs) {
		this.dataFields = dfs;
	}
}

