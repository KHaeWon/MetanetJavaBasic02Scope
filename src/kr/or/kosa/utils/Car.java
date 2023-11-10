package kr.or.kosa.utils;

public class Car {

		//이렇게 쓰는 경우는 없다
		//int door;//default
		//public String color;
		
		private int door;
		private String color;
		
		public int getDoor() {
			return door;
		}
		public void setDoor(int door) {
			this.door = door;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		AirPlane a = new AirPlane();

}
