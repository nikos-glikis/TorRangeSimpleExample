package com.object0r.TorRange.examples.range;


public class Main
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("No session ini in arguments.");
            System.out.println("Usage: ");
            System.out.println("java -cp target/classes/;lib/* com.object0r.TorRange.examples.range.Main example.ini");

            System.exit(0);
        }

        try
        {
            TorRangeSimpleManagerExample torRangeSimpleExampleManager = new TorRangeSimpleManagerExample(args[0], TorRangeSimpleWorkerExample.class);
            torRangeSimpleExampleManager.startWorkers();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
