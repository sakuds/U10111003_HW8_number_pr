
// U10111003 朱永捷

import java.math.BigDecimal;

public class Accurate {

	// Define data fields
	private String x = 0;
	private String y = 0;

	// No-argument constructor
	public Accurate(){
	}

	// Constructorto store two big integer
	public Accurate(String newX,String newY){
		setX(newX);
		setY(newY);
	}

	// Setting methods
	public void setX(String newX){
		x = newX;
	}
	public void setY(String newY){
		y = newY;
	}

	// add method
	public double add() {
		BigDecimal num1 = new BigDecimal("x");
		BigDecimal num2 = new BigDecimal("y");
		return num1.add(num2).doubleValue();
	}

	// subtract method
	public double sub(){
		BigDecimal num1 = new BigDecimal("x");
		BigDecimal num2 = new BigDecimal("y");
		return num1.subtract(num2).doubleValue();
	}

	// multiply method
	public double multi(){
		BigDecimal num1 = new BigDecimal("x");
		BigDecimal num2 = new BigDecimal("y");
		return num1.multiply(num2).doubleValue();
	}

	// sub method
	public double subtracInt(){
			BigDecimal num1 = new BigDecimal("x");
			BigDecimal num2 = new BigDecimal("y");
			return num1.divide(num2).doubleValue();
	}
}
