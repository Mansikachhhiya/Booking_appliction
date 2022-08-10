package prototype;
import Exceptions_pakg.*;
public class Air_India extends Flights implements FlightBooking{


  public Air_India(String flight_no,int total_seats) {
    super(flight_no,total_seats);
  }

  @Override
  public synchronized void Booking(int SEAT_NO) throws seatnotavailableException , SeatOutOfBoundException{
    try {
      super.Booking(SEAT_NO);
    }catch(seatnotavailableException | SeatOutOfBoundException e){
      System.out.println(e.getMessage());
    }

    }

  @Override
  public synchronized void cancleBooking(int SEAT_NO) throws seatnotavailableException {
    try {
      super.cancleBooking(SEAT_NO);
    }catch (seatnotavailableException e){
      System.out.println(e.getMessage());
    }
  }


}
