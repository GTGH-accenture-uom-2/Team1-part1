/* Κλάση: για τον Γιατρό  */
/* την διαχειριζόμαστε ως Υπο-κλάση της Υπερ-κλάσης 'Insured' */

import java.time.LocalDate;

public class Doctor extends Insured{
    /* δηλώνω ΜΟΝΟ τα πεδία που ΔΕΝ κληρονομώ */
    /*private Timeslot[] timeslot;*/

    public Doctor(String afm, String amka, String name, String surname, LocalDate birthday, String email /*,Timeslot[] timeslot*/) {
        //πρέπει να καλέσουμε τον κατασκευαστή της ΥΠΕΡΚΛΑΣΗΣ ως 1η εντολή:
        super(afm, amka, name, surname, birthday, email);
        //this.timeslot = timeslot;
    }


}
