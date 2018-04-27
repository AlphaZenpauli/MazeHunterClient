/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.saginfo.mazehunter.game.player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;
import de.saginfo.mazehunter.client.networkData.MovementRequest;
import de.saginfo.mazehunter.game.GameScreen;

/**
 *
 * @author karl.huber
 */
public class MovementInput extends InputAdapter {

    private Vector2 requestVector = new Vector2(0, 0);

    public void update(float delta) {
        if (Gdx.input.isKeyJustPressed(Keys.W)) {
            requestVector.y = 1;
            sendMovementRequest(requestVector, true);
        }
        if (Gdx.input.isKeyJustPressed(Keys.S)) {
            requestVector.y = -1;
            sendMovementRequest(requestVector, true);
        }
        if (Gdx.input.isKeyJustPressed(Keys.D)) {
            requestVector.x = 1;
            sendMovementRequest(requestVector, true);
        }
        if (Gdx.input.isKeyJustPressed(Keys.A)) {
            requestVector.x = -1;
            sendMovementRequest(requestVector, true);
        }
        if (!Gdx.input.isKeyPressed(Keys.W)) {
            if (requestVector.y == 1) {
                requestVector.y = 0;
                sendMovementRequest(requestVector, true);
            }
        }
        if (!Gdx.input.isKeyPressed(Keys.S)) {
            if (requestVector.y == -1) {
                requestVector.y = 0;
                sendMovementRequest(requestVector, true);
            }
        }
        if (!Gdx.input.isKeyPressed(Keys.D)) {
            if (requestVector.y != 1) {
                requestVector.y = 0;
                sendMovementRequest(requestVector, true);
            }
        }
        if (!Gdx.input.isKeyPressed(Keys.A)) {
            if (requestVector.y != -1) {
                requestVector.y = 0;
                sendMovementRequest(requestVector, true);
            }
        }
        if (requestVector.isZero()) {
            sendMovementRequest(null, false);
        }
    }
    
    public void sendMovementRequest(Vector2 requestedVector, boolean movement) {
        MovementRequest movementRequest = new MovementRequest((int)requestedVector.angle(), movement);
    }
    //TODO send
    public MovementInput() {
        GameScreen.GAMESCREEN_SINGLETON.inputMultiplexer.addProcessor(this);
    }
}

