package example2;

import java.util.List;

abstract class Geometric {
    abstract double getArea();
}

class Circle extends Geometric {
    double radius;

    @Override
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}

class Rectangle extends Geometric {
    double width;
    double height;

    @Override
    double getArea() {
        return this.width * this.height;
    }
}

class Triangle extends Geometric {
    double firstSide;
    double secondSide;
    double thirdSide;

    @Override
    double getArea() {
        double halfOfPerimeter = this.firstSide + this.secondSide + this.thirdSide;
        return Math.sqrt(
                halfOfPerimeter
                        * (halfOfPerimeter - this.firstSide)
                        * (halfOfPerimeter - this.secondSide)
                        * (halfOfPerimeter - this.thirdSide)
        );
    }
}

class GeometricNew extends Geometric {

    @Override
    double getArea() {
        return 0;
    }
}

public class AreaGeometricDisplay {
    // geomrtric[0] = new Circle(3);
    // geomrtric[1] = new Triangle(3, 8, 9);
    public void showArea(List<Geometric> geometricList) {

        // for (int i = 0; i < geometricList.size(); i++) {
        for (Geometric geometric : geometricList) {
            System.out.println(geometric.getArea());
        }
    }


}
