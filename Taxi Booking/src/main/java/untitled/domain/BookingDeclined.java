package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class BookingDeclined extends AbstractEvent {

    private String pickUpLocation;
    private String dropOffLocation;
    private String driverId;
    private String reason;

    public BookingDeclined(Booking aggregate) {
        super(aggregate);
    }

    public BookingDeclined() {
        super();
    }
}
