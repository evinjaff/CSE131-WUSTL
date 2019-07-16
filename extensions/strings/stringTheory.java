package strings;

public class stringTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "21 + 33";
		int spacecount = 0; //TotalCount
		int numcount = 0; //TotalCount except numbers
		
		int [] num1 = new int [100];




		for(int i=0;i<s.length();i++) {

			System.out.println("Substring " + i + ": " + s.substring(i, i+1));

			String strCheck = s.substring(i, i+1);


			Integer.parseInt(s.substring(i, i+1));
			int k = i;
			boolean keepgoing = true;
			while(keepgoing = true) {

				try { 
					num1[i] = Integer.parseInt(s.substring(k, k+1));
					System.out.println("Other num = "  + s.substring(k, k+1));
					k++;
				}
				catch (NumberFormatException e) {
					keepgoing = false;
				}
					
				

			}
			for(int a=0;a<num1.length;a++) {
			System.out.println("num1[]: " + num1[a]);
		}


		}
		//catch(NumberFormatException e) {

		//}
		spacecount++;
		
		

	}

	//int int1 = Integer.decode(s);
	//int int2 = Integer.parseInt(s);

	//System.out.println("int 1:" + int1);
	//System.out.println("int 2:" + int2);
}

//}
