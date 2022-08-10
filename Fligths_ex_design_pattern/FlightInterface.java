package Fligths_ex_design_pattern;

public interface FlightInterface {
  AirIndiaInterface getAirIndia(FlightType flightType);
  SpiceJetInterface getSpiceJet(FlightType flightType);
}

