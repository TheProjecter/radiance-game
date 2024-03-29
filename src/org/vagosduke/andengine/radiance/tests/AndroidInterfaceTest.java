/*
 *  RADIANCE - An Android 2D turn-based tactics-rpg game.
 *  
 *  Copyright (C) 2011  VagosDuke (vagosduke@gmail.com)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * @author VagosDuke
 */

package org.vagosduke.andengine.radiance.tests;
import java.util.Map;

import org.vagosduke.andengine.radiance.game.GameState;
import org.vagosduke.andengine.radiance.game.character.PlayerCharacter;
import org.vagosduke.andengine.radiance.game.items.GlobalItemList;
import org.vagosduke.andengine.radiance.program.Init;
import org.vagosduke.andengine.radiance.program.log.ProgLog;

import android.app.Activity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class AndroidInterfaceTest extends Activity {
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView tv = new TextView(this);
		StringBuilder strb = new StringBuilder();
		
		
		//GameState.init(this);
		Init.init_All(this);
		
		
		for (Map.Entry<Object, Object> e : System.getProperties().entrySet()) {
			strb.append(e);
			ProgLog.message("DEBUUG", e.toString());
        }
		
		
		
		
		tv.setText(GameState.getEnvironmentOS().toString());
		setContentView(tv);
		

		
		//PlayerCharacter player1 = PlayerCharacter.make_empty_PlayerCharacter();

	}
	
	
	
}