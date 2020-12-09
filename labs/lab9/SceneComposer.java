package lab9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import cse131.ArgsProcessor;
import lab9.Drawable;
import lab9.scenes.*;
import lab9.scenes.ifs.*;
import sedgewick.StdDraw;

public class SceneComposer {



	public static void main(String[] args) {
		
		boolean doneRecording = false;
		ArgsProcessor ap = new ArgsProcessor(args);
		
		Map<String, Drawable> Drawable = new HashMap<String, Drawable>();
		
		Map<String, List<Drawable>> Save = new HashMap<String, List<Drawable>>();
		
		List<Drawable> init = new LinkedList<Drawable>();
		
		Forest sample = new Forest(9);
		init.add(sample);
		
		Leaves sample2 = new Leaves(8);
		init.add(sample2);
		init.add(sample2);
		
		
		
		Save.put("init", init);
		
		//Stores Drawables
		List<Drawable> commands = new LinkedList<Drawable>();
		//Stores Drawable Keys
		List<String> keyStores = new LinkedList<String>();
		
		String styles = "Available Styles are:\n";
		
		
		//Store Forests
		for(int i=0;i<=300;i++) {
			String fIdentifier = "f" + i;
			Forest f = new Forest(i); 
			Drawable.put(fIdentifier, f);
		}
		styles += "f = Forest (+ quantity from 0-10)\n";
		//Store Bubbles
		for(int i=0;i<=300;i++) {
			String fIdentifier = "b" + i;
			Bubbles f = new Bubbles(i); 
			Drawable.put(fIdentifier, f);
		}
		styles += "b = Bubbles (+ quantity from 0-)\n";
	
		
		//Stores Leaves
		for(int i=0;i<=300;i++) {
			String fIdentifier = "l" + i;
			Leaves f = new Leaves(i); 
			Drawable.put(fIdentifier, f);
		}
		styles += "l = Leaves (+ quantity from 0-9)\n";
		
		//Store Clear
		Clear c = new Clear();
		Drawable.put("clear", c);
		styles += "clear = Covers Canvas with White Rectangle (Do NOT use any quantities)\n";
		
		/*
		//Stores Circle
		for(int i=0;i<=10;i++) {
			String fIdentifier = "c" + i;
			Circle f = new Circle(i); 
			Drawable.put(fIdentifier, f);
		}
		styles += "c = Circles\n";
		*/
		
		//
		// for demo only, remove this code and write your own to do what
		//   is needed for this lab
		/*
		while(true) {
			StdDraw.show(10);
			for (int i=0; i < 10; ++i) {
				Forest f = new Forest(5);
				f.draw(); f.draw(); f.draw(); f.draw();
				Leaves l = new Leaves(5);
				l.draw(); l.draw();
			}
			Bubbles b = new Bubbles(10);
			b.draw();
			StdDraw.show(10);
			String resp = ap.nextString("Again?");
			if (resp.equals("no")) {
				break;
			}
			else {
				new Clear().draw();
			}
		}
		*/
		//
		// end of demo code
		//
		
		while(true) {
			StdDraw.show(10);
			String input = ap.nextString("Welcome to Evin's Illustrator!\nPick an illustration element\nMust use format Type+Quantity (ex. f0)\nType in a name other than the specified commands or styles to record your image\nTo see a sample illustration, Type 'init'\nType 'getStyles' to see available Styles\nType 'end' to exit the application");
			//System.out.println("Styles.get(" + input + ") = " + Drawable.get(input));

			if(Save.get(input) != null ){
				
					for(int j=0;j<Save.get(input).size();j++ ) {
						Save.get(input).get(j).draw();
					}
					
				
			}
			
			if(input.equals("getStyles")) {
				System.out.println(styles);
			}
			else if(input.equals("end")){
				System.exit(0);
			}
			/*
			else if(input.equals("init")){
				for (int i=0; i < 10; ++i) {
					Forest f = new Forest(5);
					f.draw(); f.draw(); f.draw(); f.draw();
					Leaves l = new Leaves(5);
					l.draw(); l.draw();
				}
			}
			*/
			else {

				if(Drawable.get(input) != null) {
					Drawable f = Drawable.get(input);

					f.draw();
					/*
					commands.add(f);
					keyStores.add(input);
					System.out.println("Drawable Object Command Stored is:" + keyStores);
					*/
					
				}
				else if(input.equals("record")){
					List<Drawable>Command = new LinkedList<Drawable>();
					while(doneRecording==false) {
						

						String inputR = ap.nextString("Now recording\nType exit to restart the application if this was not intended \nType 'done once you are satisfied with your image'");
						if(inputR.equals("end")){System.exit(0);}

						if(inputR.equals("getStyles")) {System.out.println(styles);}

						if(Drawable.get(inputR) != null) {
							Drawable f = Drawable.get(inputR);

							f.draw();
							StdDraw.show(10);
							Command.add(f);
							System.out.println("Drawable Object Command Stored is:" + Command);
							System.out.println(Command);
						}
						else if(inputR.equals("done")) {
							System.out.println("Command = " + Command);
							doneRecording = true;
							String name = ap.nextString("What would you like to call this image?");
							Save.put(name, Command);
							System.out.println("Saved Image " + name + " = " + Command);
						}
						else{
							
						}


						

					} 
					doneRecording = false;
				}

			}

			//exit case
			
			
			
		}
		
	
	}

}
