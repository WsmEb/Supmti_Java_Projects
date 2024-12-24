package myTestPackage1;

public class Rectangle {
	
	private float Width;
	private float Height;
	
	
	public Rectangle() {
		this.Height = 10;
		this.Width = 22.6f;
	}
	
	public Rectangle(float h,float w) 
	{
		this.Height = h;
		this.Width = w;
	}
	
	public float perimetre() {
		return (this.Width + this.Height) * 2;
	}
	
	public float surface() {
		return this.Height * this.Width;
	}
	
	

}
