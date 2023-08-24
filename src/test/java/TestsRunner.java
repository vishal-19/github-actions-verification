import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

public class TestsRunner {

    @Test
    public void triggerTests() {
        Results results = Runner.
                builder().backupReportDir(false).path("classpath:features").parallel(1);
    }
}
