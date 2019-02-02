package ch.bbw.mashup;

/**
 * @author  Mehmet Gül
 * @version 1.0
 *
 */

public class Koordinaten {
	
	private double xKoordinate;
	private double yKoordinate;
	
	
	public Koordinaten(Double xKoordinate, Double yKoordinate) {
		
		this.xKoordinate = xKoordinate;
		this.yKoordinate = yKoordinate;
		
	}
	public double getxKoordinate() {
		return xKoordinate;
	}
	public void setxKoordinate(double xKoordinate) {
		this.xKoordinate = xKoordinate;
	}
	public double getyKoordinate() {
		return yKoordinate;
	}
	public void setyKoordinate(double yKoordinate) {
		this.yKoordinate = yKoordinate;
	}
	
	

}
