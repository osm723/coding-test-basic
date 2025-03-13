package section10;

public class Time implements Comparable<Time> {
    int start;
    int end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }


    @Override
    public int compareTo(Time o) {
        if (this.end == o.getEnd()) {
            return this.start-o.getStart();
        } else {
            return this.end - o.getEnd();
        }
    }
}
