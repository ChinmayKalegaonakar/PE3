package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import stackroute.Matrix;
import stackroute.Vowels;

class Tests {

	@Test
	void matrixTest() {
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = {9,8,7,6,5,4,3,2,1};
		int[] c = {10,10,10,10,10,10,10,10,10,10};
		Matrix A = new Matrix(3,3,a);
		Matrix B = new Matrix(3,3,b);
		Matrix C = new Matrix(3,3,c);
		Matrix res = Matrix.addMatrix(A, B);
		assertEquals("Matrix test",C,res);
	}
	
	@Test
	void vowelsTest() {
		String[] in = {"this","is","java","programming"};
		String[] out = {"ths","s","jv","prgrmmng"};
		assertEquals("Vowels test",out,Vowels.removeVowels(in));
	}

}
