package demo;

import java.awt.Color;
import java.io.IOException;
import java.util.HashSet;

import shape.ClothingItem;

import main.jflow.Configuration;
import main.jflow.Shape;

public class MaleConfig extends Configuration {
	public MaleConfig(){
		super.backgroundColor = new Color(43, 43, 43);
		
		shapes = new Shape[30];
		try {
			/**
			 * Male Shirts
			 */
			
			//1 Blue white Shirt
			HashSet<String> f1colors = new HashSet<String>();
			f1colors.add("black");
			f1colors.add("white");
			
			HashSet<String> f1sizes = new HashSet<String>();
			f1sizes.add("S" );
			f1sizes.add("M" );
			f1sizes.add("L" );
			
			
			shapes[0] = new ClothingItem(getClass().getResource(
			"male_images/arms_tee.jpg"), f1colors, f1sizes, 29);
			
			
			//2 Black Long
			HashSet<String> f2colors = new HashSet<String>();
			f2colors.add("black");
			f2colors.add("white");
			f2colors.add("dark grey");
			
			HashSet<String> f2sizes = new HashSet<String>();
			f2sizes.add("S" );
			f2sizes.add("M" );
			f2sizes.add("L" );
			f2sizes.add("XL" );
			
			shapes[1] = new ClothingItem(getClass().getResource(
			"male_images/black_long.jpg"), f2colors, f2sizes, 79);
			
			//3 Brown Blazer
			HashSet<String> f3colors = new HashSet<String>();
			f3colors.add("black");
			f3colors.add("white");
			f3colors.add("dark grey");
			
			HashSet<String> f3sizes = new HashSet<String>();
			f3sizes.add("S" );
			f3sizes.add("L" );
			f3sizes.add("XL" );
			
			shapes[2] = new ClothingItem(getClass().getResource(
			"male_images/brown_blazer.jpg"), f3colors, f3sizes, 99);
			
			
			//4 Brown Zebra Sweater
			HashSet<String> f4colors = new HashSet<String>();
			f4colors.add("brown");
			
			HashSet<String> f4sizes = new HashSet<String>();
			f4sizes.add("S" );
			f4sizes.add("L" );
			f4sizes.add("M" );
			
			shapes[3] = new ClothingItem(getClass().getResource(
			"male_images/brown_zebra_sweater.jpg"), f4colors, f4sizes, 64);
			

			//5 Classic Blue Tee
			HashSet<String> f5colors = new HashSet<String>();
			f5colors.add("white");
			f5colors.add("blue");
			f5colors.add("dark blue");
			f5colors.add("light blue");
			
			HashSet<String> f5sizes = new HashSet<String>();
			f5sizes.add("S" );
			f5sizes.add("XS" );
			f5sizes.add("M" );
			
			shapes[4] = new ClothingItem(getClass().getResource(
			"male_images/classic_blue_tee.jpg"), f5colors, f5sizes, 44);
			
			//6 Classic White
			HashSet<String> f6colors = new HashSet<String>();
			f6colors.add("white");
			
			HashSet<String> f6sizes = new HashSet<String>();
			f6sizes.add("L" );
			f6sizes.add("XL" );
			f6sizes.add("M" );
			f6sizes.add("S" );
			
			shapes[5] = new ClothingItem(getClass().getResource(
			"male_images/classic_white.jpg"), f6colors, f6sizes, 39);
			
			//7 Dark Blue flannel
			HashSet<String> f7colors = new HashSet<String>();
			f7colors.add("blue");
			f7colors.add("dark blue");
		
			
			HashSet<String> f7sizers = new HashSet<String>();
			f7sizers.add("S" );
			f7sizers.add("M" );
			
			shapes[6] = new ClothingItem(getClass().getResource(
			"male_images/dark_blue_flannel.jpg"), f7colors, f7sizers, 69);
			
			//8 Elvis Red Tree
			HashSet<String> f8colors = new HashSet<String>();
			f8colors.add("white");
			f8colors.add("red");
			
			
			HashSet<String> f8sizes = new HashSet<String>();
			f8sizes.add("S" );
			f8sizes.add("L" );
			f8sizes.add("M" );
			
			shapes[7] = new ClothingItem(getClass().getResource(
			"male_images/elvis_red_tee.jpg"), f8colors, f8sizes, 29);
			
			//9 Flannel Green
			HashSet<String> f9colors = new HashSet<String>();
			f9colors.add("yellow");
			f9colors.add("green");
			
			HashSet<String> f9s = new HashSet<String>();
			f9s.add("S" );
			f9s.add("XL" );
			f9s.add("M" );
			
			shapes[8] = new ClothingItem(getClass().getResource(
			"male_images/flannel_green.jpg"), f9colors, f9s, 54);
			
			//10 Flannel Long Blue
			HashSet<String> f10c = new HashSet<String>();
			f10c.add("white");
			f10c.add("blue");
			f10c.add("red");
			
			HashSet<String> f10s = new HashSet<String>();
			f10s.add("M" );
			f10s.add("XS" );
			f10s.add("XL" );
			
			shapes[9] = new ClothingItem(getClass().getResource(
			"male_images/flannel_long_blue.jpg"), f10c, f10s, 61);
			
			//11 Flannel Long Robins
			HashSet<String> f11c = new HashSet<String>();
			f11c.add("light blue");
			f11c.add("blue");
			
			HashSet<String> f11s = new HashSet<String>();
			f11s.add("S" );
			f11s.add("M" );
			
			shapes[10] = new ClothingItem(getClass().getResource(
			"male_images/flannel_long_robins.jpg"), f11c, f11s, 45);
			
			//12 Flannel Long Blue
			HashSet<String> f12c = new HashSet<String>();
			f12c.add("purple");
			f12c.add("green");
			f12c.add("red");
			
			HashSet<String> f12s = new HashSet<String>();
			f12s.add("M" );
			f12s.add("L" );
			f12s.add("XL" );
			f12s.add("S" );
			
			shapes[11] = new ClothingItem(getClass().getResource(
			"male_images/flannel_multicolored.jpg"), f12c, f12s, 62);
			
			//13 Flannel Multicolored
			HashSet<String> f13c = new HashSet<String>();
			f13c.add("light_blue");
			f13c.add("green");
			
			HashSet<String> f13s = new HashSet<String>();
			f13s.add("L" );
			f13s.add("XL" );
			f13s.add("S" );
			
			shapes[12] = new ClothingItem(getClass().getResource(
			"male_images/gold_pool_tee.jpg"), f13c, f13s, 45);
			
			
			//14 Flannel Long Blue
			HashSet<String> f14c = new HashSet<String>();
			f14c.add("green");
			f14c.add("red");
			
			HashSet<String> f14s = new HashSet<String>();
			f14s.add("M" );
			f14s.add("S" );
			f14s.add("XS" );
			
			shapes[13] = new ClothingItem(getClass().getResource(
			"male_images/golf_green_tee.jpg"), f14c, f14s, 39);
			
			
			//15 Green Blazer
			HashSet<String> f15c = new HashSet<String>();
			f15c.add("red");
			
			HashSet<String> f15s = new HashSet<String>();
			f15s.add("M" );
			f15s.add("S" );
			f15s.add("L" );
			f15s.add("XL" );
			f15s.add("XS" );
			
			shapes[14] = new ClothingItem(getClass().getResource(
			"male_images/green_blazer.jpg"), f15c, f15s, 120);
			
			//16 Grey Black Sweater
			HashSet<String> f16c = new HashSet<String>();
			f16c.add("grey");
			f16c.add("black");
			
			HashSet<String> f16s = new HashSet<String>();
			f16s.add("M");
			f16s.add("L" );
			f16s.add("XL" );
			
			shapes[15] = new ClothingItem(getClass().getResource(
			"male_images/grey_black_sweater.jpg"), f16c, f16s, 69);
			
			//17 Half Zebra
			HashSet<String> f17c = new HashSet<String>();
			f17c.add("white");
			f17c.add("grey");
			f17c.add("black");
			
			HashSet<String> f17s = new HashSet<String>();
			f17s.add("M" );
			f17s.add("XL" );
			f17s.add("XS" );
			
			shapes[16] = new ClothingItem(getClass().getResource(
			"male_images/half_zebra.jpg"), f17c, f17s, 83);
			
			
			//18 Indie Blue Sweater
			HashSet<String> f18c = new HashSet<String>();
			f18c.add("dark blue");
			f18c.add("blue");
			f18c.add("light blue");
			
			HashSet<String> f18s = new HashSet<String>();
			f18s.add("M" );
			f18s.add("L" );
			f18s.add("XS" );
			
			shapes[17] = new ClothingItem(getClass().getResource(
			"male_images/indie_blue_sweater.jpg"), f18c, f18s, 71);
			
			
			//19 Light Pink tee
			HashSet<String> f19c = new HashSet<String>();
			f19c.add("pink");
			f19c.add("blue");
			
			
			HashSet<String> f19s = new HashSet<String>();
			f19s.add("M" );
			f19s.add("S" );
			f19s.add("XS" );
			
			shapes[18] = new ClothingItem(getClass().getResource(
			"male_images/light_pink_tee.jpg"), f19c, f19s, 29);
			
			//20 Military Blue
			HashSet<String> f20c = new HashSet<String>();
			f20c.add("light blue");
			f20c.add("blue");
			
			HashSet<String> f20s = new HashSet<String>();
			f20s.add("S" );
			f20s.add("L" );
			f20s.add("XS" );
			
			shapes[19] = new ClothingItem(getClass().getResource(
			"male_images/military_blue.jpg"), f20c, f20s, 39);
			
			//21 Pink Tee
			HashSet<String> f21c = new HashSet<String>();
			f21c.add("pink");
		
			HashSet<String> f21s = new HashSet<String>();
			f21s.add("M" );
			f21s.add("S" );
		
			shapes[20] = new ClothingItem(getClass().getResource(
			"male_images/pink_tee.jpg"), f21c, f21s, 24);
			
			//22 Purple Tee
			HashSet<String> f22c = new HashSet<String>();
			f22c.add("purple");
			f22c.add("pink");
			f22c.add("red");
			HashSet<String> f22s = new HashSet<String>();
			f22s.add("M" );
			f22s.add("XL" );
			f22s.add("XS" );
			
			shapes[21] = new ClothingItem(getClass().getResource(
			"male_images/purple_tee.jpg"), f22c, f22s, 24);	
			
			//23 Rainbow Button
			HashSet<String> f23c = new HashSet<String>();
			f23c.add("grey");
			HashSet<String> f23s = new HashSet<String>();
			f23s.add("L" );
			f23s.add("XL" );
			f23s.add("XS" );
			
			shapes[22] = new ClothingItem(getClass().getResource(
			"male_images/rainbow_button.jpg"), f23c, f23s, 85);	
			
			//24 Red Anchore Tee
			HashSet<String> f24c = new HashSet<String>();
			f24c.add("red");
			f24c.add("grey");
			
			HashSet<String> f24s = new HashSet<String>();
			f24s.add("L" );
			f24s.add("S" );
			f24s.add("XL" );
			f24s.add("M" );
			
			shapes[23] = new ClothingItem(getClass().getResource(
			"male_images/red_anchor_tee.jpg"), f24c, f24s, 29);	
			
			//25 Red Rock Tee
			HashSet<String> f25c = new HashSet<String>();
			f25c.add("red");
			f25c.add("white");
			
			HashSet<String> f25s = new HashSet<String>();
			f25s.add("L" );
			f25s.add("S" );
			f25s.add("XL" );
			
			shapes[24] = new ClothingItem(getClass().getResource(
			"male_images/rock_red_tee.jpg"), f25c, f25s, 29);	
			
			
			//26 Rock Coloured
			HashSet<String> f26c = new HashSet<String>();
			f26c.add("yellow");
			f26c.add("white");
			f26c.add("orange");
			
			HashSet<String> f26s = new HashSet<String>();
			f26s.add("L" );
			f26s.add("S" );
			f26s.add("XL" );
			f26s.add("M" );
			
			shapes[25] = new ClothingItem(getClass().getResource(
			"male_images/rock_coloured.jpg"), f26c, f26s, 28);
			
			//27 Suit Tee
			HashSet<String> f27c = new HashSet<String>();
			f27c.add("black");
			f27c.add("white");
			
			HashSet<String> f27s = new HashSet<String>();			
			f27s.add("S" );			
			f27s.add("M" );
			f27s.add("XS" );
			
			shapes[26] = new ClothingItem(getClass().getResource(
			"male_images/suit_tee.jpg"), f27c, f27s, 61);
			
			//28 Taup
			HashSet<String> f28c = new HashSet<String>();
			f28c.add("brown");
			f28c.add("grey");
			
			HashSet<String> f28s = new HashSet<String>();			
			f28s.add("S");			
			f28s.add("M");
			f28s.add("XL");
			f28s.add("L");
			
			shapes[27] = new ClothingItem(getClass().getResource(
			"male_images/taup_casual.jpg"), f28c, f28s, 41);
			
			//29 Tough Green
			HashSet<String> f29c = new HashSet<String>();
			f29c.add("green");
			
			HashSet<String> f29s = new HashSet<String>();			
			f29s.add("S");			
			f29s.add("M");
			f29s.add("L");
			f29s.add("XS");
			f29s.add("XL");
			
			shapes[28] = new ClothingItem(getClass().getResource(
			"male_images/tough_green.jpg"), f29c, f29s, 105);
			

			//30 White washed grey 
			HashSet<String> f30c = new HashSet<String>();
			f30c.add("white");
			f30c.add("grey");
			
			HashSet<String> f30s = new HashSet<String>();			
			f30s.add("M");			
			f30s.add("XL");			
			f30s.add("XS");						
			shapes[29] = new ClothingItem(getClass().getResource(
			"male_images/washed_white_grey.jpg"), f30c, f30s, 75);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			


			
			
				
			
					
		} catch (IOException e) {
	
	}	
		
		
	}
}
