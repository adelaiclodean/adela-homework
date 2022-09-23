package Homework12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StreamsAndLambdaTest {
    @Test
    public void createFileAndWriteFile(){
        StreamsAndLambda app = new StreamsAndLambda();
        assertTrue(app.resolve("inputFile", 2, "outputFile"));
    }
}