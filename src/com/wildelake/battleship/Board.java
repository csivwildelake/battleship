package com.wildelake.battleship;

public class Board {
	// TODO
	public boolean target(int x, int y) {
		return false;
	}
	// TODO
	public boolean cellState(int x, int y) {
		return false;
	}
	private Board(Builder b) {}
	public class Builder {
		Ship aircraftCarrier, battleship, cruiser, destroyer, submarine;
		Ship.AircraftCarrier ac;
		Ship.Battleship bs;
		Ship.Cruiser c;
		Ship.Destroyer d;
		Ship.Submarine s;
		public void addShip(Ship s) throws IllegalArgumentException {
			Class<? extends Ship> c = s.getClass();
			if (c.equals(Ship.AircraftCarrier.class)) {
				if (ac == null) throw new IllegalArgumentException("Duplicate Ship");
			}
			else if (c.equals(Ship.Battleship.class)) {
				if (bs == null) throw new IllegalArgumentException("Duplicate Ship");
				
			}
			else if (c.equals(Ship.Cruiser.class)) {
				if (c == null) throw new IllegalArgumentException("Duplicate Ship");
				
			}
			else if (c.equals(Ship.Destroyer.class)) {
				if (d == null) throw new IllegalArgumentException("Duplicate Ship");
				
			}
			else if (c.equals(Ship.Submarine.class)) {
				if (s == null) throw new IllegalArgumentException("Duplicate Ship");
				
			}
			else {
				throw new IllegalArgumentException("Invalid Ship Type");
			}
		}
	}
}
