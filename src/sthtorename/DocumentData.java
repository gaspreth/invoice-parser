package sthtorename;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;

public class DocumentData {
	
	private List<InnerDocument> innerDocuments;
	private String documentPath;
	private String[] pageImages;
	private int pageNumber = 0;
	
	public DocumentData(String documentPath) {
		this.documentPath = documentPath;
		this.innerDocuments = new ArrayList<InnerDocument>();
	}

	
	public String relativePageMove(int step) {
		if ((this.pageNumber + step >= 0) && (this.pageNumber + step < this.pageImages.length)){
			this.pageNumber += step;			
		}
		return pageImages[pageNumber];
	}
	
	public String getCurrentPageImage() {
		return pageImages[pageNumber];
	}
	
	public String[] getPageImages() {
		return pageImages;
	}
	
	public void addInnerDocument(InnerDocument innerDoc) {
		innerDocuments.add(innerDoc);
	}
	
    public void generateImages(int dpi) throws Exception {
    	// TODO function should do one thing :P and breaking DRY principle here
        File sourceFile = new File(documentPath);
        String fileName = sourceFile.getName();
        String fileNameWithoutExt = fileName.substring(0, fileName.lastIndexOf("."));
        
        // TODO check if file exists in the right format 
        PDDocument document = PDDocument.load(sourceFile);
        int numPages = document.getNumberOfPages();
        this.pageImages = new String[numPages];
        
        File folder = new File(".\\data\\" + fileNameWithoutExt);
        boolean folderCreated = folder.mkdir();
        
        String outputFilePath = ".\\data\\" + fileNameWithoutExt + "\\" + fileNameWithoutExt + "%s" + ".png";

        if (folderCreated) {        	
        	PDFRenderer pdfRenderer = new PDFRenderer(document);      	
        	for (int i = 0; i < numPages; i++) {
        		BufferedImage image = pdfRenderer.renderImageWithDPI(i, dpi, ImageType.GRAY);
        		String imagePath = String.format(outputFilePath, i);
        		ImageIO.write(image, "PNG", new File(imagePath));    
        		this.pageImages[i] = imagePath;
        	}
        	document.close();
        } else {
        	for (int i = 0; i < numPages; i++) {
        		String imagePath = String.format(outputFilePath, i);    
        		this.pageImages[i] = imagePath;
        	}
        }
    }
	
}
