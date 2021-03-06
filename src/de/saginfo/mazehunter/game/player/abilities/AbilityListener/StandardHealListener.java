/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.saginfo.mazehunter.game.player.abilities.AbilityListener;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import de.saginfo.mazehunter.client.networkData.abilities.StandardHealResponse;
import de.saginfo.mazehunter.game.GameScreen;
import de.saginfo.mazehunter.game.player.Status;

/**
 *
 * @author Karl Huber
 */
public class StandardHealListener extends Listener{
    
    //TODO Animation
    
    @Override
    public void received(Connection connection, Object object) {
        
        if(object instanceof StandardHealResponse){
            Status.root(GameScreen.GAMESCREEN_SINGLETON.config.STANDARDHEAL_DURATION);
            //actual heal happens on the server and gets send as a heal update.
        }
    }

    public StandardHealListener() {
        GameScreen.GAMESCREEN_SINGLETON.client.addListener(this);
    }
}
