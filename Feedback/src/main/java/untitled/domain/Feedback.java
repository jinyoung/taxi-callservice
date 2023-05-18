package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.FeedbackApplication;
import untitled.domain.FeedbackSubmitted;

@Entity
@Table(name = "Feedback_table")
@Data
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rating;

    private String comment;

    @PostPersist
    public void onPostPersist() {
        FeedbackSubmitted feedbackSubmitted = new FeedbackSubmitted(this);
        feedbackSubmitted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FeedbackRepository repository() {
        FeedbackRepository feedbackRepository = FeedbackApplication.applicationContext.getBean(
            FeedbackRepository.class
        );
        return feedbackRepository;
    }
}
