package com.COMReport.ui;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.COMReport.domain.*;
import com.COMReport.techServ.BlockSectionDA;
import com.COMReport.techServ.StudentDA;

public class COMReport {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		new COMReport();
	}

	
	public COMReport() throws FileNotFoundException {
		
		BlockSectionDA blockSectionDA = new BlockSectionDA();
		BlockSection blockSection = blockSectionDA.getBlockSection();
		
		System.out.println(blockSection);
		
	}
}
