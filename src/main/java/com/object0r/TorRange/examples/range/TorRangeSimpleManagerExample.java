package com.object0r.TorRange.examples.range;

import com.object0r.TorRange.ProxyRangeWorkerManager;
import com.object0r.TorRange.datatypes.EntriesRange;
import org.ini4j.Ini;

import java.io.File;
import java.util.Vector;

public class TorRangeSimpleManagerExample extends ProxyRangeWorkerManager
{
    public TorRangeSimpleManagerExample(String iniFilename, Class workerClass)
    {
        super(iniFilename, workerClass, TorRangeSimpleManagerExample.class);
    }

    @Override
    public void prepareForExit()
    {

    }

    @Override
    public void readOptions(String filename)
    {
        try
        {

            Ini prefs = new Ini(new File(filename));
            System.out.println(prefs.get("simple-example", "someVariable"));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(0);
        }
    }

    public Vector<EntriesRange> getUserRanges()
    {
        Vector ranges = new Vector<EntriesRange>();
        ranges.add(new EntriesRange(1, 4155328));
        return ranges;
    }
}
