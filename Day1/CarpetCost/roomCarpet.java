package CarpetCost;

public class roomCarpet {
	roomDimension roomdimension;
	int cost;
	public roomCarpet(roomDimension roomdimension,int cost) {
		this.roomdimension = roomdimension;
		this.cost = cost;
	}
	public int carpetCostCalculator() {
		 return roomdimension.areaOfRoom()*cost;
	}

}
