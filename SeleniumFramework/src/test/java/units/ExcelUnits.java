package units;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUnits
{
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args)
	{
		//getRowCount();
		getCellData();
		//getCellDataNumber();
	}
public static void getRowCount()
{
	try
	{
		projectPath=System.getProperty("user.dir");
		workbook= new XSSFWorkbook(projectPath+"\\excel\\data.xlsx.xlsx");
		sheet=workbook.getSheet("Sheet1");
		
	int rowCount=sheet.getPhysicalNumberOfRows();
	System.out.println("No of rows :"+rowCount);

}
	catch(Exception exp)
	{
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}
}
	public static void getCellData()
	{
		try
		{
		projectPath=System.getProperty("user.dir");
		workbook= new XSSFWorkbook(projectPath+"\\excel\\data.xlsx.xlsx");
		sheet=workbook.getSheet("Sheet1");
		String cellData=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellData);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	public static void getCellDataNumber(int rownum,int colnum)
	{
		try
		{
		projectPath=System.getProperty("user.dir");
		workbook= new XSSFWorkbook(projectPath+"\\excel\\data.xlsx.xlsx");
		sheet=workbook.getSheet("Sheet1");
		double cellData=sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
		System.out.println(cellData);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
}