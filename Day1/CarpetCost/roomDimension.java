package CarpetCost;

public class roomDimension {
	int length;
	int width;
	public roomDimension(int length,int width) {
		this.length = length;
		this.width = width;
	}
	public int areaOfRoom() {
		return length*width;
	}

}
