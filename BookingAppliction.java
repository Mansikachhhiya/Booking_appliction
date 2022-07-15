import Exceptions_pakg.SeatOutOfBoundException;
import Exceptions_pakg.seatnotavailableException;
import prototype.Air_India;

public class BookingAppliction {
public static void main(String[] args) throws seatnotavailableException , SeatOutOfBoundException {
  Air_India book1 = new Air_India("123b",10);
 // Air_India book2 = new Air_India("122c");
  book1.Booking(11);
  System.out.println("-----------------------------------------------");
  book1.Booking(7);
  System.out.println("________________________________________________");
  book1.Booking(8);
}
}
