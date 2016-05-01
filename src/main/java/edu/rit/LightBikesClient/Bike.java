/*
 * Copyright (c) 2016 Felice Aprile, Justin W. Flory, Malcolm Jones, Timothy Endersby
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package edu.rit.LightBikesClient;

import java.util.concurrent.TimeUnit;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import sun.net.www.content.text.plain;

/**
 * Bike.java
 *
 * Assignment: Final Project
 * Class: Rochester Institute of Technology, ISTE-121.01, 2155
 * Professor: Michael Floeser
 *
 *
 *
 * @author Felice Aprile
 * @author Justin W. Flory
 * @author Malcolm Jones
 * @author Timothy Endersby
 * @version 2016.04.11.v1
 */
public class Bike {
<<<<<<< HEAD
	public int xPosition;
	public int yPosition;
	public int[][] grid;
	public int player;
    private final int DELAY_IN_MILLS = 100;
	
	public Bike(int _xPosition, int _yPosition, int[][] _grid, int _player){
=======

    private final int DELAY_IN_MILLS = 100;

    private int player;
    private int xPosition;
    private int yPosition;
    private Grid grid;

	public Bike(int _xPosition, int _yPosition, Grid _grid, int _player){
>>>>>>> origin/master
		xPosition = _xPosition;
		yPosition = _yPosition;
		grid = _grid;
		player = _player;
	}
	
	/*
	 * Info for each turn*() method.
	 * First line sets the array value in the direction bike is going to bike id.
	 * Second line changes bikes position.
	 * Try loop delays bike movement.
	 */

	public void turnWest(){
		while(true){
			grid[xPosition-1][yPosition] = player;
			xPosition = xPosition - 1;
			try{
				TimeUnit.MILLISECONDS.sleep(DELAY_IN_MILLS);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}

	public void turnEast(){
		while(true){
			grid[xPosition+1][yPosition] = player;
			xPosition = xPosition + 1;
			try{
				TimeUnit.MILLISECONDS.sleep(DELAY_IN_MILLS);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}

	public void turnSouth(){
		while(true){
			grid[xPosition][yPosition+1] = player;
			yPosition = yPosition + 1;
			try{
				TimeUnit.MILLISECONDS.sleep(DELAY_IN_MILLS);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}

	public void turnNorth(){
		while(true){
			grid[xPosition][yPosition-1] = player;
			yPosition = yPosition - 1;
			try{
				TimeUnit.MILLISECONDS.sleep(DELAY_IN_MILLS);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}

}