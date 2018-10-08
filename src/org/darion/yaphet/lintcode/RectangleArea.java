package org.darion.yaphet.lintcode;

public class RectangleArea {

    private int width;
    private int height;

    public RectangleArea(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return height * width;
    }
}
