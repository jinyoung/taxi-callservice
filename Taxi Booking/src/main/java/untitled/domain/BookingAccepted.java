package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class BookingAccepted extends AbstractEvent {

    private String pickUpLocation;
    private String dropOffLocation;
    private String driverId;
    private String pickUpLocation;
    private Date arrivalTime;

    public BookingAccepted(Booking aggregate) {
        super(aggregate);
    }

    public BookingAccepted() {
        super();
    }
}
