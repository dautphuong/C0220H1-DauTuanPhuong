package example;

import java.util.List;

class Geometric {
}

class Circle extends Geometric {
    double radius;
}

class Rectangle extends Geometric {
    double width;
    double height;
}

class Triangle extends Geometric {
    double firstSide;
    double secondSide;
    double thirdSide;
}

public class AreaGeometricDisplay {
    public void showArea(List<Geometric> geometricList) {

        for (Geometric geometric : geometricList) {
            if (geometric instanceof Circle) {
                Circle circle = (Circle) geometric;
                double area = Math.PI * circle.radius * circle.radius;
                System.out.println(area);
            }

            if (geometric instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) geometric;
                double area = rectangle.width * rectangle.height;
                System.out.println(area);
            }

            if (geometric instanceof Triangle) {
                Triangle triangle = (Triangle) geometric;
                double halfOfPerimeter = triangle.firstSide + triangle.secondSide + triangle.thirdSide;
                double area = Math.sqrt(
                        halfOfPerimeter
                        * (halfOfPerimeter - triangle.firstSide)
                        * (halfOfPerimeter - triangle.secondSide)
                        * (halfOfPerimeter - triangle.thirdSide)
                );
                System.out.println(area);
            }

            // Nếu yêu cầu bao gồm thêm việc tính diện tích cho một geometric mới thì ta phải sửa lại method này
        }
    }
}
