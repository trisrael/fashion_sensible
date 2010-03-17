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
import java.util.HashSet;

import main.jflow.Shape;

import shape.ClothingItem;
import shape.Picture;

public class FemaleConfig extends main.jflow.Configuration {
	public FemaleConfig() {

		shapes = new Shape[16];
			try {
				/**
				 * Female Shirts
				 */
				
				//#1 Blue white Shirt
				HashSet<String> f1colors = new HashSet<String>();
				f1colors.add("blue");
				f1colors.add("white");
				
				HashSet<String> f1sizes = new HashSet<String>();
				f1sizes.add("S" );
				f1sizes.add("M" );
				f1sizes.add("L" );
				f1sizes.add("XL" );
				
				shapes[0] = new ClothingItem(getClass().getResource(
				"images/female_blue_white.jpg"), f1colors, f1sizes, 79.90, "F" );
				
				
				//#2 Classy blue
				HashSet<String> f2colors = new HashSet<String>();
				f2colors.add("blue" );
				
				HashSet<String> f2sizes = new HashSet<String>();
				f2sizes.add("S" );
				f2sizes.add("M" );
				
				shapes[1] = new ClothingItem(getClass().getResource(
				"images/female_classy_blue.jpg"), f2colors, f2sizes, 59.90, "F");
				
				//#3 Classy grey
				HashSet<String> f3colors = new HashSet<String>();
				f3colors.add("white" );
				f3colors.add("grey" );
				
				HashSet<String> f3sizes = new HashSet<String>();
				f3sizes.add("S" );
				f3sizes.add("L" );
				f3sizes.add("XS" );
				
				shapes[2] = new ClothingItem(getClass().getResource(
				"images/female_classy_grey.jpg"), f3colors, f3sizes, 89.90, "F");
				
				//#4 Satin Pink
				HashSet<String> f4colors = new HashSet<String>();
				f4colors.add("pink" );
				
				HashSet<String> f4sizes = new HashSet<String>();
				f4sizes.add("S" );
				f4sizes.add("L" );
				f4sizes.add("XS" );
				
				shapes[3] = new ClothingItem(getClass().getResource(
				"images/female_satin_pink.jpg"), f4colors, f4sizes, 59.90, "F");
				
				//#5  Striped
				HashSet<String> f5colors = new HashSet<String>();
				f5colors.add("white" );
				f5colors.add("black" );
				
				HashSet<String> f5sizes = new HashSet<String>();
				f5sizes.add("S" );
				f5sizes.add("M" );
				f5sizes.add("L" );
				
				shapes[4] = new ClothingItem(getClass().getResource(
				"images/female_striped.jpg"), f5colors, f5sizes, 59.90, "F");
				
				//#6 Formal Black
				HashSet<String> f6colors = new HashSet<String>();
				f6colors.add("black" );
				
				HashSet<String> f6sizes = new HashSet<String>();
				f6sizes.add("M" );
				f6sizes.add("L" );
				f6sizes.add("XS" );
				
				shapes[5] = new ClothingItem(getClass().getResource(
				"images/female_classy_black.jpg"), f6colors, f6sizes, 79.90, "F");
				
				//#7 Simple grey and blue
				
				HashSet<String> f7colors = new HashSet<String>();
				f7colors.add("grey" );
				f7colors.add("blue" );
				
				HashSet<String> f7sizes = new HashSet<String>();
				f7sizes.add("S" );
				f7sizes.add("M" );
				f7sizes.add("XS" );
				
				shapes[6] = new ClothingItem(getClass().getResource(
				"images/female_simple_offwhite_blue.jpg"), f7colors, f7sizes, 44.90, "F");
				
				//#8 Medieval
				HashSet<String> f8colors = new HashSet<String>();
				f8colors.add("black" );
				f8colors.add("purple" );
				f8colors.add("green" );
				
				HashSet<String> f8sizes = new HashSet<String>();
				f8sizes.add("S" );
				f8sizes.add("M" );
				
				shapes[7] = new ClothingItem(getClass().getResource(
				"images/female_medieval.jpg"), f8colors, f8sizes, 99.90, "F");
				
				//#9 Farmer
				HashSet<String> f9colors = new HashSet<String>();
				f9colors.add("orange" );
				f9colors.add("pink" );
				f9colors.add("white" );
				
				HashSet<String> f9sizes = new HashSet<String>();
				f9sizes.add("M" );
				f9sizes.add("L" );
				
				shapes[8] = new ClothingItem(getClass().getResource(
				"images/female_farmer.jpg"), f9colors, f9sizes, 59.90, "F");
				
				//#10 Blue flowers 
				
				HashSet<String> f10colors = new HashSet<String>();
				f10colors.add("blue" );
				f10colors.add("black" );
				f10colors.add("white" );
				
				HashSet<String> f10sizes = new HashSet<String>();
				f10sizes.add("S" );
				f10sizes.add("L" );

				
				shapes[9] = new ClothingItem(getClass().getResource(
				"images/female_blue_flowers.jpg"), f10colors, f10sizes, 59.90, "F");
				
				//#11 Casual Black
				
				HashSet<String> f11colors = new HashSet<String>();
				f11colors.add("black" );
				
				HashSet<String> f11sizes = new HashSet<String>();
				f11sizes.add("S" );
				f11sizes.add("M" );

				
				shapes[10] = new ClothingItem(getClass().getResource(
				"images/female_casual_black.jpg"), f11colors, f11sizes, 129.90, "F");
				
				//#12 School Girl 
				
				HashSet<String> f12colors = new HashSet<String>();
				f12colors.add("white" );
				f12colors.add("grey" );
				
				HashSet<String> f12sizes = new HashSet<String>();
				f12sizes.add("S" );
				f12sizes.add("M" );
				f12sizes.add("XS" );
			
				
				shapes[11] = new ClothingItem(getClass().getResource(
				"images/female_school_girl.jpg"), f12colors, f12sizes, 109.90, "F");
				

				//#13 Art piece
				
				HashSet<String> f13colors = new HashSet<String>();
				f13colors.add("pink" );
				f13colors.add("brown" );
				f13colors.add("green" );
				
				HashSet<String> f13sizes = new HashSet<String>();
				f13sizes.add("S");
				f13sizes.add("M");
				f13sizes.add("L" );
				f13sizes.add("XS" );
				f13sizes.add("XL" );
				
				shapes[12] = new ClothingItem(getClass().getResource(
				"images/female_pink_brown.jpg"), f13colors, f13sizes, 49.90, "F");
				
				//#14 Girl next door blue

				HashSet<String> f14colors = new HashSet<String>();
				f14colors.add("light blue" );
				f14colors.add("red" );
				
				HashSet<String> f14sizes = new HashSet<String>();
				f14sizes.add("S" );
				f14sizes.add("L" );;
				f14sizes.add("XL" );
				
				shapes[13] = new ClothingItem(getClass().getResource(
				"images/female_light_blue_red_string.jpg"), f14colors, f14sizes, 44.90, "F");
				
				//#15 Aztec
				
				HashSet<String> f15colors = new HashSet<String>();
				f15colors.add("green" );
				f15colors.add("orange" );
				f15colors.add("white" );
				f15colors.add("sand" );
				
				HashSet<String> f15sizes = new HashSet<String>();
				f15sizes.add("M" );
				f15sizes.add("L" );
				f15sizes.add("XL" );
				shapes[14] = new ClothingItem(getClass().getResource("images/female_aztec.png"), f15colors, f15sizes, 59.90, "F");
			
				//#16 Peasant
				HashSet<String> f16colors = new HashSet<String>();
				f16colors.add("purple" );
				f16colors.add("pink" );
				f16colors.add("grey" );
				
				HashSet<String> f16sizes = new HashSet<String>();
				f16sizes.add("S" );
				f16sizes.add("M");
				f16sizes.add("L");
				shapes[15] = new ClothingItem(getClass().getResource("images/female_peasant.jpg"), f16colors, f16sizes, 109.90, "F");
				
			} catch (IOException e) {
		
		}
	}
}
