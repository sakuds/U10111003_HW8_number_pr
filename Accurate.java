
// U10111003 朱永捷

import java.math.BigDecimal;

public class Accurate {

	// Define data fields
	private double x = 0;
	private double y = 0;

	// No-argument constructor
	public Accurate(){
	}

	// Constructorto store two big integer
	public Accurate(double newX,double newY){
		setX(newX);
		setY(newY);
	}

	// Setting methods
	public void setX(double newX){
		x = newX;
	}
	public void setY(double newY){
		y = newY;
	}

	// add method
	public double add() {
		BigDecimal num1 = new BigDecimal(Double.toString(x));
		BigDecimal num2 = new BigDecimal(Double.toString(y));
		return num1.add(num2).doubleValue();
	}

	// subtract method
	public double sub(){
		BigDecimal num1 = new BigDecimal(Double.toString(x));
		BigDecimal num2 = new BigDecimal(Double.toString(y));
		return num1.subtract(num2).doubleValue();
	}

	// multiply method
	public double multi(){
		BigDecimal num1 = new BigDecimal(Double.toString(x));
		BigDecimal num2 = new BigDecimal(Double.toString(y));
		return num1.multiply(num2).doubleValue();
	}

	// sub method and take fifth decimal place.
	public double subtrac(){
			BigDecimal num1 = new BigDecimal(Double.toString(x));
			BigDecimal num2 = new BigDecimal(Double.toString(y));
			return num1.divide(num2,5, BigDecimal.ROUND_DOWN).doubleValue();
	}
}
