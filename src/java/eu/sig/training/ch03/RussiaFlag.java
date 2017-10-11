package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class RussiaFlag implements FlagInterface{
	
	public List<Color> getColors(){
		return Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);
	}

}
