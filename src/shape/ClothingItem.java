package shape;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class ClothingItem extends Picture{

	public ClothingItem(URL url, HashMap<String, Boolean> colors, HashMap<String, Boolean> sizes, double price, String sex) throws IOException {
		super(url);
	}

}
