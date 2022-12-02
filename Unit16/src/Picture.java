import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
import java.util.random.*;
/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
	///////////////////// constructors //////////////////////////////////

	/**
	 * Constructor that takes no arguments
	 */
	public Picture() {
		/*
		 * not needed but use it to show students the implicit call to super() child
		 * constructors always call a parent constructor
		 */
		super();
	}

	/**
	 * Constructor that takes a file name and creates the picture
	 * 
	 * @param fileName the name of the file to create the picture from
	 */
	public Picture(String fileName) {
		// let the parent class handle this fileName
		super(fileName);
	}

	/**
	 * Constructor that takes the width and height
	 * 
	 * @param height the height of the desired picture
	 * @param width  the width of the desired picture
	 */
	public Picture(int height, int width) {
		// let the parent class handle this width and height
		super(width, height);
	}

	/**
	 * Constructor that takes a picture and creates a copy of that picture
	 * 
	 * @param copyPicture the picture to copy
	 */
	public Picture(Picture copyPicture) {
		// let the parent class do the copy
		super(copyPicture);
	}

	/**
	 * Constructor that takes a buffered image
	 * 
	 * @param image the buffered image to use
	 */
	public Picture(BufferedImage image) {
		super(image);
	}

	////////////////////// methods ///////////////////////////////////////

	/**
	 * Method to return a string with information about this picture.
	 * 
	 * @return a string with information about the picture such as fileName, height
	 *         and width.
	 */
	public String toString() {
		String output = "Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth();
		return output;

	}

	/** Method to set the blue to 0 */
	public void zeroBlue() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setBlue(0);
			}
		}
	}

	public void zeroRed() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setRed(0);
			}
		}
	}

	public void zeroGreen() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				pixelObj.setGreen(0);
			}
		}
	}

	public void toGray() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				int a = (int) pixelObj.getAverage();
				pixelObj.setGreen(a);
				pixelObj.setBlue(a);
				pixelObj.setRed(a);
			}
		}
	}

	public void FishEnhance() {
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {
				if (pixelObj.getBlue() < 160 || pixelObj.getRed() > 28) {
					int a = (int) pixelObj.getAverage();
					pixelObj.setGreen(a);
					pixelObj.setBlue(a);
					pixelObj.setRed(a);
				}
			}
		}
	}

	/**
	 * Method that mirrors the picture around a vertical mirror in the center of the
	 * picture from left to right
	 */
	public void mirrorVertical() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < width / 2; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][width - 1 - col];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorDiag() {
		Pixel[][] pixels = this.getPixels2D();
		Pixel thisPixel = null;
		Pixel otherPixel = null;
		int width = pixels[0].length;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < row; col++) {
				thisPixel = pixels[row][col];
				otherPixel = pixels[col][row];
				otherPixel.setColor(thisPixel.getColor());
				
				
			}
		}
	}
	
	/** Mirror just part of a picture of a temple */
	public void mirrorTemple() {
		int mirrorPoint = 276;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 27; row < 97; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 13; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	public void mirrorArms() {
		int mirrorPoint = 190;
		Pixel topPixel = null;
		Pixel bottomPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 157; row < mirrorPoint; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 113; col < 300; col++) {

				topPixel = pixels[row][col];
				bottomPixel = pixels[mirrorPoint - row + mirrorPoint][col];
				bottomPixel.setColor(topPixel.getColor());
			}
		}
	}
	
	public void mirrorGull() {
		int mirrorPoint = 350;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int count = 0;
		Pixel[][] pixels = this.getPixels2D();

		// loop through the rows
		for (int row = 235; row < 320; row++) {
			// loop from 13 to just before the mirror point
			for (int col = 235; col < mirrorPoint; col++) {

				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/**
	 * copy from the passed fromPic to the specified startRow and startCol in the
	 * current picture
	 * 
	 * @param fromPic  the picture to copy from
	 * @param startRow the start row to copy to
	 * @param startCol the start col to copy to
	 */
	public void copy(Picture fromPic, int startRow, int startCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	/** Method to create a collage of several pictures */
	public void createCollage() {
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy(flower1, 0, 0);
		this.copy(flower2, 100, 0);
		this.copy(flower1, 200, 0);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy(flowerNoBlue, 300, 0);
		this.copy(flower1, 400, 0);
		this.copy(flower2, 500, 0);
		this.mirrorVertical();
		this.write("collage.jpg");
	}

	/**
	 * Method to show large changes in color
	 * 
	 * @param edgeDist the distance for finding edges
	 */
	public void edgeDetection(int edgeDist) {
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		for (int row = 0; row < pixels.length; row++) {
			for (int col = 0; col < pixels[0].length - 1; col++) {
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][col + 1];
				rightColor = rightPixel.getColor();
				if (leftPixel.colorDistance(rightColor) > edgeDist)
					leftPixel.setColor(Color.BLACK);
				else
					leftPixel.setColor(Color.WHITE);
			}
		}

	}
	
	public void edgeDetection2() {
		/*Pixel[][] picturePixels = this.getPixels2D();
		Pixel[][] editedPixels = new Pixel[picturePixels.length][picturePixels[0].length];
		Random r=new Random();
		while(!complete(editedPixels)) {
			int[] coords=nextCoords(editedPixels);
			int x=coords[0];
			int y=coords[1];
			if(editedPixels[x][y] == null) {
				Pixel p=picturePixels[x][y];
				spread(picturePixels, editedPixels, x, y, p.getRed()-p.getRed()%10, p.getGreen()-p.getGreen()%10, p.getBlue()-p.getBlue()%10);
			
			}
		
		}
		
		picturePixels=editedPixels;
		*/
		Pixel[][] pixels = this.getPixels2D();
		
		for(Pixel[] rowArray : pixels) {
			for(Pixel p : rowArray) {
				int avg=(p.getRed()+p.getGreen()+p.getBlue())/3;
					if(avg<30) {
						p.setRed(0);
						p.setBlue(0);
						p.setGreen(0);
					}else if(avg<100) {
					
					p.setRed(50);
					p.setBlue(50);
					p.setGreen(50);
					}else if(avg<200){
						p.setRed(150);
						p.setBlue(150);
						p.setGreen(150);
					}else {
						p.setRed(200);
						p.setBlue(200);
						p.setGreen(200);
					}
				
			}
		}
		
	
		for(int i=0; i<pixels.length; i++) {
			for(int j=0; j<pixels[i].length-1; j++) {
				
				if(pixels[i][j].getRed() != pixels[i][j+1].getRed()) {
					pixels[i][j].setRed(0);
					pixels[i][j].setBlue(0);
					pixels[i][j].setGreen(0);
				}else {
					
					pixels[i][j].setRed(255);
					pixels[i][j].setBlue(255);
					pixels[i][j].setGreen(255);
				}
				
		}
			
		}
	}
	
	private void spread(Pixel[][] master, Pixel[][] pix, int x, int y, int r, int g, int b) {
		
		if(x<pix.length && y<pix[0].length && x>=0 && y>=0) {
		if(pix[x][y] == null) {
			if(Math.abs(master[x][y].getRed()-r)<75 && Math.abs(master[x][y].getGreen()-g)<75 && Math.abs(master[x][y].getBlue()-b)<75) {
			System.out.println(x);
			System.out.println(y);
			pix[x][y]=new Pixel(this, x, y);
			master[x][y].setRed(r);
			master[x][y].setGreen(g);
			master[x][y].setBlue(b);
			
			Random rand=new Random();
			spread(master, pix, x+rand.nextInt(-1, 2), y+rand.nextInt(-1, 2), r, g, b);
		
		}
		}
		
	
		
		}
	}
	
	private int[] nextCoords(Pixel[][] pix) {
		for(int i=0; i<pix.length; i++) {
			for(int j=0; j<pix[i].length; j++) {
				if(pix[i][j] == null) {
					return new int[] {i, j};
				}
			}
		}
		return new int[] {0, 0};
	}
	
	private boolean complete(Pixel[][] pix) {
		for(Pixel[] rowArray : pix) {
			for(Pixel pixel : rowArray) {
				if(pixel == null) {
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * Main method for testing - each class in Java can have a main method
	 */
	public static void main(String[] args) {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	public void negate() {
		// TODO Auto-generated method stub
		Pixel[][] pixels = this.getPixels2D();
		for (Pixel[] rowArray : pixels) {
			for (Pixel pixelObj : rowArray) {

				pixelObj.setGreen(255 - pixelObj.getGreen());
				pixelObj.setBlue(255 - pixelObj.getBlue());
				pixelObj.setRed(255 - pixelObj.getRed());
			}
		}
	}

	public void encode(Picture messagePict) {
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		int changedPixels = 0;
		int[] encodes=new int[10];
		int pixelsbyOne=0;
		for(int i=0; i<currPixels.length; i++) {
			for(int j=0; j<currPixels[i].length; j++) {
				encodes[currPixels[i][j].getRed()%10]++;
			}
		}
		
		int min=encodes[0];
		int codex=0;
		for(int i=1; i<encodes.length; i++) {
			if(encodes[i]<min) {
				min=encodes[i];
				codex=i;
			}
		}
		
		for (Pixel[] rowArray : currPixels) {
			for (Pixel pixelObj : rowArray) {
				if(pixelObj.getRed()%10 == codex) {
					
					
					pixelObj.setRed(pixelObj.getRed()+1);
					changedPixels++;
					pixelsbyOne++;
					
				}
			}
		}
		
		String currcolor="white";
		for(int i=0; i<messagePixels.length; i++) {
			
			if(messagePixels[i][0].getRed()<123 && currcolor.equals("white")) {
				Pixel p=currPixels[i][messagePixels[i].length-1];
				p.setRed(getEncode(p, codex));
		
				changedPixels++;
				currcolor="black";
			}else if(messagePixels[i][0].getRed()>=123 && currcolor.equals("black")) {
				Pixel p=currPixels[i][messagePixels[i].length-1];
				p.setRed(getEncode(p, codex));
				
				changedPixels++;
				currcolor="white";
			}
			
			for(int j=0; j<messagePixels[i].length; j++) {
				if(messagePixels[i][j].getRed()<123 && currcolor.equals("white")) {
					Pixel p=currPixels[i][j];
					p.setRed(getEncode(p, codex));
					//p.setRed(240+codex);
					changedPixels++;
					currcolor="black";
				}else if(messagePixels[i][j].getRed()>=123 && currcolor.equals("black")) {
					Pixel p=currPixels[i][j];
					p.setRed(getEncode(p, codex));
					//p.setRed(240+codex);
					changedPixels++;
					currcolor="white";
				}
			}
		}
		
		
		/*for (int row = 0; row < this.getHeight(); row++) {
			for (int col = 0; col < this.getWidth(); col++) {
// if the current pixel red is odd make it even
				currPixel = currPixels[row][col];
				if (currPixel.getRed() % 2 == 1)
					currPixel.setRed(currPixel.getRed() - 1);
				messagePixel = messagePixels[row][col];
				if (messagePixel.colorDistance(Color.BLACK) < 50) {
					currPixel.setRed(currPixel.getRed() + 1);
					count++;
				}
			}
		}*/
		System.out.println(Arrays.toString(encodes));
		System.out.println("Codex:"+codex);
		System.out.println("Changed Pixels: "+changedPixels);
		System.out.println("Percentage of those changed by only 1: "+(pixelsbyOne*100/changedPixels));
		
	}

	/**
	 * Method to decode a message hidden in the red value of the current picture
	 * 
	 * @return the picture with the hidden message
	 */
	public Picture decode() {
		Pixel[][] pixels = this.getPixels2D();
		int height = this.getHeight();
		int width = this.getWidth();
		int[] encodes=new int[10];
		Picture messagePicture = new Picture(height, width);
		Pixel[][] messagePixels = messagePicture.getPixels2D();
		
		
		for(int i=0; i<pixels.length; i++) {
			for(int j=0; j<pixels[i].length; j++) {
				encodes[pixels[i][j].getRed()%10]++;
			}
		}
		
		int min=encodes[0];
		int codex=0;
		for(int i=1; i<encodes.length; i++) {
			if(encodes[i]<min && encodes[i] !=0) {
				min=encodes[i];
				codex=i;
			}
		}
		
		
		int currcolor=30;
		for(int i=0; i<pixels.length; i++) {
			
			if(matches(pixels[i][0], codex)) {
				
				currcolor=30;
				
			}else {
				currcolor=235;
			}
			
			for(int j=0; j<pixels[i].length; j++) {
				if(matches(pixels[i][j], codex)) {
					
					if(currcolor==235) {
						currcolor=30;
					
					}else {
						currcolor=235;
						
					}
						
				}
				
				
					messagePixels[i][j].setBlue(currcolor);
					messagePixels[i][j].setRed(currcolor);
					messagePixels[i][j].setGreen(currcolor);
			
					
			}
		}
		
		System.out.println("Codex: "+codex);
		
		return messagePicture;
	}

	private int getEncode(Pixel pix, int code) {
		int redval=pix.getRed();
		int redten=redval-(redval%10);
		int high=redten+code;
		int low=(redten-10)+code;
		
		if((high-redval)<(redval-low) || low<code) {
			return high;
		}
		
		return low;

	}
	
	private boolean matches(Pixel pix, int code) {
		int end=pix.getRed();
		end=end%10;
		return end==code;
	}

	public void createPartialCollage() {
		// TODO Auto-generated method stub
		Picture flower1 = new Picture("flower1.jpg");
		Picture flower2 = new Picture("flower2.jpg");
		this.copy2(flower1, 0, 0, 50, 50);
		this.copy2(flower2, 100, 0, 150, 50);
		this.copy2(flower1, 200, 0, 250, 50);
		Picture flowerNoBlue = new Picture(flower2);
		flowerNoBlue.zeroBlue();
		this.copy2(flowerNoBlue, 300, 0, 350, 150);
		this.copy2(flower1, 400, 0, 450, 150);
		this.copy2(flower2, 500, 0, 550, 150);
		this.mirrorVertical();
		this.write("collage.jpg");
	}
	
	public void copy2(Picture fromPic, int startRow, int startCol, int endRow, int endCol) {
		Pixel fromPixel = null;
		Pixel toPixel = null;
		Pixel[][] toPixels = this.getPixels2D();
		Pixel[][] fromPixels = fromPic.getPixels2D();
		for (int fromRow = 0, toRow = startRow; fromRow < endRow && fromRow < fromPixels.length
				&& toRow < toPixels.length; fromRow++, toRow++) {
			for (int fromCol = 0, toCol = startCol; fromCol < endCol && fromCol < fromPixels[0].length
					&& toCol < toPixels[0].length; fromCol++, toCol++) {
				fromPixel = fromPixels[fromRow][fromCol];
				toPixel = toPixels[toRow][toCol];
				toPixel.setColor(fromPixel.getColor());
			}
		}
	}

	public void Chromakey(Picture newbackground) {
		// TODO Auto-generated method stub
		Pixel[][] pixels = this.getPixels2D();
		Pixel[][] newpixels=newbackground.getPixels2D();
		
		for(Pixel[] rowArray : pixels) {
			for(Pixel p : rowArray) {
				if(p.getBlue()>(p.getRed()+p.getGreen())) {
					Pixel np=newpixels[p.getY()][p.getX()];
					p.setBlue(np.getBlue());
					p.setGreen(np.getGreen());
					p.setRed(np.getRed());
				}
			}
		}
	}
	
	
	
	
} // this } is the end of class Picture, put all new methods before this

