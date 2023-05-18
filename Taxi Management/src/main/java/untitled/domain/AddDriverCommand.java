package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class AddDriverCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String name;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String phoneNumber;
}
