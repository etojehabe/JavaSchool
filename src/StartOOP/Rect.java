package StartOOP;

public class Rect {
    int x1, y1;
    int x2, y2;
    double height, width;

    public Rect() {

    }

    public Rect(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Rect(int x1, int y1, double height, double width) {
        this.x1 = x1;
        this.y1 = y1;
        this.height = height;
        this.width = width;

    }

    int square() {
        return Math.abs(x1 - x2) * Math.abs(y1 - y2);
    }
    void setLeftTop(int x, int y){
        this.x1 = x;
        this.y1 = y;
    }


}
