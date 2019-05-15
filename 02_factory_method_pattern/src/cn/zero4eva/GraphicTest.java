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
        // 画不同的图形，只需要将创建的工厂替换掉即可
        BaseGraphicFactory graphicFactory = new CircleGraphicFactory();
        BaseGraphic graphic = graphicFactory.getGraphic();
        graphic.draw();
    }
}
