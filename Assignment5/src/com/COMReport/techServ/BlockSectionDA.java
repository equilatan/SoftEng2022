package com.COMReport.techServ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.COMReport.domain.*;

public class BlockSectionDA {

	private BlockSection blockSection;
	
	public BlockSectionDA() throws FileNotFoundException {

		blockSection = new BlockSection();
		
		//I use linux so instead of C: my root is called /home/
		Scanner blockFile = new Scanner(new FileReader("/home/emiya/git/SoftEng2022/Assignment5/src/blockSectionInfo.csv"));
				
		while(blockFile.hasNext()) {
			String rowBlock = new String();
			rowBlock = blockFile.nextLine();
			String[] rowBlockSectionSpecific = rowBlock.split(",");
			blockSection.setBlockCode(rowBlockSectionSpecific[0]);
			blockSection.setDescription(rowBlockSectionSpecific[1]);
			blockSection.setAdviser(rowBlockSectionSpecific[2]);
		}
		
		StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
		blockSection.setStudentList(studentDA.getStudentList());
		
		
	}
	
	
	
	public BlockSection getBlockSection() {
		return blockSection;
	}

	public void setBlockSection(BlockSection blockSection) {
		this.blockSection = blockSection;
	}

}
