package com.hajj.trekkon.trekkonhajj.inface;
import android.location.Location;
/**
 * Created by trekkon on 3/14/18.
 */

public interface LocationTracker {

    public interface LocationUpdateListener{
        public void onUpdate(Location oldLoc, long oldTime, Location newLoc, long newTime);
    }

    public void start();
    public void start(LocationUpdateListener update);

    public void stop();

    public boolean hasLocation();

    public boolean hasPossiblyStaleLocation();

    public Location getLocation();

    public Location getPossiblyStaleLocation();

}
