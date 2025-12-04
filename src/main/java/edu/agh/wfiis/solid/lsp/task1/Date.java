package edu.agh.wfiis.solid.lsp.task1;


public class Date implements Comparable<Date> {

    private transient long fastTime;

    public Date(long date) {
        fastTime = date;
    }

    public long getTime() {
        return fastTime;
    }

    public void setTime(long time) {
        fastTime = time;
    }

    public boolean equals(Object obj) {
        return obj instanceof Date && getTime() == ((Date) obj).getTime();
    }

    @Override
    public int compareTo(Date anotherDate) {
        return Long.compare(getMillisOf(this), getMillisOf(anotherDate));
    }

    public int hashCode() {
        long ht = this.getTime();
        return (int) ht ^ (int) (ht >> 32);
    }

    static long getMillisOf(Date date) {
        if (date.getClass() != Date.class) {
            return date.getTime();
        }
        return date.fastTime;
    }
}