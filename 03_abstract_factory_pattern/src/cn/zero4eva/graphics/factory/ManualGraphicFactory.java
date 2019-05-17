package cn.zero4eva.graphics.factory;

import cn.zero4eva.graphics.graphic.base.CircleGraphic;
import cn.zero4eva.graphics.graphic.base.RectGraphic;
import cn.zero4eva.graphics.graphic.base.TriangleGraphic;
import cn.zero4eva.graphics.graphic.manual.ManualCircleGraphic;
import cn.zero4eva.graphics.graphic.manual.ManualRectGraphic;
import cn.zero4eva.graphics.graphic.manual.ManualTriangleGraphic;


public class ManualGraphicFactory extends BaseGraphicFactory{
    @Override
    public CircleGraphic getCircle() {
        return new ManualCircleGraphic();
    }

    @Override
    public RectGraphic getRect() {
        return new ManualRectGraphic();
    }

    @Override
    public TriangleGraphic getTriangle() {
        return new ManualTriangleGraphic();
    }
}
