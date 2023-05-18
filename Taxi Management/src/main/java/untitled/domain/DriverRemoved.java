package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DriverRemoved extends AbstractEvent {

    private String driverId;

    public DriverRemoved(Driver aggregate) {
        super(aggregate);
    }

    public DriverRemoved() {
        super();
    }
}
