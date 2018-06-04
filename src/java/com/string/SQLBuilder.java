package com.string;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

import java.awt.print.Book;
import java.io.*;
import java.util.ArrayList;

/**
 * @Program: Algorithm
 * @Description: BUILDING SQL FORM EXCEL
 * @Author: Aislingo
 * @CreateDate: 2018-05-25 15:52
 **/
public class SQLBuilder {

    public void GetExcel(){
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\TGTtest\\first.xls");
            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
            HSSFSheet sheet = workbook.getSheet("page1");
            for (int i = 0 ; i < 1000 ; i++){
                HSSFRow row = sheet.getRow(i);
                HSSFCell cell0 = row.getCell(0);
                HSSFCell cell1 = row.getCell(1);
                String cellzero =  cell0.getStringCellValue();
                String cellone = cell1.getStringCellValue();
                String SQL = "insert into phone_book (userid,folderid,dispname,gender,organization,title,version,privateid) VALUES (0,108298,'" + cellone + "',0,'"+ cellzero +"','normal',0,0)";
                HSSFCell celltwo = row.createCell(2);
                celltwo.setCellValue(SQL);
            }
//            HSSFRow row = sheet.getRow(0);
//            HSSFCell cell = row.getCell(0);
//            String cellC = cell.getStringCellValue();
//            HSSFCell cell2 = row.createCell(3);
//            cell2.setCellValue(cellC);
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\TGTtest\\first1.xls");
            workbook.write(fileOutputStream);
            fileOutputStream.flush();
            fileInputStream.close();
//            String s = cell.getStringCellValue();
//            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public void ExportExcel(){
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("FIRST TIME");
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("FIRST CELL!");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\TGTtest\\first.xls");
            workbook.write(fileOutputStream);
            fileOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SQLBuilder sqlBuilder = new SQLBuilder();
//        sqlBuilder.ExportExcel();
        System.out.println("GET EXCEL COMPLETE!");
        sqlBuilder.GetExcel();
        System.out.println("output success");
    }

}
