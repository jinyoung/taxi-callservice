package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class AcceptBookingCommand {

    private String pickUpLocation;
    private String dropOffLocation;
    private String driverId;
}
