package QuestionB;

public class Circle extends Shape implements iShape, iCircleRead {
	
	
	private int radius;
	final double PI = 3.14159;
			
	
	public Circle(int newx, int newy, int newradius) {
		super(newx, newy);
		setRadius(newradius);
	}
	int getRadius();

	double ComputeArea();
	
	
	void draw();
}
	@Override
	public int getRadius() {
		return radius;
	}

	/*
	 * {@link Circle#radius}
	 */
	public void setRadius(int newradius) {
		radius = newradius;
	}
	public interface iCircleRead {

		
		int getRadius();

		double ComputeArea();

		
		void draw();

	}
	@Override
	public double ComputeArea()
	{
		return this.radius * this.radius * PI;
	}
	public interface iCircleRead {

		int getRadius();

		double ComputeArea();


		void draw();

	}
	@Override
	public void draw() {
		System.out.println("Drawing a Circle at:(" + getX() + ", " + getY()
				+ "), radius " + getRadius());
	}
}