package Fligths_ex_design_pattern;

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

  public static CommonInterface Flight() {
    return null;
  }
}