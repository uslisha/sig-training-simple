package eu.sig.training.ch03;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {
	
	private static final Map<Nationality, FlagInterface> FLAGS = 
			new HashMap<Nationality, FlagInterface>();
	
	
	static {
		FLAGS.put(FlagConstant.Constant.DUTCH, new DutchFlag());
		FLAGS.put(FlagConstant.Constant.GERMAN, new GermanFlag());
		FLAGS.put(FlagConstant.Constant.BELGIAN, new BelgianFlag());
		FLAGS.put(FlagConstant.Constant.FRENCH, new FrenchFlag());
		FLAGS.put(FlagConstant.Constant.ITALIAN, new ItalianFlag());
		FLAGS.put(FlagConstant.Constant.ROMANIA, new RomaniaFlag());
		FLAGS.put(FlagConstant.Constant.IRELAND, new IrelandFlag());
		FLAGS.put(FlagConstant.Constant.HUNGARIAN, new HungarianFlag());
		FLAGS.put(FlagConstant.Constant.BULGARIAN, new BulgarianFlag());
		FLAGS.put(FlagConstant.Constant.RUSSIA, new RussiaFlag());
		FLAGS.put(FlagConstant.Constant.UNCLASSIFIED, new Unclassified());
	}
 
       public List<Color> getFlagColors(Nationality nationality){
       
    	   FlagInterface flag = FLAGS.get(nationality);
    	   flag = flag != null ? flag : new Unclassified();
    	   return flag.getColors();
       }
       
    }