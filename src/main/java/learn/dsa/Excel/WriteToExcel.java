package learn.dsa.Excel;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class WriteToExcel {
    public static void main(String[] args) {
        writeToExcel();
    }



     static void writeToExcel() {

        File f = new File("C:\\Users\\dnagasre\\OneDrive - Capgemini\\Desktop" +
                "\\Learn.xlsx");
        try(FileInputStream fis = new FileInputStream(f); Workbook workbook =
                WorkbookFactory.create(fis);
         ) {
            f.setWritable(true);
            Sheet sheet = workbook.createSheet("learn6");
            Row row = sheet.createRow(6);
            Cell cell = row.createCell(6);
            cell.setCellValue("Sree");
            FileOutputStream fos = new FileOutputStream(f);
            workbook.write(fos);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
