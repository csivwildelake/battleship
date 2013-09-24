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
		return b.incomingAttack(x, y);
	}
	// TODO
	public CellState cellState(int x, int y) {				//Returns the state of the targeted cell of this board (Ie, attacksAgainst). 
		return CellState.Hit;
	}
	public enum CellState {
		Hit, Miss, Untargetted;
	}
	
	private Board(Builder b) {}
	
	/**
	 * Creates a board with the specified ships.
	 * 
	 * @author adrusi
	 */
	public class Builder {
		Ship.AircraftCarrier aircraftCarrier;
		Ship.Battleship battleShip;
		Ship.Cruiser cruiser;
		Ship.Destroyer destroyer;
		Ship.Submarine submarine;
		
		public class DuplicateShipException extends Exception {
			private static final long serialVersionUID = 431691699567492906L;
		}
		
		/**
		 * Places a ship on the board.
		 * 
		 * @author adrusi
		 * @param ship
		 * @throws IllegalArgumentException when an unrecognized type of ship is added
		 * @throws DuplicateShipException when two ships of the same type are added.
		 */
		public void addShip(Ship ship) throws IllegalArgumentException, DuplicateShipException {
			Class<? extends Ship> klass = ship.getClass();
			if (klass.equals(Ship.AircraftCarrier.class)) {
				if (aircraftCarrier != null) throw new DuplicateShipException();
				aircraftCarrier = (Ship.AircraftCarrier) ship;
			}
			else if (klass.equals(Ship.Battleship.class)) {
				if (battleShip != null) throw new DuplicateShipException();
				battleShip = (Ship.Battleship) ship;
			}
			else if (klass.equals(Ship.Cruiser.class)) {
				if (cruiser != null) throw new DuplicateShipException();
				cruiser = (Ship.Cruiser) ship;
			}
			else if (klass.equals(Ship.Destroyer.class)) {
				if (destroyer != null) throw new DuplicateShipException();
				destroyer = (Ship.Destroyer) ship;
			}
			else if (klass.equals(Ship.Submarine.class)) {
				if (submarine != null) throw new DuplicateShipException();
				submarine = (Ship.Submarine) ship;
			}
			else {
				throw new IllegalArgumentException("Invalid Ship Type");
			}
		}
		
		public Board build() {
			return new Board(this);
		}
	}
	
	
	
	
	
	
}
