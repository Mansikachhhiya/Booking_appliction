package Fligths_ex_design_pattern;

import Fligths_ex_design_pattern.Enum.FlightType;

public interface FlightInterface {
  AirIndiaInterface getAirIndia(FlightType flightType);
  SpiceJetInterface getSpiceJet(FlightType flightType);
}

