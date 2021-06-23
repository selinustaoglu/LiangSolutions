package chapter09.q06;

import java.lang.*;

public class Stopwatch {
	
	//data-fields
	double startTime;
	double endTime;
	
	//no-arg constructor
	Stopwatch(){
		startTime = System.currentTimeMillis();
	}
	
	//methods
	void start() {
		startTime = System.currentTimeMillis();
	}
	
	void stop() {
		endTime = System.currentTimeMillis();
	}
	
	double getElapsedTime() {
		return endTime - startTime;
	}
}
