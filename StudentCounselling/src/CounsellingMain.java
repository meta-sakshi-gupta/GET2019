import java.io.File;
import java.util.Map;
import java.util.Map.Entry;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


public class CounsellingMain 
{
	public static void main(String args[]) throws Throwable
	{
		StudentCounselling counselling = new StudentCounselling();

		Map<String,String> actual = counselling.counselingProcess("C:\\Users\\admin\\workspace\\excel\\Councel.xls");

		try
		{
			String fileName = "CouncelResult.xls";	
			WritableWorkbook workbook = Workbook.createWorkbook(new File(fileName));
			WritableSheet sheet1 = workbook.createSheet("Sheet1", 0);

			Label label1 = new Label(0,0,"Student Name");
			sheet1.addCell(label1);

			Label label2 = new Label(1,0,"Program allotted");
			sheet1.addCell(label2);

			int index=0, index_1=0;
			for(Entry<String, String> entry : actual.entrySet())
			{
				Label label11 = new Label(0,++index,entry.getKey());
				sheet1.addCell(label11);

				Label label12 = new Label(1,++index_1,entry.getValue());
				sheet1.addCell(label12);
			}

		}
		catch(WriteException e)
		{

		}
	}

}