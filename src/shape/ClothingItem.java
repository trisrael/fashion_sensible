package shape;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;

public class ClothingItem extends Picture{
	
	public double price;
	public HashSet<String> colors;
	public HashSet<String> sizes;
	

	public ClothingItem(URL url, HashSet<String> colors, HashSet<String> sizes, double price, String sex) throws IOException {
		super(url);
		this.colors = colors;
		this.sizes = sizes;
		this.price = price;
	}

}
