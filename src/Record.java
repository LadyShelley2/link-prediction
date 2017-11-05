public class Record {
    private int caller;
    private int callee;
    private int time;
    private int location;

    Record(int _caller, int _callee, int _time, int _location){
        caller = _caller;
        callee = _callee;
        time = _time;
        location = _location;
    }

    public int getCaller() {
        return caller;
    }

    public void setCaller(int caller) {
        this.caller = caller;
    }

    public int getCallee() {
        return callee;
    }

    public void setCallee(int callee) {
        this.callee = callee;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
