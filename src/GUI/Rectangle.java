package GUI;

public class Rectangle {
	private int x, y, a, b;
	
	public Rectangle() {
		
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setSides(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public void log() {
		System.out.println(String.format("(x=%s, y=%s, a=%s, b=%s)", x, y, a, b));
	}
	
}
