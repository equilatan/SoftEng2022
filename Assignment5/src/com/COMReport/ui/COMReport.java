package com.COMReport.ui;

import java.io.FileNotFoundException;
import com.COMReport.techServ.BlockSectionDA;

public class COMReport {

	public static void main(String[] args) throws FileNotFoundException {
		
		new COMReport();
	}

	
	public COMReport() throws FileNotFoundException {
		
		BlockSectionDA blockSectionDA = new BlockSectionDA();
		
		//using toString function on domain objects
		System.out.println(blockSectionDA.getBlockSection());
		
	}
}
