package Fligths_ex_design_pattern.BookingSyatem;

import Exceptions_pakg.SeatOutOfBoundException;
import Exceptions_pakg.seatnotavailableException;
import Fligths_ex_design_pattern.*;

import static Fligths_ex_design_pattern.FlightEnum.AIRINDIA;

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
    try{
      if(SeatNo< flight.getTotal_seat() && SeatNo>0){
        if(!)
      }
    }


  }
  public Boolean CheckSeat(CommonInterface flight,int SeatNo){
    return flight.getAvailableSeats().indexOf(SeatNo-1)==0;
  }
}
