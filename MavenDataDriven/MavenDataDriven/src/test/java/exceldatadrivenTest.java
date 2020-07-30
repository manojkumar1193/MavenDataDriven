import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldatadrivenTest {
	public static void main(String[] args) throws IOException {
		System.out.println("-------------------------------"+"Hellooooooooooooo" + "-----------------------------------------------");
		FileInputStream fis = new FileInputStream("H:\\Desktop\\SeleniumInput.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Dataexcel"))
			{
				
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> ce= firstrow.iterator();
				int column= 0;
				int k=0;
				while(ce.hasNext())
				{
					Cell value = ce.next();
					if(value.getStringCellValue().equals("Testcases"))
					{
						column = k;
					}
					k++;
				}
				System.out.println("-------------------------------"+column);
				
			}
		}

	}

}
