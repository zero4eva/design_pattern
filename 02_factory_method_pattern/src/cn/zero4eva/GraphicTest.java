package cn.zero4eva;

import cn.zero4eva.graphics.factory.BaseGraphicFactory;
import cn.zero4eva.graphics.graphic.BaseGraphic;
import cn.zero4eva.graphics.factory.CircleGraphicFactory;

/**
 * @ClassName GraphicTest
 * @Description TODO
 * @Author Yang
 * @Date 2019-5-13-0013 21:40
 * @Version 1.0
 **/
public class GraphicTest {
    public static void main(String[] args) {
        BaseGraphicFactory graphicFactory = new CircleGraphicFactory();
        BaseGraphic graphic = graphicFactory.getGraphic();
        graphic.draw();
    }
}
