package cn.edu.xyc;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * 导入excel到数据库
 * 
 * @author Pablue
 * 
 */

public class ImportExcel {

	public static void main(String[] args) throws BiffException, IOException {

		String path = "";
		File file = new File(path);
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet[] sheet = workbook.getSheets();

		// 这里就到了最后了,这里的最后就是对于工作表格的最后,既然是用数组来得到的,当然会对每一个工作表格进行读取操作,
		// 这里的读取就是读取每一个工作表格的每一行数据.
		int sheet_i_num = 0;// 获取工作表格的行数
		String id = "";
		String name = "";// 用来得到每一个单元格的内容,下面用到.
		if (sheet != null && sheet.length > 0) {// 判断一下
			for (int sheetNum = 0; sheetNum < sheet.length; sheetNum++) {// 获得有多少个工作表格,对每一个操作.
				// (3.1这里首先要得到要读取的工作表格有多少行.)
				sheet_i_num = sheet[sheetNum].getRows();
				// 接下来就是对每一行进行的去数据了,此处从rowNum = 1开始,第一行一般是标题
				for (int rowNum = 1; rowNum < sheet_i_num; rowNum++) {
					// 这里就开始对每一个单元格进行操作了.
					// 显然,sheet[]第一个参数就是哪一个工作表格,然后getRow的就是哪一行.然后就赋值给Cell进行操作.
					Cell[] cells = sheet[sheetNum].getRow(rowNum);
					// 这里就开始读出每一行的数据了,这里不做其他的判断,比如,数据是整数否,是否超出字符串长度,是否为空等等,
					id = cells[0].getContents();
					name = cells[1].getContents();// 这里就是对每一个列来获取,cells就是把这一行的某一列赋值给你所要操作的值.

				}

			}
		}
	}
}
