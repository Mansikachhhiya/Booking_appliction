package Fligths_ex_design_pattern;

import prototype.FlightBooking;

public class Booking {
  public static void main(String[] args) {
    FlightInterface flightInterface = flightCompany.getFlight(FlightEnum.AIRINDIA);
    AirIndiaInterface airIndiaInterface = flightInterface.getAirIndia(FlightType.DOMESTIC);
    airIndiaInterface.welcome();


    airIndiaInterface.setTotal_seat(10);

   System.out.println(airIndiaInterface.getAvailableSeats());
   System.out.println(airIndiaInterface.getBook_seats());


  }
}
