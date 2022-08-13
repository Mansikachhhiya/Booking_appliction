package Fligths_ex_design_pattern;

import Fligths_ex_design_pattern.Enum.FlightType;

public class SpiceJet implements FlightInterface {

  @Override
  public AirIndiaInterface getAirIndia(FlightType flightType) {
    return null;
  }

  @Override
  public SpiceJetInterface getSpiceJet(FlightType flightType) {
    switch (flightType) {
      case DOMESTIC:
        return new DomesticSpiceJet();
      case INTERNATIONAL:
        return new InternationalSpiceJet();
    }
    return null;
  }
}
