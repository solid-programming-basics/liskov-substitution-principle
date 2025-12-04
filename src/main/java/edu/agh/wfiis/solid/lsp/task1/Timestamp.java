package edu.agh.wfiis.solid.lsp.task1;

public class Timestamp extends Date {

    private int nanos;

    public Timestamp(long time) {
        super((time / 1000) * 1000);
        nanos = (int) ((time % 1000) * 1000000);
        if (nanos < 0) {
            nanos = 1000000000 + nanos;
            super.setTime(((time / 1000) - 1) * 1000);
        }
    }

    public void setTime(long time) {
        super.setTime((time / 1000) * 1000);
        nanos = (int) ((time % 1000) * 1000000);
        if (nanos < 0) {
            nanos = 1000000000 + nanos;
            super.setTime(((time / 1000) - 1) * 1000);
        }
    }

    public long getTime() {
        long time = super.getTime();
        return (time + (nanos / 1000000));
    }

    public int getNanos() {
        return nanos;
    }

    public void setNanos(int n) {
        if (n > 999999999 || n < 0) {
            throw new IllegalArgumentException("nanos > 999999999 or < 0");
        }
        nanos = n;
    }

    public boolean equals(Timestamp ts) {
        if (super.equals(ts)) {
            if (nanos == ts.nanos) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean equals(java.lang.Object ts) {
        if (ts instanceof Timestamp) {
            return this.equals((Timestamp) ts);
        } else {
            return false;
        }
    }

    public int compareTo(Timestamp ts) {
        long thisTime = this.getTime();
        long anotherTime = ts.getTime();
        int i = (thisTime < anotherTime ? -1 : (thisTime == anotherTime ? 0 : 1));
        if (i == 0) {
            if (nanos > ts.nanos) {
                return 1;
            } else if (nanos < ts.nanos) {
                return -1;
            }
        }
        return i;
    }

    public int compareTo(Date o) {
        if (o instanceof Timestamp) {
            return compareTo((Timestamp) o);
        } else {
            Timestamp ts = new Timestamp(o.getTime());
            return this.compareTo(ts);
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}