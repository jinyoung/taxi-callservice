package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.TaxiManagementApplication;
import untitled.domain.DriverAdded;
import untitled.domain.DriverRemoved;

@Entity
@Table(name = "Driver_table")
@Data
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    private String phoneNumber;

    @PostPersist
    public void onPostPersist() {
        DriverAdded driverAdded = new DriverAdded(this);
        driverAdded.publishAfterCommit();

        DriverRemoved driverRemoved = new DriverRemoved(this);
        driverRemoved.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    @PreRemove
    public void onPreRemove() {}

    public static DriverRepository repository() {
        DriverRepository driverRepository = TaxiManagementApplication.applicationContext.getBean(
            DriverRepository.class
        );
        return driverRepository;
    }
}
