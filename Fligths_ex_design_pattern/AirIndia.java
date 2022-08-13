package Fligths_ex_design_pattern;

import Fligths_ex_design_pattern.Enum.FlightType;

public class AirIndia implements FlightInterface {

  @Override
  public AirIndiaInterface getAirIndia(FlightType flightType) {
    switch (flightType) {
      case DOMESTIC:
        return new DomesticAirIndia();
      case INTERNATIONAL:
        return new InternationalAirIndia();
    }
    return null;
  }

  @Override
  public SpiceJetInterface getSpiceJet(FlightType flightType) {
    return null;
  }
}
