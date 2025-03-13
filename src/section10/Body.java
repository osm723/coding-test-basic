package section10;

public class Body implements Comparable<Body> {

    int h;
    int w;

    public Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public int getW() {
        return w;
    }

    @Override
    public int compareTo(Body o) {
        if (this.h == o.getH()) {
            return this.w - o.getW();
        } else {
            return this.h - o.getH();
        }
    }
}
