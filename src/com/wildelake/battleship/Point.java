package com.wildelake.battleship;

public class Point {
	private int x,y;
	private boolean isHit;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.setHit(false);
	}
//	public void setX(int in) {
//		x = in;
//	}
//	public void setY(int in) {
//		y = in;
//	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean isHit() {
		return isHit;
	}
	public void setHit(boolean isHit) {
		this.isHit = isHit;
	}
	public void hit() {
		this.setHit(true);
	}
	public boolean equals(Object o){
		if(o instanceof Point){
			Point p = (Point) o;
			return ((p.getX() == this.getX())&&(p.getY() == this.getY())&&(p.isHit() == this.isHit()));
		}else{
			return false;	
		}
	}
}
