package COP2805;

public class Test {

	public static void main(String[] args) 
	{
		Cuboid cuboid = new Cuboid(10,14,13);
		Cylinder cylinder = new Cylinder(5,12);
		
		if(cuboid.compareTo(cylinder) == 1)
			System.out.println("Cuboid has the greater volume");
		else if(cuboid.compareTo(cylinder) == -1)
			System.out.println("Cylinder has the greater volume");
		else
			System.out.println("Both the cuboid and the cylindere have equal volumes");
		
	}
}
