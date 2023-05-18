package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.TaxiBookingApplication;
import untitled.domain.BookingRequested;

@Entity
@Table(name = "Booking_table")
@Data
public class Booking {

    private String pickUpLocation;

    private String dropOffLocation;

    private Date arrivalTime;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookingId;

    private String status;

    @PostPersist
    public void onPostPersist() {
        BookingRequested bookingRequested = new BookingRequested(this);
        bookingRequested.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static BookingRepository repository() {
        BookingRepository bookingRepository = TaxiBookingApplication.applicationContext.getBean(
            BookingRepository.class
        );
        return bookingRepository;
    }

    public void acceptBooking(AcceptBookingCommand acceptBookingCommand) {
        // implement business logic here
        this.setStatus("ACCEPTED");
        BookingAccepted bookingAccepted = new BookingAccepted(this);
        bookingAccepted.publishAfterCommit();
    }

    public void declineBooking(DeclineBookingCommand declineBookingCommand) {
        // implement business logic here
        this.setStatus("DECLINED");
        BookingDeclined bookingDeclined = new BookingDeclined(this);
        bookingDeclined.publishAfterCommit();
    }
}
