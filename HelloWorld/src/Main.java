


import java.awt.Image;

import ij.process.ColorProcessor;
import ij.process.ImageProcessor;

public class Main {

	public static void main(String[] args) {
		
		Image myImage;
		// instantiate myImage
		ImageProcessor processor = new ColorProcessor(myImage);

		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		Pessoa p3 = p1;
		
		p1.nome = "zé";
		p3.nome = "maria";
		
		System.out.println(p1.nome);
		
		
		
		
		
		
		System.out.println(p1.peso);
		
		p1.comer();
		
		System.out.println(p1.peso);
		
		
	}

}
 