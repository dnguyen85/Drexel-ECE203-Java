package A1;

import java.lang.Runtime;

/**
 * This class illustrate how to check the current available memory and processor
 * resources available to the Java Virtual Machine
 */
public class AvailMemory
{
    public static void main(String[] args)
    {
        // Get the current Runtime environment of this application
        Runtime currentRuntimeEnv = Runtime.getRuntime();

        System.out.println("Maximum memory (bytes) = "
                                + currentRuntimeEnv.maxMemory());
        System.out.println("Allocated memory (bytes) = "
                                + currentRuntimeEnv.totalMemory());
        System.out.println("Free memory (bytes) = "
                                + currentRuntimeEnv.freeMemory());
        System.out.println("Number of available processor = "
                                + currentRuntimeEnv.availableProcessors());
    }
}
