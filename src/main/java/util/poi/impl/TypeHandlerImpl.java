package util.poi.impl;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import util.poi.TypeHandler;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TypeHandlerImpl implements TypeHandler {

    public Byte byteHandler(Cell cell) {

        int type = cell.getCellType();

        if(type == Cell.CELL_TYPE_NUMERIC) {
            return (byte)cell.getNumericCellValue();
        }
        else if(type == Cell.CELL_TYPE_STRING) {
            try {
                return Byte.valueOf(cell.getStringCellValue());
            }catch(NumberFormatException e) {
                return null;
            }
        }
        else {
            return null;
        }
    }

    public Integer integerHandler(Cell cell) {

        int type = cell.getCellType();

        if(type == Cell.CELL_TYPE_NUMERIC) {
            return (int)cell.getNumericCellValue();
        }
        else if(type == Cell.CELL_TYPE_STRING) {
            try {
                return Integer.valueOf(cell.getStringCellValue());
            }catch(NumberFormatException e) {
                return null;
            }
        }
        else {
            return null;
        }

    }

    public Short shortHandler(Cell cell) {

        int type = cell.getCellType();

        if(type == Cell.CELL_TYPE_NUMERIC) {
            return (short)cell.getNumericCellValue();
        }
        else if(type == Cell.CELL_TYPE_STRING) {
            try {
                return Short.valueOf(cell.getStringCellValue());
            }catch(NumberFormatException e) {
                return null;
            }
        }
        else {
            return null;
        }
    }

    public Double doubleHandler(Cell cell) {
        int type = cell.getCellType();
        if(type == Cell.CELL_TYPE_NUMERIC) {
            return (Double)cell.getNumericCellValue();
        }
        else if(type == Cell.CELL_TYPE_STRING) {
            try {
                return Double.valueOf(cell.getStringCellValue());
            }catch(NumberFormatException e) {
                return null;
            }
        }
        else {
            return null;
        }
    }

    public String stringHandler(Cell cell) {
        int type = cell.getCellType();
        if(type == Cell.CELL_TYPE_NUMERIC) {
            return cell.getNumericCellValue()+"";
        }
        if(type == Cell.CELL_TYPE_BOOLEAN) {
            return cell.getBooleanCellValue()+"";
        }
        if(type == Cell.CELL_TYPE_FORMULA) {
            return cell.getCellFormula()+"";
        }

        if(type == Cell.CELL_TYPE_STRING) {
            return cell.getStringCellValue();
        }
        else {
            return Cell.CELL_TYPE_ERROR+"错误格式";
        }
    }

    public Boolean booleanHandler(Cell cell) {
        int type = cell.getCellType();

        if(type == Cell.CELL_TYPE_BOOLEAN) {
            return cell.getBooleanCellValue();
        }
        else if(type == Cell.CELL_TYPE_STRING) {

            return Boolean.valueOf(cell.getStringCellValue());
        }else {
            return null;
        }
    }


    public Date dateHandler(Cell cell) {
        int type = cell.getCellType();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        if(type == Cell.CELL_TYPE_NUMERIC) {
            return HSSFDateUtil.getJavaDate(cell.getNumericCellValue());
        }
        if (HSSFDateUtil.isCellDateFormatted(cell)){
            return cell.getDateCellValue();
        }else if(type == Cell.CELL_TYPE_STRING) {
            return new Date(cell.getStringCellValue());

        }else {
            return null;
        }

    }

}
