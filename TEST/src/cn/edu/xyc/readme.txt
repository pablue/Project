1.导出工作表的步骤
2.导入jxl.jar包
3.Workbook.createWorkbook(file); 返回一个 WritableWorkbook
		//创建一个xls 表
  	>>  WritableWorkbood wwb = Workbook.createWorkbood(File file);
  		//创建工作簿
 	>> WritableSheet sheet = wwwb.createSheet(sheetname,int 第几个sheet);
 	
 	>>	Label label = null;
 	>>	label = new Label(c, r, cont);   //第几列，第几行的数据放入到Label 中，
	>>	sheet.addcell(label);			//将label插入到sheet中去
	
	最后，
	wb.write();  写入到表中去
	wb.close();	   关闭表