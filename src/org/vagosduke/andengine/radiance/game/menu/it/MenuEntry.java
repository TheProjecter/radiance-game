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

package org.vagosduke.andengine.radiance.game.menu.it;

public abstract class MenuEntry {
	protected Boolean enabled;
	protected String name;
	
	public MenuEntry() {
		enabled = false;
		name = "N/A";
	}
	public MenuEntry(String iname) {
		enabled = true;
		name = iname;
	}
	
	////////////////////
	//	Getters
	////////////////////
	public Boolean enabled() { return enabled; }
	public String name() { return name; }
	
	////////////////////
	//	Setters
	////////////////////
	public void setName(String iname) { name = iname; }


	
	public abstract void activate();



}