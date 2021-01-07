import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public abstract class Reservation {              //Declaration of the fields needed to build a reservation object. reservationId has yet to be integrated.
    //final private Integer reservationId;

    final protected String reservationName;
    final protected String reservationUser;
    final protected String reservationInfo;

    final protected LocalDateTime reservationStart;

    final protected LocalDateTime reservationStop;


    final protected Long reservationDuration;

                                        /* Initialising the fields with the help of the constructor parameters. The constructor also calculates the duration
                                        of the created show/object in hours, and stores this value in the reservationDuration variable. */

    public Reservation (String reservationName, String reservationInfo, String reservationUser, String startReservation, String stopReservation) {
        this.reservationName = reservationName;
        this.reservationUser = reservationUser;
        this.reservationInfo = reservationInfo;

        this.reservationStart = LocalDateTime.parse(startReservation);
        this.reservationStop = LocalDateTime.parse(stopReservation);

        //LocalDateTime startParse = LocalDateTime.parse(newReservation.reservationStart);
        //LocalDateTime stopParse = LocalDateTime.parse(newReservation.reservationStop);

        reservationDuration = ChronoUnit.HOURS.between(reservationStart, reservationStop);


    }

    public LocalDateTime getReservationStart() {
        return reservationStart;
    }

    public LocalDateTime getReservationStop() {
        return reservationStop;
    }
}

/* To-do:
TODO: Create a random Integer ReservationId generator, with a getter.
 */


