
public class Rectangle {
	private float lenght;
	private float width;
	
	Rectangle(){
		lenght = 1.0f;
		width = 1.0f;
	}
	
	/*private float lenght= 1.0f;
	private float width= 1.0f;
	
	Rectangle(){*/
	
	Rectangle(float length,float width){
		this.lenght = length;
		this.width = width;
	}
	
	public float getLength() {
		return this.lenght;
	}
	
	public void setLength(float length) {
		this.lenght = length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;	
	}
	
	public double getArea() {
		return this.lenght * this.width;
	}
	
	public double getPerimeter() {
		return 2 *(this.lenght + this.width);
	}
	
	public String toString() {
		return "Rectangle[length = "+ this.lenght + ",width = " + this.width+"]";
	}
	
}
