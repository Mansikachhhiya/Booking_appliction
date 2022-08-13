package Fligths_ex_design_pattern;

import Fligths_ex_design_pattern.Enum.FlightEnum;
import Fligths_ex_design_pattern.Enum.FlightType;

public class flightCompany {
  public static FlightInterface getFlight(FlightEnum flightEnum){
    switch (flightEnum){
      case AIRINDIA:
        return new AirIndia();
      case SPICEJET:
        return new SpiceJet();
    }
    return null;
  }
}
class BookingClass {

  public static CommonInterface Flight(FlightEnum airindia, FlightType domestic) {
    return null;
  }

//  public static void BookingMethod(CommonInterface flight_1, int i) {
//  }
}