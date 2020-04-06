package com.eonsahead.swing;


public class Vector {
	public static void main(String[] args) {
	}
	
	private double x;
	private double y;
	private double z;
	private double w;

	public Vector(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.w = 0;
	}
	
	public void set(int place, double setNum) {
		if (place == 0) {
			this.x = setNum;
		} else if (place == 1) {
			this.y = setNum;
		} else if (place == 2) {
			this.z = setNum;
		} else if (place == 3) {
			this.w = setNum;
		}
	}
	
	public double get(int place) {
		if (place == 0) {
			return this.x;
		} else if (place == 1) {
			return this.y;
		} else if (place == 2) {
			return this.z;
		} else if (place == 3) {
			return this.w;
		} 
		return 0;
	}
	
	public String toString() {
		return "(" + this.x + " ," +
				this.y + " ," +
				this.z + " ," +
				this.w;
	}
	
	public Vector add(Vector otherVect) {
		return new Vector(
				this.x + otherVect.x,
				this.y + otherVect.y,
				this.z + otherVect.z
				);
	}
	
	public double dot(Vector otherVect) {
		return this.x * otherVect.x + 
				this.y * otherVect.y +
				this.z * otherVect.z +
				this.w * otherVect.w;
	}
	
	public Vector scale(double scaleFact) {
		return new Vector(
				this.x * scaleFact,
				this.y * scaleFact,
				this.z * scaleFact
				);
	}
	
	public double magnitude() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
	}
	
	public Vector normalize() {
		return this.scale(1/this.magnitude());
	}
	
	public Vector cross(Vector otherVect) {
		return new Vector(
				this.y*otherVect.z - this.z*otherVect.y,
				this.z*otherVect.x - this.x*otherVect.z,
				this.x*otherVect.y - this.y*otherVect.x
				);
	}
} // Vector
