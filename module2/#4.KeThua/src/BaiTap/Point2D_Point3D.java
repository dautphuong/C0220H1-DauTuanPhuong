package BaiTap;

public class Point2D_Point3D {
    static class Point2D {
        private float x;
        private float y;

        Point2D() {
        }

        Point2D(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float[] getXY(float[] arr) {
            return arr;
        }

        public void setXY(float[] arr) {
            setX(arr[0]);
            setY(arr[1]);
        }

        @Override
        public String toString() {
            return "Point x :" + getX() + " ,y :" + getY();
        }
    }

    static class Point3D extends Point2D {
        private float z;

        Point3D() {
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        Point3D(float x, float y, float z) {
            super(x, y);
            this.z = z;
        }

        public float[] getXYZ(float[] arr) {
            return arr;
        }

        public void setXYZ(float[] arr) {
            setX(arr[0]);
            setY(arr[1]);
            setZ(arr[2]);
        }

        @Override
        public String toString() {
            return super.toString() + ", z :" + getZ();
        }
    }

    public static void main(String[] args) {
        float[] arr = {3, 5, 4};

        Point2D point2d = new Point2D(3, 2);
        System.out.println(point2d);

        point2d.setXY(arr);
        System.out.println(point2d);

        Point3D point3d = new Point3D(4, 6, 5);
        System.out.println(point3d);

        point3d.setXYZ(arr);
        System.out.println(point3d);
    }
}
