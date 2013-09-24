package com.wildelake.battleship;

public class Board {
	private CellState[][] attacksAgainst;	//This is what the other player's attacks are shown on. It's altered by incomingAttack() and accessed by cellState().
	private CellState[][] attacksBy;		//This is what attacks a player has made. It's altered by outgoingAttack().
	private Ship[] containedShips;
	
	// TODO
	public boolean incomingAttack(int x, int y) {			//Returns true if hit and false if not a hit. 
		//The code here should check the incoming coordinate against each ship, and if it's in any, mark that cell as hit. 
		return false;	
	}
	public boolean outgoingAttack(int x, int y, Board b){	//Returns true if hit and false if not a hit. 
		return false;
	}
	// TODO
	public CellState cellState(int x, int y) {				//Returns the state of the targeted cell of this board (Ie, attacksAgainst). 
		return CellState.Hit;
	}
	public enum CellState {
		Hit, Miss, Untargetted;
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
