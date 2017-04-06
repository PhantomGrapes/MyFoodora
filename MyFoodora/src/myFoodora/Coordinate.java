package myFoodora;

public class Coordinate {
	 
	private int x;
	private int y;
	
	public Coordinate(int _x, int _y){
		this.x = _x;
		this.y = _y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public static double distanceBetweenTwoLocation(Coordinate c1, Coordinate c2){
		double distance = 0;
		distance = Math.sqrt((c1.getX()-c2.getX())*(c1.getX()-c2.getX()) + (c1.getY()-c2.getY())*(c1.getY()-c2.getY()));
		return distance;
	}
}

