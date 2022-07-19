package prototype;

import Exceptions_pakg.SeatOutOfBoundException;
import Exceptions_pakg.seatnotavailableException;

public interface FlightBooking {

  void Booking(int SEAT) throws seatnotavailableException, SeatOutOfBoundException;
  void cancleBooking(int SEAT) throws seatnotavailableException;
}
