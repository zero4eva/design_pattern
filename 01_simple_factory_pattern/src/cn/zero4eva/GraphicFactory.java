package cn.zero4eva;

import cn.zero4eva.graphics.CircleGraphic;
import cn.zero4eva.graphics.TriangleGraphic;
import cn.zero4eva.graphics.BaseGraphic;
import cn.zero4eva.graphics.RectGraphic;

/**
 * @ClassName GraphicFactory
 * @Description TODO
 * @Author Yang
 * @Date 2019-5-13-0013 21:16
 * @Version 1.0
 **/
public class GraphicFactory {
    public static BaseGraphic getGraphic(String graphicName) throws Exception {
        switch (graphicName) {
            case "rect":
                return new RectGraphic();
            case "circle":
                return new CircleGraphic();
            case "triangle":
                return new TriangleGraphic();
            default:
                throw new Exception("请输入已存在图形！");
        }
    }
}
