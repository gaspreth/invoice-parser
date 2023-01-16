package util;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Util {
	public static void printCoordinates(int x, int y) {
		System.out.println("(" + Integer.toString(x) + ", " + Integer.toString(y) + ")");
	}
	
	  
	
	public static void cropImage(BufferedImage originalImage, String cropImagePath, int x, int y, int a, int b) {
		try {
			BufferedImage croppedImage = originalImage.getSubimage(x, y, a, b);
			ImageIO.write(croppedImage, "png", new File(cropImagePath));
			System.out.println("imageSaved");			
		} catch (Exception e) {
			System.out.println("rectangle should fit in the image");
		}
	}
	  
	
}
