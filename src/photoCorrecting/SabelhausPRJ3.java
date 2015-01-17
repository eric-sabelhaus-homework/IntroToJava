package photoCorrecting;
/*
 * Author: Eric Sabelhaus
 * 
 */
import java.awt.Color;
import java.io.*;
import javax.swing.JOptionPane;

class SabelhausPRJ3 {
	
	public static void main(String[] args) throws IOException {
		//initialize Max Pixel value array
		int[] localMax = new int[3];
		
		//declare file names
		String fileFolder1 = JOptionPane.showInputDialog("Input encrypted photo path");
		String fileFolder2 = JOptionPane.showInputDialog("Input decrypted photo path");
		
		//open input and output streams
		InputStream photoFile = new FileInputStream(fileFolder1);
		OutputStream photoFile2 = new FileOutputStream(fileFolder2);
		
		//Instantiate new picture object from .png file
		Picture picture1 = new Picture(photoFile);
		
		//Calculate the total pixels, then print it to the console
		int pixelCount = PixelDecryptor.getPixelCount(picture1.getHeight(), picture1.getWidth());
		System.out.println("Total pixels:\t" + pixelCount);
		
		//Decrypt the picture and get max pixel values
		for (int row=0; row < picture1.getHeight(); row++) {
			
			Color[] pixels = picture1.getPixels(row);
			
			for(int col=0; col < picture1.getWidth(); col++) {
				int[] maxRGB = PixelDecryptor.getMaxColorValues(pixels[col]);
				for(int i=0; i < maxRGB.length; i++) {
					localMax[i] = PixelDecryptor.setMaxColorValues(maxRGB[i], localMax[i]);
				}
				pixels[col] = PixelDecryptor.decryptPixel(pixels[col]);
			}
			picture1.setPixels(row, pixels);
		}
		
		//output max pixel value
		System.out.println("Max r value:\t" + localMax[0]);
		System.out.println("Max g value:\t" + localMax[1]);
		System.out.println("Max b value:\t" + localMax[2]);
		
		//generate the decrypted picture
		picture1.write(photoFile2);
			
	}
}
