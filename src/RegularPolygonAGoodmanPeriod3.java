/*Andrew Goodman
 * Period 3
 * 
 * In this lab the hardest part for me was figuring out
 * how to center the polygon between the circle to be inscrbed 
 * on the inside and the circle to be circumscribed on the outside.
 * In the end it was a simple matter of moving down r and to the left
 * half of a side length then setting the direction of the pen to 0.
 * The rest of the lab was easy as it was just copying equations into
 * methods.
 */
public class RegularPolygonAGoodmanPeriod3 {

	/**
	 * @param args
	 */
	private int myNumSides;
	private double mySideLength;
	private double myR;
	private double myr;
	public RegularPolygonAGoodmanPeriod3(){
	}
	public RegularPolygonAGoodmanPeriod3(int numSides, double sideLength){
		mySideLength = sideLength;
		myNumSides = numSides;
		calcR();
		calcr();
		
	}
	private void calcr(){
		myr = .5*mySideLength*(1/Math.tan(Math.PI/myNumSides));
	}
	private void calcR(){
		myR = .5*mySideLength*(1/Math.sin(Math.PI/myNumSides));
	}
	public double vertexAngle(){
		return (double)(myNumSides-2)/myNumSides*180;
	}
	public double Perimeter(){
		return mySideLength * myNumSides;
	}
	public double Area(){
		return .5*myNumSides*Math.pow(myR, 2)*Math.sin(2*Math.PI/myNumSides);
	}
	public double getNumSide(){
		return myNumSides;
	}
	public double getSideLength(){
		return mySideLength;
	}
	public double getr(){
		return myr;
	}
	public double getR(){
		return myR;
	}
}

