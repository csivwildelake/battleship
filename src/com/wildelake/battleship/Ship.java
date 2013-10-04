package com.wildelake.battleship;

import java.util.ArrayList;

public class Ship {
	private ArrayList<Point> hitbox;
	
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
	
	public ArrayList<Point> getHitbox() {
		return hitbox;
	}
	
	//returns true if the ship is hit on all points, false otherwise
	public boolean isSunk() { 
		boolean out = true;
		for(Point p : hitbox) {
			out = out && p.isHit();
		}
		return out;
	}
	public boolean containsPoint(Point p) {
		return hitbox.contains(p);
	}

	public class AircraftCarrier extends Ship {
		public AircraftCarrier(int x, int y, boolean vertical) {
			super(x,y,vertical,5);
		}
	}
	public class Battleship extends Ship {
		public Battleship(int x, int y, boolean vertical) {
			super(x,y,vertical,4);
		}
	}
	public class Cruiser extends Ship {
		public Cruiser(int x, int y, boolean vertical) {
			super(x,y,vertical,3);
		}
	}
	public class Submarine extends Ship {
		public Submarine(int x, int y, boolean vertical) {
			super(x,y,vertical,3);
		}
	}
	public class Destroyer extends Ship {
		public Destroyer(int x, int y, boolean vertical) {
			super(x,y,vertical,2);
		}
	}
}
