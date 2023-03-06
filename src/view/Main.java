package view;

import Controller.ThreadMat;

public class Main {

	public static void main(String[] args) {
		 int [][]mat= new int [3][5];
		 
		 for(int l=0;l<3;l++) 
		 {
			for(int c=0;c<5;c++)
			{
			mat[l][c]=(int)	(Math.random()*100)+1;
			}
			
			ThreadMat ThreadMat = new ThreadMat(mat[l],l);
			ThreadMat.start();
		 }
	
		
	}

}
