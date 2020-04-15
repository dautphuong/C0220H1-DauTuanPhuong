package BaiTap;

class StopWatch {
    private double startTime, endTime;

    public StopWatch() {
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public StopWatch(double startTime, double endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public double start() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public double endTime() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public String getElapsedTime() {
        return (this.endTime - this.startTime) / 1000 + " Seconds";
    }
}

public class OOPStopWatch {
    public static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        int[] a = new int[100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int) (Math.random() * 1000);
        }
        double start = time.start();
        a = selectionSort(a);
        double end = time.endTime();
        System.out.println("Time: " + time.getElapsedTime());
        for (int x : a) {
            System.out.println(x);
        }
    }
}
