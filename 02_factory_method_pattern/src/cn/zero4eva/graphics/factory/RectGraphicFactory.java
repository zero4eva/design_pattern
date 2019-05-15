package cn.zero4eva.graphics.factory;

import cn.zero4eva.graphics.graphic.BaseGraphic;
import cn.zero4eva.graphics.graphic.CircleGraphic;
import cn.zero4eva.graphics.graphic.RectGraphic;


public class RectGraphicFactory extends BaseGraphicFactory{
    @Override
    public BaseGraphic getGraphic() {
        return new RectGraphic();
    }
}
