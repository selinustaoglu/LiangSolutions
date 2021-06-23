package chapter09.q06;

import java.lang.*;

public class Stopwatch {
	
	//data-fields
	private double startTime;
	private double endTime;
	
	//no-arg constructor
	public Stopwatch(){
		startTime = System.currentTimeMillis();
	}
	
	//methods
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public double getElapsedTime() {
		return endTime - startTime;
	}
}
