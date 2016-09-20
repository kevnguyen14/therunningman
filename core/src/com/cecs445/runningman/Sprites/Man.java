package com.cecs445.runningman.Sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;
import com.cecs445.runningman.RunningMan;

/**
 * Created by Kevin on 9/19/2016.
 */
public class Man extends Sprite{
    public World world;
    public Body b2body;

    public Man(World world) {
        this.world = world;
        defineMan();
    }

    public void defineMan(){
        BodyDef bdef = new BodyDef();
        bdef.position.set(32 / RunningMan.PPM, 32/ RunningMan.PPM);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body = world.createBody(bdef);

        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();
        shape.setRadius(5 / RunningMan.PPM);

        fdef.shape = shape;
        b2body.createFixture(fdef);

    }
}