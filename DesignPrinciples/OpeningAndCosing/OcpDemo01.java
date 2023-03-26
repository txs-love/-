package example.DesignPrinciples.OpeningAndCosing;

/**
 * @author 汤修帅 on 11:44.
 */
public class OcpDemo01 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Shape());


        abstract class Shape {  //Shape类  基类
            int m_type;
            public abstract void draw();  //抽象方法

        }

 class GraphicEditor {
            //接收Shape对象，然后根据type，来绘制不同的图形
            public void drawShape(Shape s) {
                s.draw();
            }
        }
            class Rectangle extends Shape {
                Rectangle(){
                    m_type=1;
                }
                @Override
                public void draw() {
                    System.out.println("绘制矩形");
                }
            }

            class Circle extends Shape {
                Circle(){
                    m_type=2;
                }
                @Override
                public void draw() {
                    System.out.println("绘制圆形");
                }
            }

            class Triangle extends Shape {
                Triangle(){
                    m_type=3;
                }
                @Override
                public void draw() {
                    System.out.println("绘制三角形");
                }
            }

            class Txs extends Shape{
                Txs(){
                    m_type=4;
                }
                @Override
                public void draw() {
                    System.out.println("绘制其他图形");
                }
            }
        }
    }



