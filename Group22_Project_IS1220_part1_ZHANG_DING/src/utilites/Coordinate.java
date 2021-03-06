package utilites;

/**
 * @author Shoulong
 * Address type data class.
 */

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
	
	// has to be a double class instead of primitive type
	public static Double distanceBetweenTwoLocation(Coordinate c1, Coordinate c2){
		Double distance;
		distance = Math.sqrt((c1.getX()-c2.getX())*(c1.getX()-c2.getX()) + (c1.getY()-c2.getY())*(c1.getY()-c2.getY()));
		return distance;
	}
	
	// transform string like (1,2) to coordinate
	public static Coordinate stringToCoordinate(String s)throws Exception{
		if(!s.startsWith("(") || !s.endsWith(")"))
			throw new Exception("Coordinate parse error.");
		s = s.substring(1, s.length()-1);
		String[] cs = s.split(",");
		Coordinate c = new Coordinate(Integer.parseInt(cs[0]), Integer.parseInt(cs[1]));
		return c;
	}
}

