package com.cecs445.runningman.Sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.cecs445.runningman.RunningMan;
import com.cecs445.runningman.Scenes.Hud;
import com.cecs445.runningman.Screens.PlayScreen;

/**
 * Created by Christian on 10/31/2016.
 */
public class Swamp extends InteractiveTileObject {
    public Man man;
    public Swamp(World world, TiledMap map, Rectangle bounds, Man man) {
        super(world, map, bounds);
        fixture.setUserData(this);
        this.man = man;
    }

    @Override
    public void onPlayerContact() {
//        man.isSlowed = true;
        man.slowTrigger();
        RunningMan.sand.play();
    }

    @Override
    public void onContactEnd() {
//        man.isSlowed = false;
        man.slowTrigger();
    }
}
