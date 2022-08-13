package Fligths_ex_design_pattern;

import Exceptions_pakg.SeatOutOfBoundException;
import Exceptions_pakg.seatnotavailableException;
import Fligths_ex_design_pattern.Enum.FlightEnum;
import Fligths_ex_design_pattern.Enum.FlightType;
import Fligths_ex_design_pattern.BookingSyatem.BookingClass;

public class Booking {
  public static void main(String[] args) throws SeatOutOfBoundException,seatnotavailableException {
//    FlightInterface flightInterface = flightCompany.getFlight(FlightEnum.AIRINDIA);
//    AirIndiaInterface airIndiaInterface = flightInterface.getAirIndia(FlightType.DOMESTIC);
//    airIndiaInterface.welcome();
//
//
//    airIndiaInterface.setTotal_seat(10);
//
//   System.out.println(airIndiaInterface.getAvailableSeats());
//   System.out.println(airIndiaInterface.getBook_seats());

    try{
      CommonInterface flight_1 = BookingClass.Flight(FlightEnum.AIRINDIA,FlightType.DOMESTIC);
      flight_1.setTotal_seat(10);
      flight_1.welcome();
      System.out.println("Available Seats :"+ flight_1.getAvailableSeats());
      System.out.println("Booked Seats :"+ flight_1.getBook_seats());
      BookingClass.BookingMethod(flight_1,1);
      System.out.println("Booked Seats :"+ flight_1.getBook_seats());
      System.out.println("Available Seats :"+ flight_1.getAvailableSeats());
    } catch (seatnotavailableException|SeatOutOfBoundException e){
      System.out.println(e.getMessage());
    }

  }
}
