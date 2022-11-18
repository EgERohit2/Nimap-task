package types;

import java.awt.Point;

public class point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		Point point1 = new Point(x=1,y=1);
		Point point2 = point1;
		point1.x=5;
		
		System.out.println(point2);
	}

}
