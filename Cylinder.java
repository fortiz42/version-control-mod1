package COP2805;

public class Cylinder extends Shape3D {
	
	private int radius;
	private int height;
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double Volume() {
		return Math.PI*radius*radius*height;
	}
}
