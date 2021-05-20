package data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datafile {
	public static String[][] data() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook(".//data/data.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowcount = ws.getLastRowNum();
		System.out.println(rowcount);
		int cellcount = ws.getRow(0).getLastCellNum();
		System.out.println(cellcount);
		String[][] data = new String[rowcount][cellcount];
		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				String getvalue = ws.getRow(i).getCell(j).getStringCellValue();
//				System.out.print(getvalue+" ");
				data[i-1][j]=getvalue;
//				System.out.println(getvalue);
			}
		}
		wb.close();
		return data;
		}
	}
