/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.zeroRed();
	  beach.zeroGreen();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testFixUnderwater() {
	  Picture fish = new Picture("water.jpg");
	  fish.explore();

	  fish.FishEnhance();
	  fish.explore();
  }
  
  public static void testKeepOnlyRed() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.zeroBlue();
	  beach.zeroGreen();
	  beach.explore();
  }
  
  public static void testNegate() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.negate();;
	  beach.explore();
  }
  
  public static void testKeepOnlyGreen() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.zeroRed();
	  beach.zeroBlue();
	  beach.explore();
  }
  public static void testGrayscale() {
	  Picture beach = new Picture("beach.jpg");
	  beach.explore();
	  beach.toGray();
	  beach.explore();
  }
  
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture arms = new Picture("snowman.jpg");
    arms.explore();
    arms.mirrorArms();
    arms.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture arms = new Picture("seagull.jpg");
    arms.explore();
    arms.mirrorGull();
    arms.explore();
  }
  
  public static void testMirrorDiagonal()
  {
    Picture diag = new Picture("beach.jpg");
    diag.explore();
    diag.mirrorDiag();
    diag.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection2();
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
	testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	 
	  /*

	  */
  }

private static void testChromakey() {
	// TODO Auto-generated method stub
	 Picture canvas = new Picture("blue-mark.jpg");
	 Picture newbackground = new Picture("moon-surface.jpg");
	 canvas.explore();
	
	 canvas.Chromakey(newbackground);
	 canvas.explore();
}

private static void testCopy() {
	// TODO Auto-generated method stub
	 Picture canvas = new Picture("640x480.jpg");
	    canvas.createPartialCollage();
	    canvas.explore();
}

private static void testEncodeAndDecode() {
	  Picture beach = new Picture("640x480.jpg");
	  Picture apple=new Picture("temple.jpg");
	  
	  beach.explore();
	  beach.encode(apple);
	  beach.explore();
	  
	  Picture decoded=beach.decode();
	  decoded.explore();
	
}
}