import java.util.ArrayList;

public class EventReservation extends Reservation{


    final protected String reservationLocation;
    protected ArrayList<Equipment> reservedEventStuff;

    public EventReservation(String reservationName, String reservationLocation, String reservationInfo, String reservationUser, String startReservation, String stopReservation) {
        super(reservationName, reservationInfo, reservationUser, startReservation, stopReservation);

        this.reservationLocation = reservationLocation;

        reservedEventStuff = new ArrayList<>();
    }

    public double calculateReservationCost(double rentalCalculated) {
        //calculator for rentalcosts
        rentalCalculated = rentalCalculated + 0.00;
        return rentalCalculated;
    }

    /* The toString method is overridden and used to return a reservation
  overview in a string variable. */
    @Override
    public String toString(){
        String reservationOverview = "Show/Reservation: " + reservationName;
        reservationOverview += "\nTakes place at: " + reservationLocation;
        reservationOverview += "\nShowtime: " + reservationStart;
        reservationOverview += "\nCurfew: " + reservationStop;
        reservationOverview += "\nShow length: " + reservationDuration + " hours";
        reservationOverview += "\nProduction info: " + reservationInfo;
        reservationOverview += "\nShow Producer: " + reservationUser;
        reservationOverview += "\n----------------------------\n\n";
        return reservationOverview;

    }

}
