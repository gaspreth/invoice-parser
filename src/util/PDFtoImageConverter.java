package util;

import java.awt.image.BufferedImage;
import java.io.File;

public class PDFtoImageConverter {

	
//	private void generateImageFromPDF(String filename, String extension) {
//	    PDDocument document = PDDocument.load(new File(filename));
//	    PDFRenderer pdfRenderer = new PDFRenderer(document);
//	    for (int page = 0; page < document.getNumberOfPages(); ++page) {
//	        BufferedImage bim = pdfRenderer.renderImageWithDPI(
//	          page, 300, ImageType.RGB);
//	        ImageIOUtil.writeImage(
//	          bim, String.format("src/output/pdf-%d.%s", page + 1, extension), 300);
//	    }
//	    document.close();
//	}
//	
//	public static void main(String[] args) throws IOException { // main function for converting PDF to images in Java
//		
//	// Load the sample PDF file to be converted to images
//        Document sourcePdfDoc = new Document("Sample.pdf");
//
//        // Initialize the resolution class object           
//        Resolution imgResolution = new Resolution(250);
//
//        // Initialize JpegDevice using the specified resolution
//        JpegDevice jpgDevice = new JpegDevice(imgResolution);
//
//    	// Iterate through all the pages of the source PDF document
//        for (int pageNumber = 1; pageNumber <= sourcePdfDoc.getPages().size(); pageNumber++)
//        {
//            // Initialize the output stream object to save image
//            java.io.OutputStream outputBinImageFile = new java.io.FileOutputStream(
//            	"image" + pageNumber + "_out.jpg");
//        	
//            // Save each page as a separate image
//            jpgDevice.process(sourcePdfDoc.getPages().get_Item(pageNumber), outputBinImageFile);
//
//            // Close the output stream after saving image
//            outputBinImageFile.close();
//        }
//    }
}