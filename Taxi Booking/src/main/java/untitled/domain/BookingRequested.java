package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class BookingRequested extends AbstractEvent {

    private Long bookingId;
    private String dropOffLocation;
    private String userId;
    private String pickUpLocation;
    private String dropOffLocation;
    private Date arrivalTime;

    public BookingRequested(Booking aggregate) {
        super(aggregate);
    }

    public BookingRequested() {
        super();
    }
}
