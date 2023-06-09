package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class RequestTaxiCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String pickUpLocation;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String dropOffLocation;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String userId;
}
