package untitled.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import untitled.domain.*;

@RestController
// @RequestMapping(value="/bookings")
@Transactional
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @RequestMapping(
        value = "bookings/{id}/accept",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Booking acceptBooking(
        @PathVariable(value = "id") Long id,
        @RequestBody AcceptBookingCommand acceptBookingCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /booking/acceptBooking  called #####");
        Optional<Booking> optionalBooking = bookingRepository.findById(id);

        optionalBooking.orElseThrow(() -> new Exception("No Entity Found"));
        Booking booking = optionalBooking.get();
        booking.acceptBooking(acceptBookingCommand);

        bookingRepository.save(booking);
        return booking;
    }

    @RequestMapping(
        value = "bookings/{id}/decline",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Booking declineBooking(
        @PathVariable(value = "id") Long id,
        @RequestBody DeclineBookingCommand declineBookingCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /booking/declineBooking  called #####");
        Optional<Booking> optionalBooking = bookingRepository.findById(id);

        optionalBooking.orElseThrow(() -> new Exception("No Entity Found"));
        Booking booking = optionalBooking.get();
        booking.declineBooking(declineBookingCommand);

        bookingRepository.save(booking);
        return booking;
    }
}
