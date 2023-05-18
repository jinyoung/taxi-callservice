package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.FeedbackApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { FeedbackApplication.class })
public class CucumberSpingConfiguration {}
