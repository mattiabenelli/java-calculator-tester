package org.java.calc;


public class Calcolatrice {
	
	private float num1;
	private float num2;
	
	public Calcolatrice(float num1, float num2) {
		setNum1(num1);
		setNum2(num2);
	}
	
	public float getNum1() {
		return num1;
	}
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public float getNum2() {
		return num2;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	
	public float add() {
		return num1 + num2;
	}
	
	public float subtract() {
		return num1 - num2;
	}
	
	public float divide() throws Exception {
		if(num2 == 0) {
			throw new IllegalAccessException();
		}
		return num1 / num2;
	}
	public float multiply() {
		return num1 * num2;
	}
	
}
