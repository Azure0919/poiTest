package util.poi;
import com.sun.media.sound.InvalidFormatException;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import util.poi.impl.TypeHandlerImpl;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class POIIntoUtil {
    /*
     数据封装对象
      */
    private Object object;


    /**
     * 导入excel并封装成pojo对象
     * @param excelFile
     * @param type
     * @param <T>
     * @return
     * @throws InvalidFormatException
     * @throws IOException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws org.apache.poi.openxml4j.exceptions.InvalidFormatException
     */
    public static <T> List<T> importExcel(File excelFile, Class<T> type) throws InvalidFormatException, IOException, InstantiationException, IllegalAccessException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
        //结果接收对象
        List<T> result = new ArrayList<T>();
        //将传入的表格封装成Workbook对象
        Workbook workbook = WorkbookFactory.create(excelFile);
        //示意访问sheet
        Sheet sheet = workbook.getSheetAt(0);
        //遍历表格
        for(int ri = sheet.getFirstRowNum() + 1 ; ri <= sheet.getLastRowNum(); ri++) {
            Row row = sheet.getRow(ri);
            //通过反射生成封装类对象
            T object = type.newInstance();
            //获取对象的所有属性的集合
            Field[] fields = object.getClass().getDeclaredFields();
            //设置对象属性的访问权限
            Field.setAccessible(fields, true);
            //遍历每行的列
            for(int ci = row.getFirstCellNum(); ci < row.getLastCellNum(); ci++) {
                //获取每列
                Cell cell = row.getCell(ci);
                //通过列数据类型获取值
                Object value = getCellValueByType(cell,fields[ci]);
                //将属性集合中的元素赋值
                fields[ci].set(object, value);
            }
            //将赋值后的对象添加到结果当中
            result.add(object);
            //将封装类对象的属性访问权限关闭
            Field.setAccessible(fields, false);
        }
        return result;
    }

    /**
     * 导出excel文件
     */
    public static void createExcel() throws IOException{
        // 获取桌面路径
        FileSystemView fsv = FileSystemView.getFileSystemView();
        String desktop = fsv.getHomeDirectory().getPath();
        String filePath = desktop + "/模板.xls";

        File file = new File(filePath);
        OutputStream outputStream = new FileOutputStream(file);
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Sheet1");
        HSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("省");
        row.createCell(1).setCellValue("市");
        row.createCell(2).setCellValue("县");
        row.createCell(3).setCellValue("邮编");

        row.setHeightInPoints(30); // 设置行的高度

        HSSFRow row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("湖南省");
        row1.createCell(1).setCellValue("长沙市");
        row1.createCell(2).setCellValue("雨花区");
        row1.createCell(3).setCellValue("422200");

        workbook.setActiveSheet(0);
        workbook.write(outputStream);
        outputStream.close();
    }




    /**
     * 读取excl对象数据
     * @param cell
     * @return
     */
    public static Object getCellValueByType(Cell cell, Field file) {
        //获取数据类型

        int type = cell.getCellType();
        String typenName = file.getType().getName();
        System.out.println(typenName);
        //获取数据类型处理器
        TypeHandler typeHandler = (TypeHandler) new TypeHandlerImpl();
        //做数据类型判断以后调用相对应的处理器
        //Byte
        if (typenName.contains("Byte")) {
            return typeHandler.byteHandler(cell);
        }else if(typenName.contains("byte")){
            return (byte)typeHandler.byteHandler(cell);
        }
        //Short
        if (typenName.contains("Short")) {
            return typeHandler.shortHandler(cell);
        }

        //Integer
        if (typenName.contains("Integer")){
            return typeHandler.integerHandler(cell);
        }else if(typenName.contains("int")){
            return (int)typeHandler.integerHandler(cell);
        }
        //Double
        if (typenName.contains("Double")) {
            return typeHandler.doubleHandler(cell);
        }
        //String
        if (typenName.contains("String")) {
            return typeHandler.stringHandler(cell);
        }
        //Boolean
        if (typenName.contains("Boolean")) {
            return typeHandler.booleanHandler(cell);
        }
        //Date
        if (typenName.contains("Date")) {
            return typeHandler.dateHandler(cell);
        }

        return "没有此数据类型";
    }

}
