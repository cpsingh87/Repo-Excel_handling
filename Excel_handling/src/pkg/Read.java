package pkg;

import java.io.File;
import java.io.IOException;
import java.io.WriteAbortedException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;

public class Read {
	public static void main(String[] args) throws BiffException, IOException 
	{
		File f=new File("C:\\Users\\echtsih\\Desktop\\KS\\Automation\\Deepak C\\Session 11 - 13th April,2019\\read.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows(); // get number of rows in worksheet
		int c=ws.getColumns(); //get number of columns in worksheet
		
		
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
		}
	}

}
