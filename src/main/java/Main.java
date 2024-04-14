import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*  Δημιουργία αντικειμένων στη main (με ΤΥΧΑΙΕΣ τιμές στις ιδιότητές τους):  */

        /*  (α.) 15 ασφαλισμένους πολίτες: ηλικιών 10-90 ετών => σε ΛΙΣΤΑ  */
        /* Δημιουργία ενός ArrayList που περιέχει αντικείμενα τύπου 'Insured' */
        ArrayList<Insured> insured = new ArrayList<>();
        //βάσει ονόματος του κάθε ασφαλισμένου πολίτη:
        String[] insured_name = {"Γιάννης", "Ελένη", "Αντωνία", "Λίνα", "Θανάσης", "Μαρία", "Αρσένης", "Παυλίνα",
                "Όλγα", "Στέλιος", "Δήμητρα", "Παντελής", "Μιχάλης", "Κατερίνα", "Ανθή"};
        //καθώς και την ημερομηνία γέννησής του - να περιλαμβάνονται ηλικίες 10-90 ετών (γεννηθείς του 1934 έως 2014)
        //υλοποίηση με χρήση της 'LocalDate': πιο σύγχρονη μέθοδος και προσφέρει βελτιωμένη λειτουργικότητα
        LocalDate[] dates = new LocalDate[15];
        for (int i = 0; i < 15; i++) {
            dates[i] = LocalDate.of(1935 + (i * 5), 1, i + 1);
            Insured insured_people = new Insured(insured_name[i], dates[i]);
            insured.add(insured_people);
        }
        //print to check that's ok.
       /* for (Insured insured_people : insured) {
            System.out.println("Insured name: " + insured_people.getName() + "\n" +
                    "Birthday: " + insured_people.getBirthday());
        }*/

        //2 emboliastika kentra
        VaccinationCenter center1 = new VaccinationCenter("VC001", "Farsalwn 1, Farsala",
                Arrays.asList("9:00 AM", "10:00 AM", "11:00 AM"));

        VaccinationCenter center2 = new VaccinationCenter("VC002", "Malgarwn 1, Malgara",
                Arrays.asList("10:00 AM", "1:00 PM", "3:00 PM"));

        // Display details of center1
        System.out.println("VACCINATION CENTER 1:");
        System.out.println("Code: " + center1.getCode());
        System.out.println("Address: " + center1.getAddress());
        System.out.println("Timeslots: " + center1.getTimeslots());

        // Display details of center2
        System.out.println("\nVACCINATION CENTER 2:");
        System.out.println("Code: " + center2.getCode());
        System.out.println("Address: " + center2.getAddress());
        System.out.println("Timeslots: " + center2.getTimeslots());


    }
}
