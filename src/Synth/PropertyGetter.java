package Synth;//Created by Ryan on 7/20/17.
import Common.ResourceGetter;
public class PropertyGetter
{
    private static String getProperty(String propertyName)
    {
        return ResourceGetter.getProperty(propertyName);
    }
    public static int getSampleRate()
    {
        return Integer.parseInt(getProperty("sampleRate"));
    }
    public static int getBitsPerSample()
    {
        return Integer.parseInt(getProperty("bitsPerSample"));
    }
    public static boolean getMustMaintainTempo()
    {
        return Boolean.parseBoolean(getProperty("mustMaintainTempo"));
    }
    public static String getOutputFilePath()
    {
        return getProperty("outputFilePath");
    }
    public static boolean getSaveOutputFile()
    {
        return Boolean.parseBoolean(getProperty("saveOutputFile"));
    }
}
