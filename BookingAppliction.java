import Exceptions_pakg.SeatOutOfBoundException;
import Exceptions_pakg.seatnotavailableException;
import prototype.Air_India;

public class BookingAppliction {
public static void main(String[] args) {
  Air_India book1 = new Air_India("123b",10);
  Thread thread_1 = new Thread(()->{
    try{
      book1.Booking(6);

    }catch (seatnotavailableException | SeatOutOfBoundException e){
      System.out.println(e.getMessage());
    }
  });
  //System.out.println("-----------------------------------------------");
 // book1.Booking(-2);
  //System.out.println("-----------------------------------------------");
  Thread thread_2 = new Thread(()->{
    try{
      book1.Booking(6);

    }catch (seatnotavailableException | SeatOutOfBoundException e){
      System.out.println(e.getMessage());
    }
  });

  Thread thread_3 = new Thread(()->{
    try{
      book1.Booking(6);

    }catch (seatnotavailableException | SeatOutOfBoundException e){
      System.out.println(e.getMessage());
    }
  });
  thread_3.setName("customer_3");
  thread_1.setName("customer_1");
  thread_2.setName("customer_2");
  //thread_3.setName("customer_3");
  thread_2.start();
  thread_3.start();
  thread_1.start();

}
}
