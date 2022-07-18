package prototype;
import Exceptions_pakg.*;
abstract class Flights implements FlightBooking {
  private String flight_no;
  private int total_seats ;
  private int [] booked_seats;
  private int [] availableSeats;


  public Flights(String flight_no,int total_seats) {
    this.flight_no = flight_no;
    this.total_seats= total_seats;
    this.booked_seats = new int[total_seats];
    this.availableSeats = new int[total_seats];
    for(int i =0;i<total_seats;i++){
      availableSeats[i]=i+1;

    }
  }

  @Override
  public synchronized void Booking(int SEAT_NO) throws seatnotavailableException,SeatOutOfBoundException{
    System.out.println(Thread.currentThread().getName()+" is booking seat "+SEAT_NO+" for flight "+getFlight_no());
//    System.out.println("Available Seats:"+availableSeats);
//    System.out.println("Booked Seats: "+booked_seats);
    try{
      Thread.sleep((long) Math.random() * 10000);
    }catch (Exception e){
      System.out.println(e.getMessage());
    }
    try {
      if(SEAT_NO < total_seats &&  SEAT_NO > 0) {
        try {
          if (!checkseat(SEAT_NO)) {
              this.availableSeats[SEAT_NO-1]=0;
              this.booked_seats[SEAT_NO-1]=SEAT_NO;
             System.out.println("Seat "+SEAT_NO+" is booked by thread "+Thread.currentThread().getName()+" for flight " +getFlight_no());
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
        throw new SeatOutOfBoundException("Please Enter valid seat number\nTotal seat are "+getTotal_seats());
      }
    }catch (SeatOutOfBoundException e){
      throw new SeatOutOfBoundException("Please Enter valid seat number\nTotal seat are "+getTotal_seats());

    }
  }
 public boolean checkseat(int SEAT_NO) {
   return  this.availableSeats[SEAT_NO-1]==0;
 }

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
  public int[] getBooked_seats() {
    return booked_seats;
  }

  public void setBooked_seats(int[] booked_seats) {
    this.booked_seats = booked_seats;
  }
  public int[] getAvailableSeats() {
    return availableSeats;
  }

  public void setAvailableSeats(int[] availableSeats) {
    this.availableSeats = availableSeats;
  }

}

