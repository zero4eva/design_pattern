package zero4eva.graphics.factory;

import zero4eva.graphics.graphic.base.CircleGraphic;
import zero4eva.graphics.graphic.base.RectGraphic;
import zero4eva.graphics.graphic.base.TriangleGraphic;


public abstract class BaseGraphicFactory {
    public abstract CircleGraphic getCircle();
    public abstract RectGraphic getRect();
    public abstract TriangleGraphic getTriangle();
}
