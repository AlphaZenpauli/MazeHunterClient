/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.saginfo.mazehunter.game.map;

/**
 *
 * @author paul.kuschfeldt
 */
public class PathUp extends Tile{

    public PathUp (boolean b) {
        width = 3;
        length = 2;
        open = b;
    }    
}
