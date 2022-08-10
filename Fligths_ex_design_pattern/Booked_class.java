package Fligths_ex_design_pattern;

import Exceptions_pakg.SeatOutOfBoundException;
import Exceptions_pakg.seatnotavailableException;

import java.util.ArrayList;

abstract class Booked_class {
  static ArrayList<Integer> availableSeats = new ArrayList<Integer>();
  static ArrayList<Integer> book_seats = new ArrayList<Integer>();

  public static FlightInterface Flight(FlightEnum flightEnum) {
    return flightCompany.getFlight(flightEnum);
  }

  public static void Booking(int seatNo, FlightEnum flightEnum, FlightType flightType,FlightInterface f1) throws SeatOutOfBoundException, seatnotavailableException {
     f1 = Flight(flightEnum);
    int total_seat = 0;
    if (f1.getAirIndia(flightType) == f1) {
      total_seat = f1.getAirIndia(flightType).setTotal_seat(10);
    } else if (f1.getSpiceJet(flightType) == f1) {
      total_seat = f1.getSpiceJet(flightType).setTotal_seat(5);
    }
    try {
      if (seatNo < total_seat && seatNo > 0) {
        try {
          if (!checkseat(seatNo, flightEnum, flightType)) {
            availableSeats.remove(availableSeats.indexOf(seatNo));
            book_seats.add(seatNo);
//            System.out.println(.class.getSimpleName() + " Your SEAT NO: " + seatNo);
            System.out.println("YOUR SEAT BOOK IS SUCCESSFULLY");
//            System.out.println("Thank you for travelling with " + Booked_class.class.getSimpleName() + " Airline!!!!!!");
          } else throw new seatnotavailableException("Sorry!! This seat is not available ");
        } catch (seatnotavailableException e) {
          throw new seatnotavailableException("Sorry!! This seat is not available");
        }
      } else {
        throw new SeatOutOfBoundException("Please Enter valid seat number\nTotal seat are " + total_seat);
      }
    } catch (SeatOutOfBoundException e) {
      throw new SeatOutOfBoundException("Please Enter valid seat number\nTotal seat are " + total_seat);
    }
  }

//    return this.availableSeats[SEAT_NO - 1] == 0;


    private static boolean checkseat( int seatNo, FlightEnum flightEnum, FlightType flightType){
      FlightInterface f1 = Flight(flightEnum);

      if (f1 == f1.getAirIndia(flightType)) {
        availableSeats = f1.getAirIndia(flightType).getAvailableSeats();
        book_seats = f1.getAirIndia(flightType).getBook_seats();

      } else if (f1 == f1.getSpiceJet(flightType)) {
        availableSeats = f1.getSpiceJet(flightType).getAvailableSeats();
        book_seats = f1.getSpiceJet(flightType).getBook_seats();
      }


      return availableSeats.get(seatNo - 1) == 0;
    }
  }
