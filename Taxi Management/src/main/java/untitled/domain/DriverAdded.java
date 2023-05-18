package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DriverAdded extends AbstractEvent {

    private String driverId;
    private String name;
    private String phoneNumber;

    public DriverAdded(Driver aggregate) {
        super(aggregate);
    }

    public DriverAdded() {
        super();
    }
}
