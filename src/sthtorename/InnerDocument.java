package sthtorename;

import java.util.ArrayList;
import java.util.List;

public class InnerDocument {
	private final int numFields = 5;
	private DataField[] dataFields;
	private List<String> pages;
	
	public InnerDocument() {
		this.dataFields = new DataField[numFields];
		for (int i = 0; i < numFields; i++) {
			this.dataFields[i] = new DataField(Integer.toString(i));
		}
		this.pages = new ArrayList<String>();
	}
	
	public void writeInnerDocument() {
		// TODO
	}
	
	public void addPage(String s) {
		this.pages.add(s);
	}
	
	public DataField getDataField(String name) throws Exception {
		for (DataField df : this.dataFields) {
			if (df.getName().equals(name)) {
				return df;
			}
		}
		throw new Exception("No dataFied with this name!");
	}
}
