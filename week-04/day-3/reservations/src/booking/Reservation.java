package booking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservation implements Reservationy{

  private String code;
  private String dow;

  @Override
  public String getDowBooking() {
    List<String> dowList = new ArrayList<>(Arrays.asList("MON", "TUE", "WED",
        "THU", "FRI", "SAT", "SUN"));
    Random random = new Random();
    int random0to6 = random.nextInt(6-0);
    this.dow = dowList.get(random0to6);

    return this.dow;
  }

  @Override
  public String getCodeBooking() {
    String abc09 = "abcdefghijklmnopqrstuvwxyz0123456789";
    String code = "";
    Random random1 = new Random();

    for (int i = 0; i < 8; i++) {
      int random0to35 = random1.nextInt(35-0);
      code += abc09.charAt(random0to35);
    }

    this.code = code.toUpperCase();
    return this.code;
  }

  @Override
  public String toString() {
    return "Booking# " + code + " for " + dow;
  }
}

