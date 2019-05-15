package cn.zero4eva.graphics.factory;

import cn.zero4eva.graphics.graphic.BaseGraphic;
import cn.zero4eva.graphics.graphic.RectGraphic;
import cn.zero4eva.graphics.graphic.TriangleGraphic;


public class TriangleGraphicFactory extends BaseGraphicFactory{
    @Override
    public BaseGraphic getGraphic() {
        return new TriangleGraphic();
    }
}
