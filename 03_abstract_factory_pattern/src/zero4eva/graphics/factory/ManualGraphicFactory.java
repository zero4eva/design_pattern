package zero4eva.graphics.factory;

import zero4eva.graphics.graphic.base.CircleGraphic;
import zero4eva.graphics.graphic.base.RectGraphic;
import zero4eva.graphics.graphic.base.TriangleGraphic;
import zero4eva.graphics.graphic.manual.ManualCircleGraphic;
import zero4eva.graphics.graphic.manual.ManualRectGraphic;
import zero4eva.graphics.graphic.manual.ManualTriangleGraphic;


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
