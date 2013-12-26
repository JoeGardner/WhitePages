import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class ExcelManager 
{
	String file;
	ArrayList<Person> people;
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	java.util.Iterator<Row> rows = sheet.rowIterator ();


	public ExcelManager(String file) throws IOException
	{
		this.file = file;
	
		try
		{
			workbook = new HSSFWorkbook(new FileInputStream(file));
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("I'm sorry, that file could not be found or does not exist.");
		}
	
		sheet = workbook.getSheetAt(0);
	}

	
	/*
	 * Once we have our excel sheet found and instantiated, we then loop through every row and extract
	 * each person's information and store it to a variable.
	 */
	public ArrayList<Person> getPeople()
	{
		people = new ArrayList();
		
		while (rows.hasNext ())
		{
			Row row = rows.next();
			
		}
		
		return people;
	}
	
	/*
	 * Given a list of people, we need to make a new excel document and then save it.
	 */
	public void writeExcel(ArrayList<Person> p)
	{
		
	}

}


