package com.zx.principle.ocp.improve;

/**
 * @author ZhangXiong
 * @version v12.0.1
 * @date 2020-03-05
 * 设计模式
 * 开闭原则 Open Close Principle
 * 1.一个软件实体如类，模块和函数应该对扩展开放(对提供方)，对修改关闭(对使用方)。用抽象构建框架，用实
 * 现扩展细节。
 * 2.当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
 * 3.编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则。
 */
public class OCP {
    public static void main(String[] args) {
        //使用看看存在的问题,这里是利用多态，或者就是依赖倒转实现
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

//这是一个用于绘图的类 [使用方]
//增加了一个图形绘制，但并没有增加使用方的内容，使用方不用修改
class GraphicEditor {
    //接收 Shape 对象，调用 draw 方法
    public void drawShape(Shape s) {
        s.draw();
    }
}

//Shape 类，基类
abstract class Shape {
    int m_type;

    public abstract void draw();//抽象方法
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
// TODO Auto-generated method stub
        System.out.println(" 绘制矩形 ");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
// TODO Auto-generated method stub
        System.out.println(" 绘制圆形 ");
    }
}

//新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
// TODO Auto-generated method stub
        System.out.println(" 绘制三角形 ");
    }
}

//新增一个图形
class OtherGraphic extends Shape {
    OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
// TODO Auto-generated method stub
        System.out.println(" 绘制其它图形 ");
    }
}