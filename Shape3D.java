package COP2805;

abstract public class Shape3D implements Comparable<Shape3D> 
{	
	abstract public double Volume();
	
	public int compareTo(Shape3D other)
	{
		if(this.Volume() > other.Volume()) {
			return 1;
		}
		else if(this.Volume() < other.Volume()) { 
			return -1;
		}
		else {
			return 0;
		}
	}	
}

	