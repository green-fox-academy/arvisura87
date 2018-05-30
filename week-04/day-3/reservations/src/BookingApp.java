import booking.Reservation;

public class BookingApp {

  public static void main(String[] args) {

    Reservation reservation = new Reservation();
    reservation.getCodeBooking();
    reservation.getDowBooking();
    System.out.println(reservation.toString());
  }
}
