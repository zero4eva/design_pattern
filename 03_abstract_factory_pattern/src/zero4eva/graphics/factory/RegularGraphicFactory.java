package zero4eva.graphics.factory;

import zero4eva.graphics.graphic.base.CircleGraphic;
import zero4eva.graphics.graphic.base.RectGraphic;
import zero4eva.graphics.graphic.base.TriangleGraphic;
import zero4eva.graphics.graphic.regular.RegularCircleGraphic;
import zero4eva.graphics.graphic.regular.RegularRectGraphic;
import zero4eva.graphics.graphic.regular.RegularTriangleGraphic;

/**
 * @ClassName RegularGraphicFactory
 * @Description TODO
 * @Author Yang
 * @Date 2019-5-15-0015 22:22
 * @Version 1.0
 **/
public class RegularGraphicFactory extends BaseGraphicFactory{
    @Override
    public CircleGraphic getCircle() {
        return new RegularCircleGraphic();
    }

    @Override
    public RectGraphic getRect() {
        return new RegularRectGraphic();
    }

    @Override
    public TriangleGraphic getTriangle() {
        return new RegularTriangleGraphic();
    }
}
