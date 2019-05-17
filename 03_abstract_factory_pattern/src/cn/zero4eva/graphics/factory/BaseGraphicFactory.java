package cn.zero4eva.graphics.factory;

import cn.zero4eva.graphics.graphic.base.CircleGraphic;
import cn.zero4eva.graphics.graphic.base.RectGraphic;
import cn.zero4eva.graphics.graphic.base.TriangleGraphic;


public abstract class BaseGraphicFactory {
    public abstract CircleGraphic getCircle();
    public abstract RectGraphic getRect();
    public abstract TriangleGraphic getTriangle();
}
