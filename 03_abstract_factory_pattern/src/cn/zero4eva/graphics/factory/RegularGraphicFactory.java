package cn.zero4eva.graphics.factory;

import cn.zero4eva.graphics.graphic.base.CircleGraphic;
import cn.zero4eva.graphics.graphic.base.RectGraphic;
import cn.zero4eva.graphics.graphic.base.TriangleGraphic;
import cn.zero4eva.graphics.graphic.regular.RegularCircleGraphic;
import cn.zero4eva.graphics.graphic.regular.RegularRectGraphic;
import cn.zero4eva.graphics.graphic.regular.RegularTriangleGraphic;


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
