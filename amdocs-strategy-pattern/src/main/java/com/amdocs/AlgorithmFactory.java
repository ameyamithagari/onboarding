package com.amdocs;

public class AlgorithmFactory {
	
	public static IAlgorithm getAlgorithm( int algorithmNo) {
		IAlgorithm algorithm= null;
		if(algorithmNo==1)
			algorithm = new HeapSort();
		else if(algorithmNo==2)
			algorithm = new InsertionSort();
		else if(algorithmNo==3)
			algorithm = new QuickSort();
		else
			algorithm= new NullAlgorithm();
		return algorithm; 
	}

}
