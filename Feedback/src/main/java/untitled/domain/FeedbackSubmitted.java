package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FeedbackSubmitted extends AbstractEvent {

    private String bookingId;
    private Integer rating;
    private String comment;

    public FeedbackSubmitted(Feedback aggregate) {
        super(aggregate);
    }

    public FeedbackSubmitted() {
        super();
    }
}
