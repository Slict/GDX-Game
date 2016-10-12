///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mygdx.game;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.Input;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.TextureRegion;
//
///**
// *
// * @author chesj2479
// */
//public class Run {
//
//    Texture textureRun[] = new Texture[14];
//    Texture textureStand[] = new Texture[4];
//    TextureRegion texRegion;
//    boolean bLR = false;
//
//    public void texturerun() {
//        for (int i = 0; i < 14; i++) {
//            textureRun[i] = new Texture(Gdx.files.absolute("D:/Chester/core/assets/run/" + i + ".png"));
//        }
//        for (int i = 0; i < 4; i++) {
//            textureStand[i] = new Texture(Gdx.files.absolute("D:/Chester/core/assets/standing/" + i + ".png"));
//        }
//    }
//
//    public void drawrun() {
//        int nDir = 1;
//        int nRunBuffer = 0, nRunIndex = 0;
//        int nStandBuffer = 0, nStandIndex = 0;
//        if (Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT)) {
//            v1.x -=3;
//            texRegion = new TextureRegion(textureStand[nStandIndex]);
//        if (Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT)) {
//            v1.x+=3;
//        }
//            texRegion = new TextureRegion(textureRun[nRunIndex]);
//        } else if (nDir == 2) {
//            texRegion = new TextureRegion(textureRun[nRunIndex]);
//        }
//    }
//
//    public int whichAnim() {
//        if (Gdx.input.isKeyPressed(Input.Keys.DPAD_LEFT)) {
//            bLR = true;
//            v1.x -= 3;
//            return 1;
//        }
//        if (Gdx.input.isKeyPressed(Input.Keys.DPAD_RIGHT)) {
//            bLR = false;
//            v1.x += 3;
//            return 2;
//        } else {
//            return 0;
//
//        }
//    }
//}
