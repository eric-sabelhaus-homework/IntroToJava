package photoCorrecting;
//import dependencies
import java.awt.Color;
//declare Decryptor class
public class PixelDecryptor {
	//set variables to be used throughout program
	private static int pixelCount = 0;
	private static Color decryptedPixel = null;
	private static int max;
    

	
	PixelDecryptor() {
	}
	/**
     *            
     * filters green and blue out
     * 
     * multiplies red by 10
     * 
     * @param Color pixel
     * 
     * @return manipulated pixel
     */
	public static Color decryptPixel(Color pixel) {
        int red = pixel.getRed();
        int green = pixel.getGreen();
        int blue = pixel.getBlue();
        int rDecrypt = red*10;
        int gDecrypt = green*0;
        int bDecrypt = blue*0;
        decryptedPixel  = new Color(rDecrypt, gDecrypt, bDecrypt);
		return decryptedPixel;
	}
	/**
     *            
     * Generates the total number of pixels
     * @param height and width of picture
     * @return pixelCount
     */
	public static int getPixelCount(int height, int width) {
		pixelCount = height * width;
		
		return pixelCount;
	}
	/**
     *            
     * Generates an array of the RGB value of a pixel
     * 
     * @param Color pixel
     * 
     * @return Integer array of values
     * 
     */
	public static int[] getMaxColorValues(Color maxRGB) {
		int red = maxRGB.getRed(); 
        int green = maxRGB.getGreen();
        int blue = maxRGB.getBlue();
        
        int[] maxColorValue = {red, green, blue};
        
		return maxColorValue;	
	}
	/**
     *            
     * Parses for the max pixel based on current max and local max
     * 
     * @param current value, local max value
     * 
     * @return greatest integer
     * 
     */
	public static int setMaxColorValues(int colorValue, int localColorValue) {
		if (colorValue > localColorValue) {
			max = colorValue;
		} else {
			max = localColorValue;
		}
		return max;
	}
	
}
