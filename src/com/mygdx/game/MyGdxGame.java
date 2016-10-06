package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyGdxGame extends ApplicationAdapter {

    SpriteBatch batch;
    Texture textureRun[] = new Texture[14];
    Texture textureStand[] = new Texture[6];
    Texture textureJump[] = new Texture[4];
    TextureRegion texRegion;
    Vector2 v1;
    Sprite spr1;
    int nTimer = 0, nAnim1 = 0, nAnim2 = 0, nAnim3 = 0;
    int nDir = 1;
    int nCounter1 = 0, nCounter2 = 0;
    Timer time;
    boolean bLR;

    @Override
    public void create() {
        for (int i = 0; i < 14; i++) {
            textureRun[i] = new Texture(Gdx.files.absolute("D:/Chester/core/assets/run/" + i + ".png"));

        }
        for (int i = 0; i < 4; i++) {
        }
        batch = new SpriteBatch();
        v1 = new Vector2(200, 200);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(100, 100, 100, 20);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        nCounter1++;
        if (nCounter1 == 5) {
            nCounter2++;
            nCounter1 = 0;
        }
        if (nCounter2 == 6) {
            nCounter2 = 0;
        }
        texRegion = new TextureRegion(textureRun[nCounter2]);
        texRegion.flip(bLR, false);
//        spr1.setRegion(texRegion);
        nDir = whichAnim();
        batch.draw(texRegion, v1.x, v1.y);
        v1.x+=3;
        batch.end();
    }

    public int whichAnim() {
        if (Gdx.input.isKeyPressed(Keys.DPAD_LEFT)) {
            bLR = true;
            return 0;
        } else if (Gdx.input.isKeyPressed(Keys.DPAD_RIGHT)) {
            bLR = false;
            return 1;
        } else if (Gdx.input.isKeyPressed(Keys.DPAD_UP)) {
            return 3;
        } else {
            return 2;
        }


    }
}