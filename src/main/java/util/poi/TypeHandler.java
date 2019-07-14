package util.poi;
import org.apache.poi.ss.usermodel.Cell;

import java.util.Date;


/**
 * excel表格类型处理接口
 */
public interface TypeHandler {

    /**
     * 处理byte类型的表数据
     * @param cell
     * @return
     */
    public Byte byteHandler(Cell cell);

    /**
     * 处理short类型的表数据
     * @param cell
     * @return
     */
    public Short shortHandler(Cell cell);
    /**
     * 处理 Integer类型的表数据
     * @param cell
     * @return
     */
    public Integer integerHandler(Cell cell);
    /**
     * 处理Double类型的表数据
     * @param cell
     * @return
     */
    public Double doubleHandler(Cell cell);

    /**
     * 处理String类型的表数据
     * @param cell
     * @return
     */
    public String stringHandler(Cell cell);


    /**
     * 处理Boolean类型的表数据
     * @param cell
     * @return
     */
    public Boolean booleanHandler(Cell cell);

    /**
     * 处理date类型的表数据
     * @param cell
     * @return
     */
    public Date dateHandler(Cell cell);
}
