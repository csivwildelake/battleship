package com.wildelake.battleship;

import java.util.ArrayList;

public class Ship {
	ArrayList<Point> hitbox;
	private Ship() {
		
	}
	private Ship(int x, int y, boolean vertical, int length) {
		/* x and y determine key point of ship (lowest x, lowest y)
		 * (vertical)?ship is vertically oriented:ship is horizontally oriented
		 * length is the length, in the given direction (increase in x if horizontal, increase in y if vertical)
		 */
		hitbox = new ArrayList<Point>();
		hitbox.add(new Point(x,y));
		for(int i = 1; i < length; i ++) { // i < length because there's already (x,y) in hitbox
			if(vertical) {
				hitbox.add(new Point(x, y + i)); // instantiated as "x + i" or "y + i" because (x,y) are the LEAST coordinates
			} else {
				hitbox.add(new Point(x + i, y));
			}
		}
	}
	
	/* :: Sizes ::
	 * AC: 5 tiles
	 * BS: 4 tiles
	 * Sub: 3 tiles
	 * Cruiser: 3 tiles
	 * Destroyer: 2 tiles
	 */

	public class AircraftCarrier extends Ship {
		
	}
	public class Battleship extends Ship {

	}
	public class Cruiser extends Ship {

	}
	public class Destroyer extends Ship {

	}
	public class Submarine extends Ship {

	}
}
