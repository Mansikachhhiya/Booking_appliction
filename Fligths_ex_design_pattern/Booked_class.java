package Fligths_ex_design_pattern;

import Exceptions_pakg.SeatOutOfBoundException;
import Exceptions_pakg.seatnotavailableException;
import Fligths_ex_design_pattern.Enum.FlightEnum;
import Fligths_ex_design_pattern.Enum.FlightType;

import java.util.ArrayList;

public abstract class Booked_class {
  static ArrayList<Integer> availableSeats = new ArrayList<Integer>();
  static ArrayList<Integer> book_seats = new ArrayList<Integer>();

  public static FlightInterface Flight(FlightEnum flightEnum) {
    return flightCompany.getFlight(flightEnum);
  }
  public static BookingClass Booking(FlightEnum flightEnum,FlightInterface flightInterface,int seatno){
    
  }
}
