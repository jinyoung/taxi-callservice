package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.TaxiBookingApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { TaxiBookingApplication.class })
public class CucumberSpingConfiguration {}
