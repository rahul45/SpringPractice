package com.ems.drawing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Triangle {
	
/*	private String type;
	private int h;
	public Triangle(String type){
		this.type=type;
		System.out.println("inside type only");
	}
	public Triangle(String type,int h){
		this.type=type;
		this.h=h;
		System.out.println("inside the constructorfor double argument");
	}
	
	public Triangle(int h){
		this.h=h;
		System.out.println("inside height only");
	}
	public void setH(int h){
		this.h=h;
	}

	public int getH() {
		return h;
	}

	public void draw(){
		System.out.println("draw triangle inside Triangle");
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	*/
@Autowired
private Point pointA;
@Autowired
private Point pointB;
@Autowired
private Point pointC;

public Point getPointA() {
	return pointA;
}
public void setPointA(Point pointA) {
	this.pointA = pointA;
}
public Point getPointB() {
	return pointB;
}
public void setPointB(Point pointB) {
	this.pointB = pointB;
}
public Point getPointC() {
	return pointC;
}
public void setPointC(Point pointC) {
	this.pointC = pointC;
}
public void draw(){
	System.out.println("PointA("+getPointA().getX()+","+getPointA().getY()+
			")\nPointB("+getPointB().getX()+","+getPointB().getY()+
			")\nPointC("+getPointC().getX()+","+getPointC().getY()+")");
}
	/*list*/
	/*private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw(){
		for(Point list: points){
			System.out.println("PointA("+list.getX()+","+list.getY()+")");
		}
	}*/
	
	
	
}
