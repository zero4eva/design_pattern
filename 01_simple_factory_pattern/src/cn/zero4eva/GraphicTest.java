package cn.zero4eva;

import cn.zero4eva.graphics.BaseGraphic;


public class GraphicTest {
    public static void main(String[] args) {
        try {
            BaseGraphic graphic = GraphicFactory.getGraphic("triangle");
            graphic.draw();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
