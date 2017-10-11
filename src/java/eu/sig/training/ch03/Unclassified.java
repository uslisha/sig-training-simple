package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class Unclassified implements FlagInterface{
	
	public List<Color> getColors(){
		return Arrays.asList(Color.GRAY);
	}

}
