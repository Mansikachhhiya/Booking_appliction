package Fligths_ex_design_pattern;

import java.util.ArrayList;

public interface CommonInterface {
  void welcome();
  int setTotal_seat(int total_seat);
  int getTotal_seat();
  ArrayList<Integer> getAvailableSeats();
  ArrayList<Integer> getBook_seats();
}
