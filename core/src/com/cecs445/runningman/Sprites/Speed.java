package com.cecs445.runningman.Sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.World;
import com.cecs445.runningman.RunningMan;
import com.cecs445.runningman.Screens.PlayScreen;

/**
 * Created by Christian on 11/9/2016.
 */

public class Speed extends InteractiveTileObject {
    public Man man;
    public Speed(World world, TiledMap map, Rectangle bounds, Man man) {
        super(world, map, bounds);
        fixture.setUserData(this);
        fixture.setSensor(true);
        this.man = man;
    }

    @Override
    public void onPlayerContact() {
        setCategoryFilter(RunningMan.DestroyedBit);
        getCell().setTile(null);
        RunningMan.feather.play();
    }

    @Override
    public void onContactEnd() {

    }
}
