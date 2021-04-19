package Core;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;    


public class MakeOrder {
	
	public static void Excelfile(String text) throws Exception {

		File src = new File("D:\\eclipse-workspace\\ANDE.Res\\ANDE.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xfs = new XSSFWorkbook(fis);
		XSSFSheet sheet = xfs.getSheetAt(0);
		try {
			System.out.print("************Excel*****************");
			sheet.getRow(1).getCell(1).setCellValue(text);
		} catch (Exception e) {
			System.out.print("************ExcelFailed*****************");
		}
		FileOutputStream fos = new FileOutputStream(src);		
		xfs.write(fos);
		xfs.close(); }



	public static void main(String[] args) throws Exception{

		
		Excelfile("hadeer");		
		System.out.println("done");


	}}
