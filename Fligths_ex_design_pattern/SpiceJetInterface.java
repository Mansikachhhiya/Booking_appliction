package Fligths_ex_design_pattern;

import java.util.ArrayList;

public interface SpiceJetInterface {
  void welcome();
  int setTotal_seat(int total_seat);
  ArrayList<Integer> getAvailableSeats();
  ArrayList<Integer> getBook_seats();
}

class DomesticSpiceJet implements SpiceJetInterface,CommonInterface{
  int Total_seat;
  public ArrayList<Integer> availableSeats = new ArrayList<Integer>();
  public ArrayList<Integer> book_seats = new ArrayList<Integer>();

  @Override
  public void welcome() {
    System.out.println("Welcome to the Domestic Spice Jet Flight");
  }


  @Override
  public int setTotal_seat(int total_seat) {
    this.Total_seat = total_seat;
    for (int i =0;i<total_seat;i++){
      availableSeats.add(i+1);

    }
    return total_seat;
  }

  @Override
  public int getTotal_seat() {
    return Total_seat;
  }

  public ArrayList<Integer> getAvailableSeats() {
    return availableSeats;
  }
  public ArrayList<Integer> getBook_seats() {
    return book_seats;
  }
}
class InternationalSpiceJet implements SpiceJetInterface,CommonInterface{
  int Total_seat;
  public ArrayList<Integer> availableSeats = new ArrayList<Integer>();
  public ArrayList<Integer> book_seats = new ArrayList<Integer>();

  @Override
  public void welcome() {
    System.out.println("Welcome to the International Spice Jet Flight");
  }


  @Override
  public int setTotal_seat(int total_seat) {
    this.Total_seat = total_seat;
    for (int i =0;i<total_seat;i++){
      availableSeats.add(i+1);
      book_seats.add(i+1);
    }


    return total_seat;
  }
  @Override
  public ArrayList<Integer> getAvailableSeats() {
    return availableSeats;
  }
  @Override
  public ArrayList<Integer> getBook_seats() {
    return book_seats;
  }
  @Override
  public int getTotal_seat() {
    return Total_seat;
  }


}