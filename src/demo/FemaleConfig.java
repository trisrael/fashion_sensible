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

		shapes = new Shape[28];
			try {
				/**
				 * Female Shirts
				 */
				
				//#1 Blue white Shirt
				HashSet<String> f1colors = new HashSet<String>();
				f1colors.add("dark blue");
				f1colors.add("white");
				
				HashSet<String> f1sizes = new HashSet<String>();
				f1sizes.add("S" );
				f1sizes.add("M" );
				f1sizes.add("L" );
				f1sizes.add("XL" );
				
				shapes[0] = new ClothingItem(getClass().getResource(
				"female_images/female_blue_white.jpg"), f1colors, f1sizes, 79.90, "F" );
				
				
				//#2 Classy blue
				HashSet<String> f2colors = new HashSet<String>();
				f2colors.add("blue" );
				
				HashSet<String> f2sizes = new HashSet<String>();
				f2sizes.add("S" );
				f2sizes.add("M" );
				
				shapes[1] = new ClothingItem(getClass().getResource(
				"female_images/female_classy_blue.jpg"), f2colors, f2sizes, 59.90, "F");
				
				//#3 Classy grey
				HashSet<String> f3colors = new HashSet<String>();
				f3colors.add("white" );
				f3colors.add("grey" );
				
				HashSet<String> f3sizes = new HashSet<String>();
				f3sizes.add("S" );
				f3sizes.add("L" );
				f3sizes.add("XS" );
				
				shapes[2] = new ClothingItem(getClass().getResource(
				"female_images/female_classy_grey.jpg"), f3colors, f3sizes, 89.90, "F");
				
				//#4 Satin Pink
				HashSet<String> f4colors = new HashSet<String>();
				f4colors.add("pink" );
				
				HashSet<String> f4sizes = new HashSet<String>();
				f4sizes.add("S" );
				f4sizes.add("L" );
				f4sizes.add("XS" );
				
				shapes[3] = new ClothingItem(getClass().getResource(
				"female_images/female_satin_pink.jpg"), f4colors, f4sizes, 59.90, "F");
				
				//#5  Striped
				HashSet<String> f5colors = new HashSet<String>();
				f5colors.add("white" );
				f5colors.add("black" );
				
				HashSet<String> f5sizes = new HashSet<String>();
				f5sizes.add("S" );
				f5sizes.add("M" );
				f5sizes.add("L" );
				
				shapes[4] = new ClothingItem(getClass().getResource(
				"female_images/female_striped.jpg"), f5colors, f5sizes, 59.90, "F");
				
				//#6 Formal Black
				HashSet<String> f6colors = new HashSet<String>();
				f6colors.add("black" );
				
				HashSet<String> f6sizes = new HashSet<String>();
				f6sizes.add("M" );
				f6sizes.add("L" );
				f6sizes.add("XS" );
				
				shapes[5] = new ClothingItem(getClass().getResource(
				"female_images/female_classy_black.jpg"), f6colors, f6sizes, 79.90, "F");
				
				//#7 Simple grey and blue
				
				HashSet<String> f7colors = new HashSet<String>();
				f7colors.add("grey" );
				f7colors.add("blue" );
				
				HashSet<String> f7sizes = new HashSet<String>();
				f7sizes.add("S" );
				f7sizes.add("M" );
				f7sizes.add("XS" );
				
				shapes[6] = new ClothingItem(getClass().getResource(
				"female_images/female_simple_offwhite_blue.jpg"), f7colors, f7sizes, 44.90, "F");
				
				//#8 Medieval
				HashSet<String> f8colors = new HashSet<String>();
				f8colors.add("black" );
				f8colors.add("purple" );
				f8colors.add("green" );
				
				HashSet<String> f8sizes = new HashSet<String>();
				f8sizes.add("S" );
				f8sizes.add("M" );
				
				shapes[7] = new ClothingItem(getClass().getResource(
				"female_images/female_medieval.jpg"), f8colors, f8sizes, 99.90, "F");
				
				//#9 Farmer
				HashSet<String> f9colors = new HashSet<String>();
				f9colors.add("orange" );
				f9colors.add("pink" );
				f9colors.add("white" );
				
				HashSet<String> f9sizes = new HashSet<String>();
				f9sizes.add("M" );
				f9sizes.add("L" );
				
				shapes[8] = new ClothingItem(getClass().getResource(
				"female_images/female_farmer.jpg"), f9colors, f9sizes, 59.90, "F");
				
				//#10 Blue flowers 
				
				HashSet<String> f10colors = new HashSet<String>();
				f10colors.add("blue" );
				f10colors.add("black" );
				f10colors.add("white" );
				
				HashSet<String> f10sizes = new HashSet<String>();
				f10sizes.add("S" );
				f10sizes.add("L" );

				
				shapes[9] = new ClothingItem(getClass().getResource(
				"female_images/female_blue_flowers.jpg"), f10colors, f10sizes, 45, "F");
				
				//#11 Casual Black
				
				HashSet<String> f11colors = new HashSet<String>();
				f11colors.add("black" );
				
				HashSet<String> f11sizes = new HashSet<String>();
				f11sizes.add("S" );
				f11sizes.add("M" );

				
				shapes[10] = new ClothingItem(getClass().getResource(
				"female_images/female_casual_black.jpg"), f11colors, f11sizes, 129.90, "F");
				
				//#12 School Girl 
				
				HashSet<String> f12colors = new HashSet<String>();
				f12colors.add("white" );
				f12colors.add("grey" );
				
				HashSet<String> f12sizes = new HashSet<String>();
				f12sizes.add("S" );
				f12sizes.add("M" );
				f12sizes.add("XS" );
			
				
				shapes[11] = new ClothingItem(getClass().getResource(
				"female_images/female_school_girl.jpg"), f12colors, f12sizes, 109.90, "F");
				

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
				"female_images/female_pink_brown.jpg"), f13colors, f13sizes, 49.90, "F");
				
				//#14 Girl next door blue

				HashSet<String> f14colors = new HashSet<String>();
				f14colors.add("light blue" );
				f14colors.add("red" );
				
				HashSet<String> f14sizes = new HashSet<String>();
				f14sizes.add("S" );
				f14sizes.add("L" );;
				f14sizes.add("XL" );
				
				shapes[13] = new ClothingItem(getClass().getResource(
				"female_images/female_light_blue_red_string.jpg"), f14colors, f14sizes, 44.90, "F");
				
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
				shapes[14] = new ClothingItem(getClass().getResource("female_images/female_aztec.png"), f15colors, f15sizes, 59.90, "F");
			
				//#16 Peasant
				HashSet<String> f16colors = new HashSet<String>();
				f16colors.add("purple" );
				f16colors.add("pink" );
				f16colors.add("grey" );
				
				HashSet<String> f16sizes = new HashSet<String>();
				f16sizes.add("S" );
				f16sizes.add("M");
				f16sizes.add("L");
				shapes[15] = new ClothingItem(getClass().getResource("female_images/female_peasant.jpg"), f16colors, f16sizes, 109.90, "F");
				
				//#17 Grey Floppy
				HashSet<String> f17colors = new HashSet<String>();
				f17colors.add("grey");
				HashSet<String> f17sizes = new HashSet<String>();
				f17sizes.add("S");
				f17sizes.add("M");
				f17sizes.add("XS");
				shapes[16] = new ClothingItem(getClass().getResource("female_images/female_grey_floopy.jpg"), f17colors, f17sizes, 89.90, "F");
				
				//#18 Multicolored
				HashSet<String> f18colors = new HashSet<String>();
				f18colors.add("purple");
				f18colors.add("yellow");
				f18colors.add("green");
				HashSet<String> f18sizes = new HashSet<String>();
				f18sizes.add("S");
				f18sizes.add("M");
				f18sizes.add("XS");
				shapes[17] = new ClothingItem(getClass().getResource("female_images/female_multicolored.jpg"), f18colors, f18sizes, 81.90, "F");
				
				//#19 Sexy Offwhite
				HashSet<String> f19colors = new HashSet<String>();
				f19colors.add("grey");
				f19colors.add("white");
				HashSet<String> f19sizes = new HashSet<String>();
				f19sizes.add("S");
				f19sizes.add("L");
				f19sizes.add("XS");
				shapes[18] = new ClothingItem(getClass().getResource("female_images/female_sexy_offwhite.jpg"), f19colors, f19sizes, 95, "F");
				
				//#20 Leggings Black
				HashSet<String> f20colors = new HashSet<String>();
				f20colors.add("black");
				HashSet<String> f20sizes = new HashSet<String>();
				f20sizes.add("M");
				f20sizes.add("S");
				f20sizes.add("XS");
				shapes[19] = new ClothingItem(getClass().getResource("female_images/female_leggings_black.jpg"), f20colors, f20sizes, 120, "F");
				
				//#21 Swanky Blue
				HashSet<String> f21colors = new HashSet<String>();
				f21colors.add("dark blue");
				HashSet<String> f21sizes = new HashSet<String>();
				f21sizes.add("M");
				f21sizes.add("S");
				shapes[20] = new ClothingItem(getClass().getResource("female_images/female_swanky_blue.jpg"), f21colors, f21sizes, 77.44, "F");
				
				//#22 Flowered red and blue  
				HashSet<String> f22colors = new HashSet<String>();
				f22colors.add("red");
				f22colors.add("pink");
				f22colors.add("dark blue");
				HashSet<String> f22sizes = new HashSet<String>();
				f22sizes.add("L");
				f22sizes.add("S");
				f22sizes.add("XS");
				shapes[21] = new ClothingItem(getClass().getResource("female_images/female_flowered_red_blue.jpg"), f22colors, f22sizes, 88.90 , "F");
				
				//#23 China Blue
				
				HashSet<String> f23colors = new HashSet<String>();
				f23colors.add("dark blue");
				f23colors.add("grey");
				f23colors.add("brown");
				HashSet<String> f23sizes = new HashSet<String>();
				f23sizes.add("M");
				f23sizes.add("XL");
				f23sizes.add("XS");
				shapes[22] = new ClothingItem(getClass().getResource("female_images/female_china_blue.jpg"), f23colors, f23sizes, 65.90, "F");
				
				//#24 Simple White
				HashSet<String> f24colors = new HashSet<String>();
				f24colors.add("white");
				HashSet<String> f24sizes = new HashSet<String>();
				f24sizes.add("M");
				f24sizes.add("S");
				f24sizes.add("XS");
				f24sizes.add("L");
				shapes[23] = new ClothingItem(getClass().getResource("female_images/female_simple_white.jpg"), f24colors, f24sizes, 53 , "F");
				
				//#25 Tube Brown
				HashSet<String> f25colors = new HashSet<String>();
				f25colors.add("brown");
				f25colors.add("pink");
				HashSet<String> f25sizes = new HashSet<String>();
				f25sizes.add("M");
				f25sizes.add("S");
				f25sizes.add("L");
				shapes[24] = new ClothingItem(getClass().getResource("female_images/female_tube_brown.jpg"), f25colors, f25sizes, 65 , "F");
				
				
				//#26 Muffin
				HashSet<String> f26colors = new HashSet<String>();
				f26colors.add("pink");
				f26colors.add("white");
				HashSet<String> f26sizes = new HashSet<String>();
				f26sizes.add("L");
				f26sizes.add("S");
				f26sizes.add("XS");
				shapes[25] = new ClothingItem(getClass().getResource("female_images/female_muffin.jpg"), f26colors, f26sizes, 69 , "F");
				
				//#27 MultiFlowered Pink Yellow
				HashSet<String> f27colors = new HashSet<String>();
				f27colors.add("green");
				f27colors.add("yellow");
				f27colors.add("pink");
				HashSet<String> f27sizes = new HashSet<String>();
				f27sizes.add("S");
				f27sizes.add("M");
				f27sizes.add("XS");
				f27sizes.add("XL");
				shapes[26] = new ClothingItem(getClass().getResource("female_images/female_flowered_pink.jpg"), f27colors, f27sizes, 69, "F");
				
				//#28 Roses
				HashSet<String> f28colors = new HashSet<String>();
				f28colors.add("pink");
				f28colors.add("white");
				HashSet<String> f28sizes = new HashSet<String>();
				f28sizes.add("S");
				f28sizes.add("L");
				shapes[27] = new ClothingItem(getClass().getResource("female_images/female_roses.jpg"), f28colors, f28sizes, 42, "F");				
			} catch (IOException e) {
		
		}
	}
}
