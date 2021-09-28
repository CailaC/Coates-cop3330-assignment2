package ex40;

import java.util.Date;

public class Record {
    String firstName;
    String lastName;
    String position;
    Date seperationDate;

    public Record(String firstName, String lastName,
                  String position, Date seperationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.seperationDate = seperationDate;
    }
}