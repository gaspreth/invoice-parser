package sthtorename;

import gui.Rectangle;

public class DataField {
	
	private String name;
	private String predictedValue;
	private String actualValue;
	private Rectangle rectangle;
	private String pathToImg;
	private String pathToPageImg;
	
	public DataField(String name) {
		this.name = name;
		this.predictedValue = predictValue();
		this.actualValue = new String(this.predictedValue);
		this.rectangle = new Rectangle();
	}
	
	public String predictValue() {
		// TODO
		return "TODO";
	}
	
	public String getName() {
		return this.name;
	}
	
	public Rectangle getRectangle() {
		return this.rectangle;
	}
	
	public String getPathToImg() {
		return this.pathToImg;
	}
	
	public void setRectangle(Rectangle r) {
		this.rectangle = r;
	}
	
	public void setActualValue(String av) {
		this.actualValue = av;
	}
	
	public void setPathToImg(String p) {
		this.pathToImg = p;
	}
	
	public void setPathToPageImg(String p) {
		this.pathToPageImg = p;
	}
	
}
