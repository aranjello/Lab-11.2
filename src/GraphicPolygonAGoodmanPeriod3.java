/*Andrew Goodman
 * Period 3
 * 
 * I did not realize that the regular polygon class was not supposed to draw the polygon,
 * as a result i really had to do barely any work as i just had to move the code that was in the constructor
 * of my regular polygon class to the draw function of this class. Thats really all i did, i had to call
 * attributes from regular polygon with the super. and set the x and y position but that is all.
 */
import gpdraw.*;
public class GraphicPolygonAGoodmanPeriod3 extends RegularPolygonAGoodmanPeriod3{

	public static void main(String[]Args){
		GraphicPolygonAGoodmanPeriod3 poly = new GraphicPolygonAGoodmanPeriod3(91,10);
		poly.moveTo(50,50);
		poly.draw();
	}
	
	private DrawingTool pen = new DrawingTool(new SketchPad(400, 400));
	  private double xPosition, yPosition;

	  // constructors

	  // Initializes a polygon of numSides sides and sideLength
	  // length in the superclass. The polygon is centered at
	  // xPosition = yPosition = 0
	  public GraphicPolygonAGoodmanPeriod3(int numSides, double sideLength){
		  super(numSides,sideLength);
		  xPosition = 0;
		  yPosition = 0;
	  }

	  // Initializes a polygon of numSides sides and sideLength
	  // length in the superclass. The polygon is centered at
	  // xPosition = x and yPosition = y
	  public GraphicPolygonAGoodmanPeriod3(int numSides, double sideLength, double x, double y){
		  super(numSides,sideLength);
		  xPosition = x;
		  yPosition = y;
	  }

	  // public methods

	  // Sets xPosition = x and yPosition = y to correspond to the new
	  // center of the polygon
	  public void moveTo(double x, double y){
		  xPosition = x;
		  yPosition = y;
	  }

	  // Draws the polygon about the center point (xPosition, yPosition).
	  // Uses properties inherited from RegularPolygon to determine the
	  // number and length of the sides, the radius of the inscribed circle,
	  // and the vertex angle with which to draw the polygon
	  public void draw(){
		  	int countNumSides = (int) (super.getNumSide() - 1);
			pen.up();
			pen.move(xPosition,yPosition);
			pen.setDirection(270);
			pen.move(super.getr());
			pen.setDirection(180);
			pen.move(super.getSideLength()/2);
			pen.setDirection(0);
			pen.down();
			while(countNumSides >= 0 ){
				pen.move(super.getSideLength());
				pen.turn(360.0/super.getNumSide());
				countNumSides--;
			}
	  }
}
