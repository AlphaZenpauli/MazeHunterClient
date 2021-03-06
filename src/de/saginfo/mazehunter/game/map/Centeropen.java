/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.saginfo.mazehunter.game.map;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import de.saginfo.mazehunter.game.GameScreen;
import static de.saginfo.mazehunter.game.GameScreen.GAMESCREEN_SINGLETON;
import de.saginfo.mazehunter.grafik.SpriteVisual;

/**
 *
 * @author paul.kuschfeldt
 */
public class Centeropen extends Tile {

    private static final Texture TEX = new Texture(Gdx.files.local("assets\\img\\map\\white.png"));

    public static int width;
    public static int height;


    private SpriteVisual visual;
    
    public Centeropen(int xBlock, int yBlock, int xTile, int yTile) {
        open = true;
        blockPositionX = xBlock;
        blockPositionY = yBlock;
        tilePositionX = GAMESCREEN_SINGLETON.game.world.translateTileToCoordinate(xTile);
        tilePositionY = GAMESCREEN_SINGLETON.game.world.translateTileToCoordinate(yTile);
        
        visual = new SpriteVisual(new Sprite(TEX));
        GameScreen.GAMESCREEN_SINGLETON.renderSystem.addSprite(visual);
        visual.setPosition(tilePositionX+ blockPositionX, tilePositionY+blockPositionY);
    }
}
