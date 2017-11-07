public class Record {
    private Person caller;
    private Person callee;
    private int time;
    private int location_cell_id;
    private int location_sector_id;


    Record(Person _caller, Person _callee, int _time, int _location_cell_id, int _location_sector_id) {
        caller = _caller;
        callee = _callee;
        time = _time;
        location_cell_id = _location_cell_id;
        location_sector_id = _location_sector_id;
    }

    public Person getCaller() {
        return caller;
    }

    public void setCaller(Person caller) {
        this.caller = caller;
    }

    public Person getCallee() {
        return callee;
    }

    public void setCallee(Person callee) {
        this.callee = callee;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLocation_cell_id() {
        return location_cell_id;
    }

    public void setLocation_cell_id(int location_cell_id) {
        this.location_cell_id = location_cell_id;
    }

    public int getLocation_sector_id() {
        return location_sector_id;
    }

    public void setLocation_sector_id(int location_sector_id) {
        this.location_sector_id = location_sector_id;
    }
}
