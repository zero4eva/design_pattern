package zero4eva;


import zero4eva.graphics.factory.BaseGraphicFactory;
import zero4eva.graphics.factory.ManualGraphicFactory;
import zero4eva.graphics.factory.RegularGraphicFactory;
import zero4eva.graphics.graphic.base.CircleGraphic;
import zero4eva.graphics.graphic.base.RectGraphic;

/**
 * @ClassName GraphicTest
 * @Description TODO
 * @Author Yang
 * @Date 2019-5-13-0013 21:40
 * @Version 1.0
 **/
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