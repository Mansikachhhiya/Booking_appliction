package Fligths_ex_design_pattern.BookingSyatem;

import Exceptions_pakg.SeatOutOfBoundException;
import Exceptions_pakg.seatnotavailableException;
import Fligths_ex_design_pattern.*;
import Fligths_ex_design_pattern.Enum.FlightEnum;
import Fligths_ex_design_pattern.Enum.FlightType;

public abstract class BookingClass {
  public static CommonInterface Flight(FlightEnum flightEnum, FlightType flightType){
    FlightInterface Flight = flightCompany.getFlight(flightEnum);
    switch (flightEnum){
      case AIRINDIA:
        return (CommonInterface)Flight.getAirIndia(flightType);
      case SPICEJET:
        return (CommonInterface)Flight.getSpiceJet(flightType);
    }
    return null;
  }
  public static void BookingMethod(CommonInterface flight,int SeatNo) throws seatnotavailableException, SeatOutOfBoundException {
    try {
      if (SeatNo < flight.getTotal_seat() && SeatNo > 0) {
        try {
          if (!CheckSeat(flight, SeatNo)) {
            flight.getAvailableSeats().remove(SeatNo - 1);
            flight.getBook_seats().add(SeatNo);
            System.out.println("Seat number " + SeatNo + " has been booked successfully");
          } else {
            throw new seatnotavailableException("Seat Not Available");
          }
      }catch(seatnotavailableException e) {
          throw new seatnotavailableException("Sorry!! This seat is not available");
        }

      }else {
        throw new SeatOutOfBoundException("Please Enter valid seat number\nTotal seat are " + flight.getTotal_seat());
      }
    } catch (SeatOutOfBoundException e) {
      throw new SeatOutOfBoundException("Please Enter valid seat number\nTotal seat are " + flight.getTotal_seat());

    }

  }
  public static Boolean CheckSeat(CommonInterface flight, int SeatNo){
    return flight.getAvailableSeats().indexOf(SeatNo-1)==0;
  }
}
