package learn.dsa.Excel;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;

public class ReadFromExcel {
    private static final String filePath = "";

    public void readData() throws Exception {
        Map<String, Double> a1 = new HashedMap<>();
        Map<String, Double> a2 = new HashedMap<>();
        FileInputStream file = new FileInputStream(new File(filePath));
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheet("Sheet2");
        Iterator<Row> row = sheet.iterator();
//        while (row.hasNext()){
//            Row currentRow = row.next();
//            Iterator<Cell> cells = currentRow.iterator();
//            while(cells.hasNext()){
//                Cell currentCell = cells.next();
//                System.out.print(currentCell +" ");
//            }
        int i = 0;
        while (sheet.getRow(i) != null) {
            if (sheet.getRow(i).getCell(2) != null) {
                sheet.getRow(i).getCell(2).setCellType(CellType.STRING);
                a1.put(sheet.getRow(i).getCell(2).getStringCellValue(),
                        sheet.getRow(i).getCell(3).getNumericCellValue());
            }
            if (sheet.getRow(i).getCell(4) != null) {
                sheet.getRow(i).getCell(4).setCellType(CellType.STRING);
                a2.put(sheet.getRow(i).getCell(4).getStringCellValue(),
                        sheet.getRow(i).getCell(5).getNumericCellValue());
            }
            i++;
//            System.out.println(sheet.getRow(i).getCell(2).getCellType());
//            System.out.println(sheet.getRow(i).getCell(3).getCellType());
//            System.out.println(sheet.getRow(i).getCell(4).getCellType());
//            System.out.println(sheet.getRow(i).getCell(5).getCellType());
//            break;

        }

//        System.out.println("------------------a1------------------");
//        for (var entry : a1.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//        System.out.println("------------------a2------------------");
//        for (var entry : a2.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
//        System.out.println(a2.size());
//        System.out.println(a1.size());
        for (var entry : a1.entrySet()) {
            var a2Amount = a2.get(entry.getKey());
            if (a2.containsKey(entry.getKey())) {
                Double a1Amount = entry.getValue();
                if (!a2Amount.equals(a1Amount)) {
                    System.out.println(entry.getKey() + " is not equal with amount in a2");
                }
            } else {
                System.out.println(entry.getKey() + " is not present in a2");
            }
        }
    }
}
