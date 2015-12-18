package QuestionC;

public class IllegalRectangle extends Rectangle {

	public IllegalRectangle(int newx, int newy) {
		super(newx, newy);
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

public void IllegalRectangle() throws
        IllegalRectangleException
{
if(newx <= 0, newy <= 0);
{
	return this.getX() * this.getY();
}
else
{
return 
throw new IllegalRectangleException();
}
}