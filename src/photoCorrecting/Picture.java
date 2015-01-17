package photoCorrecting;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

/**
 * A 2-dimensional picture which is a simple wrapper on a {@link BufferedImage}
 * which provides methods to get and set rows of pixels as {@link Color}
 * objects. A picture will be read into memory upon construction and can be
 * written at any time. The top row of pixels is row 0 and the bottom row is
 * (height-1).
 * 
 * @author mpilone
 */
public class Picture {

    /**
     * The image data loaded into memory as a 2d raster.
     */
    private final BufferedImage image;

    /**
     * Constructs the picture which will immediately read the image data from
     * the given input stream. The input stream will NOT be closed after
     * reading. That is the responsibility of the caller.
     * 
     * @param instream
     *            the input stream to read the image data from
     * @throws IOException
     *             if the image data can't be read from the stream
     */
    public Picture(InputStream instream) throws IOException {
	image = ImageIO.read(instream);
    }

    /**
     * Constructs the picture which will immediately read the image data from
     * the given file.
     * 
     * @param inputFile
     *            the input file to read the image data from
     * @throws IOException
     *             if the image data can't be read from the file
     */
    public Picture(File inputFile) throws IOException {
	InputStream instream = new FileInputStream(inputFile);
	image = ImageIO.read(instream);
	instream.close();
    }

    /**
     * Writes the picture to the given output stream in PNG format. The output
     * stream will NOT be closed after writing. That is the responsibility of
     * the caller.
     * 
     * @param outstream
     *            the output stream to write the image data to
     * @throws IOException
     *             if the image data can't be written to the stream
     */
    public void write(OutputStream outstream) throws IOException {
	ImageIO.write(image, "PNG", outstream);
    }

    /**
     * Writes the picture to the given output file in PNG format.
     * 
     * @param outputFile
     *            the output file to write the image data to
     * @throws IOException
     *             if the image data can't be written to the file
     */
    public void write(File outputFile) throws IOException {
	OutputStream outstream = new FileOutputStream(outputFile);
	ImageIO.write(image, "PNG", outstream);
	outstream.close();
    }

    /**
     * Returns the width of the image as a count of the number of pixels.
     * 
     * @return the width of the image in pixels
     */
    public int getWidth() {
	return image.getWidth();
    }

    /**
     * Returns the height of the image as a count of the number of pixels.
     * 
     * @return the height of the image in pixels
     */
    public int getHeight() {
	return image.getHeight();
    }

    /**
     * Returns the pixel colors for the given row. A single pixel color is
     * composed of a red, green, and blue value. The number of pixels returned
     * will always be equal to the width of the image.
     * 
     * @param row
     *            the row (vertical) location of the pixels to get
     * @return the pixel colors at the requested row
     * @throws ArrayIndexOutOfBoundsException
     *             if the row is out of bounds
     */
    public Color[] getPixels(int row) throws ArrayIndexOutOfBoundsException {

	// Check if the values are out of bounds.
	if (row >= getHeight() || row < 0) {
	    throw new ArrayIndexOutOfBoundsException(String.format(
		    "Pixel row [%d] is out of bounds.", row));
	}

	int width = image.getWidth();

	Color[] colors = new Color[width];
	for (int x = 0; x < width; ++x) {
	    // Get the RGB value from the image data.
	    int rgb = image.getRGB(x, row);

	    // Create a new color to allow individual access to the RGB values.
	    colors[x] = new Color(rgb);
	}

	return colors;
    }

    /**
     * Sets the pixels at the given row to the colors given. The length of the
     * array must match the width of the image.
     * 
     * @param row
     *            the row (vertical) location of the pixels to set
     * @param pixels
     *            the pixel colors to set
     * @throws ArrayIndexOutOfBoundsException
     *             if the x or y values are out of bounds
     */
    public void setPixels(int row, Color[] pixels)
	    throws ArrayIndexOutOfBoundsException {

	// Check if the values are out of bounds.
	if (row >= getHeight() || row < 0) {
	    throw new ArrayIndexOutOfBoundsException(String.format(
		    "Pixel location [%d] is out of bounds.", row));
	}

	// Check that the row is the right size.
	int width = getWidth();
	if (pixels.length != width) {
	    throw new ArrayIndexOutOfBoundsException(String.format(
		    "Pixel row length [%d] doesn't match picture width [%d].",
		    pixels.length, width));
	}

	for (int x = 0; x < width; ++x) {
	    // Update the image data with the new RGB value from the color.
	    image.setRGB(x, row, pixels[x].getRGB());
	}

    }

}
