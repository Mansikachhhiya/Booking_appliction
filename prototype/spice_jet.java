package prototype;

import Exceptions_pakg.SeatOutOfBoundException;
import Exceptions_pakg.seatnotavailableException;

public class spice_jet extends Flights implements FlightBooking{


  public spice_jet(String flight_no,int total_seats) {
    super(flight_no,total_seats);

  }

  @Override
  public void Booking(int SEAT_NO) throws seatnotavailableException, SeatOutOfBoundException {
    try {
      super.Booking(SEAT_NO);
    } catch (seatnotavailableException | SeatOutOfBoundException e) {
      System.out.println(e.getMessage());
    }
  }
}
