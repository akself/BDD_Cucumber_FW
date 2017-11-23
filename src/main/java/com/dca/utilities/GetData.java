package com.dca.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * Created by Akbar.AyubKhan on 10/14/2016.
 */

public class GetData {

    public static String fromExcel(String filepath, String sheetName, int rowIndex, int cellIndex) {
        String data = null;
        try {
            File f = new File(filepath);
            FileInputStream fis = new FileInputStream(f);
            Workbook wb = WorkbookFactory.create(fis);
            Sheet st = wb.getSheet(sheetName);
            Row r = st.getRow(rowIndex);
            Cell c = r.getCell(cellIndex);
            data = c.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    public static String fromProperties(String filepath, String key) {
        String data = null;

        try {
            File f = new File(filepath);
            FileInputStream fis = new FileInputStream(f);
            Properties prop = new Properties();
            prop.load(fis);
            data = prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
