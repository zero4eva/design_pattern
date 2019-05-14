package cn.zero4eva.graphics.factory;

import cn.zero4eva.graphics.graphic.BaseGraphic;
import cn.zero4eva.graphics.graphic.CircleGraphic;
import cn.zero4eva.graphics.graphic.RectGraphic;
import cn.zero4eva.graphics.graphic.TriangleGraphic;

/**
 * @ClassName CircleGraphicFactory
 * @Description TODO
 * @Author Yang
 * @Date 2019-5-13-0013 21:16
 * @Version 1.0
 **/

public class CircleGraphicFactory extends BaseGraphicFactory{
    @Override
    public BaseGraphic getGraphic() {
        return new CircleGraphic();
    }
}
