package cn.zero4eva;


import cn.zero4eva.graphics.factory.BaseGraphicFactory;
import cn.zero4eva.graphics.factory.ManualGraphicFactory;
import cn.zero4eva.graphics.graphic.base.CircleGraphic;
import cn.zero4eva.graphics.graphic.base.RectGraphic;


public class GraphicTest {
    public static void main(String[] args) {
        // 想要生产其他工厂的系列产品，把工厂替换即可
        BaseGraphicFactory graphicFactory = new ManualGraphicFactory();

        CircleGraphic circle = graphicFactory.getCircle();
        circle.draw();

        RectGraphic rect = graphicFactory.getRect();
        rect.draw();
    }
}
