package shape;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class ClothingItem extends Picture{
	
	public double price;
	protected HashMap<String, Boolean> colors;
	protected HashMap<String, Boolean> sizes;
	

	public ClothingItem(URL url, HashMap<String, Boolean> colors, HashMap<String, Boolean> sizes, double price, String sex) throws IOException {
		super(url);
		this.colors = colors;
		this.sizes = sizes;
		this.price = price;
	}

}
