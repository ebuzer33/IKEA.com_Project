package utils;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtility {

    public static List<String> getListData(String path, String sheetName, int columnCount) {

        List<String> returnList = new ArrayList<>();
        Workbook workbook = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Sheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();

        for (int i = 1; i < rowCount; i++) {

            Row row = sheet.getRow(i);
            for (int j = 0; j < columnCount; j++) {
                returnList.add(row.getCell(j).toString());
                row.getCell(j);
            }
        }
        return returnList;
    }
}
