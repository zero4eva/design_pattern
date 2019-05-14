package cn.zero4eva;

import cn.zero4eva.graphics.BaseGraphic;

/**
 * @ClassName GraphicTest
 * @Description TODO
 * @Author Yang
 * @Date 2019-5-13-0013 21:40
 * @Version 1.0
 **/
public class GraphicTest {
    public static void main(String[] args) {
        try {
            BaseGraphic graphic = GraphicFactory.getGraphic("triangle");
            graphic.draw();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
