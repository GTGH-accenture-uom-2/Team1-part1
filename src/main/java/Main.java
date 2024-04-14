import java.time.LocalDate;
import java.util.ArrayList;

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
        for (Insured insured_people : insured) {
            System.out.println("Insured name: " + insured_people.getName() + "\n" +
                    "Birthday: " + insured_people.getBirthday());
        }

    }
}
