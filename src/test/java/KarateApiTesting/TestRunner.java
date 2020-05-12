package KarateApiTesting;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit4.Karate;

@KarateOptions(tags = {""})
public class TestRunner {
    @Test
    public void testParallel() {
        String output = "target/cucumber-html-reports";
        Results results = Runner.path("classpath:KarateApiTesting/KarateApi.feature").tags("~ignore").parallel(3);
        generateReport(output);
        assertEquals("Tests failed", 0, results.getFailCount());
    }

    private static void generateReport(String karateOutputPath) {

    }
}


