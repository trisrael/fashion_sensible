/*
 * JFlow v0.2
 * Created by Tim De Pauw <http://pwnt.be/>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package demo;

import java.io.IOException;
import java.util.HashMap;

import main.jflow.Shape;

import shape.ClothingItem;
import shape.Picture;

public class Configuration extends main.jflow.Configuration {
	public Configuration() {

		shapes = new Shape[16];
			try {
				/**
				 * Female Shirts
				 */
				
				//#1 Blue white Shirt
				HashMap<String, Boolean> f1colors = new HashMap<String, Boolean>();
				f1colors.put("blue", true);
				f1colors.put("white", true);
				
				HashMap<String, Boolean> f1sizes = new HashMap<String, Boolean>();
				f1sizes.put("S", true);
				f1sizes.put("M", true);
				f1sizes.put("L", true);
				f1sizes.put("XS", true);
				f1sizes.put("XL", true);
				
				shapes[0] = new ClothingItem(getClass().getResource(
				"images/female_blue_white.jpg"), f1colors, f1sizes, 79.90, "F" );
				
				
				//#2 Classy blue
				HashMap<String, Boolean> f2colors = new HashMap<String, Boolean>();
				f2colors.put("blue", true);
				
				HashMap<String, Boolean> f2sizes = new HashMap<String, Boolean>();
				f2sizes.put("S", true);
				f2sizes.put("M", false);
				f2sizes.put("L", false);
				f2sizes.put("XS", true);
				f2sizes.put("XL", false);
				
				shapes[1] = new ClothingItem(getClass().getResource(
				"images/female_classy_blue.jpg"), f2colors, f2sizes, 59.90, "F");
				
				//#3 Classy grey
				HashMap<String, Boolean> f3colors = new HashMap<String, Boolean>();
				f3colors.put("white", true);
				f3colors.put("grey", true);
				
				HashMap<String, Boolean> f3sizes = new HashMap<String, Boolean>();
				f3sizes.put("S", true);
				f3sizes.put("M", true);
				f3sizes.put("L", false);
				f3sizes.put("XS", false);
				f3sizes.put("XL", false);
				
				shapes[2] = new ClothingItem(getClass().getResource(
				"images/female_classy_grey.jpg"), f3colors, f3sizes, 89.90, "F");
				
				//#4 Satin Pink
				HashMap<String, Boolean> f4colors = new HashMap<String, Boolean>();
				f4colors.put("pink", true);
				
				HashMap<String, Boolean> f4sizes = new HashMap<String, Boolean>();
				f4sizes.put("S", true);
				f4sizes.put("M", true);
				f4sizes.put("L", true);
				f4sizes.put("XS", false);
				f4sizes.put("XL", false);
				
				shapes[3] = new ClothingItem(getClass().getResource(
				"images/female_satin_pink.jpg"), f4colors, f4sizes, 59.90, "F");
				
				//#5  Striped
				HashMap<String, Boolean> f5colors = new HashMap<String, Boolean>();
				f5colors.put("white", true);
				f5colors.put("black", true);
				
				HashMap<String, Boolean> f5sizes = new HashMap<String, Boolean>();
				f5sizes.put("S", true);
				f5sizes.put("M", true);
				f5sizes.put("L", true);
				f5sizes.put("XS", true);
				f5sizes.put("XL", false);
				
				shapes[4] = new ClothingItem(getClass().getResource(
				"images/female_striped.jpg"), f5colors, f5sizes, 59.90, "F");
				
				//#6 Formal Black
				HashMap<String, Boolean> f6colors = new HashMap<String, Boolean>();
				f6colors.put("black", true);
				
				HashMap<String, Boolean> f6sizes = new HashMap<String, Boolean>();
				f6sizes.put("S", true);
				f6sizes.put("M", true);
				f6sizes.put("L", true);
				f6sizes.put("XS", true);
				f6sizes.put("XL", false);
				
				shapes[5] = new ClothingItem(getClass().getResource(
				"images/female_classy_black.jpg"), f6colors, f6sizes, 79.90, "F");
				
				//#7 Simple grey and blue
				
				HashMap<String, Boolean> f7colors = new HashMap<String, Boolean>();
				f7colors.put("grey", true);
				f7colors.put("blue", true);
				
				HashMap<String, Boolean> f7sizes = new HashMap<String, Boolean>();
				f7sizes.put("S", true);
				f7sizes.put("M", false);
				f7sizes.put("L", true);
				f7sizes.put("XS", true);
				f7sizes.put("XL", true);
				
				shapes[6] = new ClothingItem(getClass().getResource(
				"images/female_simple_offwhite_blue.jpg"), f7colors, f7sizes, 44.90, "F");
				
				//#8 Medieval
				HashMap<String, Boolean> f8colors = new HashMap<String, Boolean>();
				f8colors.put("black", true);
				f8colors.put("purple", true);
				f8colors.put("green", true);
				
				HashMap<String, Boolean> f8sizes = new HashMap<String, Boolean>();
				f8sizes.put("S", true);
				f8sizes.put("M", false);
				f8sizes.put("L", true);
				f8sizes.put("XS", false);
				f8sizes.put("XL", false);
				
				shapes[7] = new ClothingItem(getClass().getResource(
				"images/female_medieval.jpg"), f8colors, f8sizes, 99.90, "F");
				
				//#9 Farmer
				HashMap<String, Boolean> f9colors = new HashMap<String, Boolean>();
				f9colors.put("orange", true);
				f9colors.put("pink", true);
				f9colors.put("white", true);
				
				HashMap<String, Boolean> f9sizes = new HashMap<String, Boolean>();
				f9sizes.put("S", true);
				f9sizes.put("M", false);
				f9sizes.put("L", true);
				f9sizes.put("XS", true);
				f9sizes.put("XL", false);
				
				shapes[8] = new ClothingItem(getClass().getResource(
				"images/female_farmer.jpg"), f9colors, f9sizes, 59.90, "F");
				
				//#10 Blue flowers 
				
				HashMap<String, Boolean> f10colors = new HashMap<String, Boolean>();
				f10colors.put("blue", true);
				f10colors.put("black", true);
				f10colors.put("white", true);
				
				HashMap<String, Boolean> f10sizes = new HashMap<String, Boolean>();
				f10sizes.put("S", false);
				f10sizes.put("M", true);
				f10sizes.put("L", true);
				f10sizes.put("XS", false);
				f10sizes.put("XL", false);
				
				shapes[9] = new ClothingItem(getClass().getResource(
				"images/female_blue_flowers.jpg"), f10colors, f10sizes, 59.90, "F");
				
				//#11 Casual Black
				
				HashMap<String, Boolean> f11colors = new HashMap<String, Boolean>();
				f11colors.put("black", true);
				
				HashMap<String, Boolean> f11sizes = new HashMap<String, Boolean>();
				f11sizes.put("S", true);
				f11sizes.put("M", true);
				f11sizes.put("L", true);
				f11sizes.put("XS", true);
				f11sizes.put("XL", false);
				
				shapes[10] = new ClothingItem(getClass().getResource(
				"images/female_casual_black.jpg"), f11colors, f11sizes, 129.90, "F");
				
				//#12 School Girl 
				
				HashMap<String, Boolean> f12colors = new HashMap<String, Boolean>();
				f12colors.put("white", true);
				f12colors.put("grey", true);
				
				HashMap<String, Boolean> f12sizes = new HashMap<String, Boolean>();
				f12sizes.put("S", false);
				f12sizes.put("M", true);
				f12sizes.put("L", true);
				f12sizes.put("XS", false);
				f12sizes.put("XL", true);
				
				shapes[11] = new ClothingItem(getClass().getResource(
				"images/female_school_girl.jpg"), f12colors, f12sizes, 109.90, "F");
				

				//#13 Art piece
				
				HashMap<String, Boolean> f13colors = new HashMap<String, Boolean>();
				f13colors.put("pink", true);
				f13colors.put("brown", true);
				f13colors.put("green", true);
				
				HashMap<String, Boolean> f13sizes = new HashMap<String, Boolean>();
				f13sizes.put("S", true);
				f13sizes.put("M", true);
				f13sizes.put("L", false);
				f13sizes.put("XS", true);
				f13sizes.put("XL", false);
				
				shapes[12] = new ClothingItem(getClass().getResource(
				"images/female_pink_brown.jpg"), f13colors, f13sizes, 49.90, "F");
				
				//#14 Girl next door blue

				HashMap<String, Boolean> f14colors = new HashMap<String, Boolean>();
				f14colors.put("light blue", true);
				f14colors.put("red", true);
				
				HashMap<String, Boolean> f14sizes = new HashMap<String, Boolean>();
				f14sizes.put("S", true);
				f14sizes.put("M", true);
				f14sizes.put("L", true);
				f14sizes.put("XS", true);
				f14sizes.put("XL", true);
				
				shapes[13] = new ClothingItem(getClass().getResource(
				"images/female_light_blue_red_string.jpg"), f14colors, f14sizes, 44.90, "F");
				
				//#15 Aztec
				
				HashMap<String, Boolean> f15colors = new HashMap<String, Boolean>();
				f15colors.put("green", true);
				f15colors.put("orange", true);
				f15colors.put("white", true);
				f15colors.put("sand", true);
				
				HashMap<String, Boolean> f15sizes = new HashMap<String, Boolean>();
				f15sizes.put("S", true);
				f15sizes.put("M", true);
				f15sizes.put("L", true);
				f15sizes.put("XS", true);
				f15sizes.put("XL", true);
				
				shapes[14] = new ClothingItem(getClass().getResource(
				"images/female_aztec.jpg"), f15colors, f15sizes, 59.90, "F");
			
				//#16 Peasant
				HashMap<String, Boolean> f16colors = new HashMap<String, Boolean>();
				f16colors.put("purple", true);
				f16colors.put("pink", true);
				f16colors.put("grey", true);
				
				HashMap<String, Boolean> f16sizes = new HashMap<String, Boolean>();
				f16sizes.put("S", false);
				f16sizes.put("M", false);
				f16sizes.put("L", true);
				f16sizes.put("XS", false);
				f16sizes.put("XL", true);
				
				shapes[15] = new ClothingItem(getClass().getResource(
				"images/female_peasant.jpg"), f16colors, f16sizes, 109.90, "F");
				
				
				
				
				
				
				

				
				
			} catch (IOException e) {
		
		}
	}
}
