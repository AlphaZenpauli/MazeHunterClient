/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.saginfo.mazehunter.client.networkData;

import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author karl.huber
 */
public class MovementResponse {
        
    public Vector2 position;
    public Vector2 velocity;
    public int id;

    public MovementResponse(Vector2 position, Vector2 velocity, int id) {
        this.position = position;
        this.velocity = velocity;
        this.id = id;
    }

    public MovementResponse() {
    }
}
