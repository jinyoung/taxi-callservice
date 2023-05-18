package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.TaxiManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { TaxiManagementApplication.class })
public class CucumberSpingConfiguration {}
