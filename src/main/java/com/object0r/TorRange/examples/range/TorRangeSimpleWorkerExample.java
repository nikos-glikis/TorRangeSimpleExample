package com.object0r.TorRange.examples.range;

import com.object0r.TorRange.TorWorker;

/**
 * Demonstrates the "Range" abilities of TorRange.
 */
public class TorRangeSimpleWorkerExample extends TorWorker
{
    TorRangeSimpleManagerExample manager;

    public TorRangeSimpleWorkerExample(TorRangeSimpleManagerExample manager, int id)
    {
        super(manager, id);
        this.manager = manager;
    }

    protected void process(String nextToProcess)
    {
        try
        {
            //manager.markSuccessful(nextToProcess);
            System.out.println(nextToProcess);
            Thread.sleep(100);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
