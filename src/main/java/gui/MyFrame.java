package main.java.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 71903 on 2017/5/9.
 */
public class MyFrame extends JFrame {
    private int height;
    private int width;
    private int X_axis;
    private int Y_axis;
    private Dimension dimension;
    private  Point point;

    public MyFrame(int height, int width, int x_axis, int y_axis) {
        this.height = height;
        this.width = width;
        this.X_axis = x_axis;
        this.Y_axis = y_axis;
        this.dimension=new Dimension();
        this.dimension.setSize(this.height,this.width);
        this.point=new Point(this.X_axis,this.Y_axis);
        this.setSize(dimension);
        this.setLocation(point);
    }

    public void showFrame(){
        this.setVisible(true);
    }

    public void closeFrame(){
        System.exit(JFrame.EXIT_ON_CLOSE);
    }

    public void setFrameTitle(String name){
        this.setTitle(name);
    }
}
