package prototype;

//import java.util.Arrays;


import Exceptions_pakg.*;


import java.util.ArrayList;

abstract class Flights implements FlightBooking {


  private String flight_no;
  private int total_seats ;



  private ArrayList<Integer> booked_seats = new ArrayList<Integer>(total_seats);


  private ArrayList<Integer> availableSeats = new ArrayList<Integer>();


  public Flights(String flight_no,int total_seats) {
    this.flight_no = flight_no;
    this.total_seats= total_seats;
//    for(int i =0;i<getTotal_seats();i++){
//      this.booked_seats.add(i);
//      System.out.println(booked_seats);
//    }
//    for(int seat:this.booked_seats){
//      if(seat!=0){
//        this.availableSeats.add(seat);
//      }
//    }
    for(int i =0;i<total_seats;i++){
      this.availableSeats.add(i+1);
      this.booked_seats.add(i+1);
    }
  }

  @Override
  public void Booking(int SEAT_NO) throws seatnotavailableException,SeatOutOfBoundException{
    System.out.println("Available Seats:"+availableSeats);
    System.out.println("Booked Seats: "+booked_seats);
    try {
      if(SEAT_NO < availableSeats.size()) {
        try {
          if (checkseat(SEAT_NO)) {
            this.availableSeats.remove(this.availableSeats.indexOf(SEAT_NO));
            // this.booked_seats.add(SEAT_NO);
            this.booked_seats.set(SEAT_NO - 1, 0);
            // this.availableSeats.set(,0);
            //System.out.println(availableSeats);

            //System.out.println(getBooked_seats().size());
            System.out.println(getClass().getSimpleName() + " Flight Number :" + getFlight_no());
            System.out.println(getClass().getSimpleName() + " Your SEAT NO: " + SEAT_NO);
            System.out.println("YOUR SEAT BOOK IS SUCCESSFULLY");
            System.out.println("Thank you for travelling with " + getClass().getSimpleName() + " Airline!!!!!!");
          } else throw new seatnotavailableException("Sorry!! This seat is not available ");

        } catch (seatnotavailableException e) {
          throw new seatnotavailableException("Sorry!! This seat is not available");

        }
      }
      else {
        throw new SeatOutOfBoundException("Please Enter valid seat number\n Total seat are "+getTotal_seats());
      }
    }catch (SeatOutOfBoundException e){
      throw new SeatOutOfBoundException("Please Enter valid seat number\n Total seat are "+getTotal_seats());

    }
  }
 public boolean checkseat(int num) {
   for (int seat : this.availableSeats) {
     if (seat == num) {
       return true;
     }
   }
   return false;
 }
//  @Override
//  public void print_details() {
//    System.out.println("flight No: " + getFlight_no());
//    System.out.println("Total Seats: " + getTotal_seats());
//    //System.out.println("Booked seats: "+getBooked_seats());
////    System.out.println("Available Seats: "+getAvailable_seats());
////    for(int i = 0; i<getTotal_seats(); i++){
////      booked_seats[i] = i;
////      System.out.println(booked_seats);
////    }
////
////    List Booked_seat = Arrays.asList(booked_seats);
//
//
//  }

  public String getFlight_no() {
    return flight_no;
  }

  public void setFlight_no(String flight_no) {
    this.flight_no = flight_no;
  }

  public int getTotal_seats() {
    return total_seats;
  }

  public int setTotal_seats(int total_seats) {
    this.total_seats = total_seats;
    return total_seats;
  }

  public ArrayList<Integer> getBooked_seats() {
    return booked_seats;
  }

  public void setBooked_seats(ArrayList<Integer> booked_seats) {
    this.booked_seats = booked_seats;
  }
  public ArrayList<Integer> getAvailableSeats() {
    return availableSeats;
  }

  public void setAvailableSeats(ArrayList<Integer> availableSeats) {
    this.availableSeats = availableSeats;
  }


}

