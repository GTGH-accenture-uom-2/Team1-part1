public class Reservation {
    private Insured insured;
    private Timeslot timeslot;


    //Reservation Constructor
    public Reservation(Insured insured,Timeslot timeslot){
        this.insured = insured;
        this.timeslot = timeslot;
    }

    //Getters and Setters
    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }
}

