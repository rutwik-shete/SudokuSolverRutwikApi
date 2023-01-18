package com.rutwik.sudokurutwik;

public class SudokuTable {

	String[][] sudoku;
	float timeElapsed;
	int iterations;
	
	public float getTimeElapsed() {
		return timeElapsed;
	}

	public void setTimeElapsed(float timeElapsed) {
		this.timeElapsed = timeElapsed;
	}

	public int getIterations() {
		return iterations;
	}

	public void setIterations(int iterations) {
		this.iterations = iterations;
	}

	public String[][] getSudoku() {
		return sudoku;
	}
	
	public void setSudoku(String[][] sudoku) {
		this.sudoku = sudoku;
	}
		

}
