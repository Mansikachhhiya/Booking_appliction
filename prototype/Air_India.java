package prototype;


import Exceptions_pakg.*;

import java.util.ArrayList;

public class Air_India extends Flights implements FlightBooking{


  public Air_India(String flight_no,int total_seats) {
    super(flight_no,total_seats);
//    super.setTotal_seats(10);
//    ArrayList<Integer> booked_seats = new ArrayList<Integer>(super.setTotal_seats(10));
//    super.setBooked_seats(booked_seats);
////    for(int i=1;i<super.setTotal_seats(10);i++){
//      booked_seats[i] = i;
//      System.out.println(booked_seats[i]);
//    }


//

  }

  @Override
  public void Booking(int SEAT_NO) throws seatnotavailableException,SeatOutOfBoundException {
    try {
      super.Booking(SEAT_NO);
    }catch(seatnotavailableException | SeatOutOfBoundException e){
      System.out.println(e.getMessage());
    }

    }


}
