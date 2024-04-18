/* Class: Doctor */
/* as Sub-class of Superclass: 'Insured' */

import java.time.LocalDate;
import java.util.ArrayList;

public class Doctor extends Insured{
    /* we declare ONLY fields that we do not inherit */
    private ArrayList<Timeslot> timeslots;

    public Doctor(String afm, String amka, String name, String surname, LocalDate birthday, String email
            , ArrayList<Timeslot> timeslots) {
        //we have to call first the constructor of the Superclass:
        super(afm, amka, name, surname, birthday, email);
        this.timeslots = timeslots;
    }
    //Method to add/assign new timeslots to a doctor
    public void addTimeslot(Timeslot timeslot){
        timeslots.add(timeslot);
        timeslot.assignDoctor(this);
    }

    //Getter and Setter

    public ArrayList<Timeslot> getTimeslots() {
        return timeslots;
    }

    public void setTimeslots(ArrayList<Timeslot> timeslots) {
        this.timeslots = timeslots;
    }
}
