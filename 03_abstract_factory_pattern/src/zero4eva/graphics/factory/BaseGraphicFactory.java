package zero4eva.graphics.factory;

import zero4eva.graphics.graphic.base.CircleGraphic;
import zero4eva.graphics.graphic.base.RectGraphic;
import zero4eva.graphics.graphic.base.TriangleGraphic;

/**
 * @ClassName BaseGraphicFactory
 * @Description TODO
 * @Author Yang
 * @Date 2019-5-14-0014 21:09
 * @Version 1.0
 **/
public abstract class BaseGraphicFactory {
    public abstract CircleGraphic getCircle();
    public abstract RectGraphic getRect();
    public abstract TriangleGraphic getTriangle();
}
