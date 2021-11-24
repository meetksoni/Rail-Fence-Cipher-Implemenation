import java.util.Scanner;

public class DecryptionCode {

			static int depth, r;
			static String ctext;
			static char[][] matrix = new char[depth][];
			
	public static void main(String[] args) {
		
		int i;
		String res;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the Cipher text: ");
		ctext = input.nextLine().toLowerCase();

		System.out.println("Please enter the Key: ");
		System.out.println("Key - Depth: ");
		depth = input.nextInt();

		System.out.println("Key - r (Number of times to do decryption): ");
		r = input.nextInt();
		
		matrix = new char[depth][ctext.length()];
		
		System.out.println("************************************************************************************************************************************");
		System.out.println("Rail Fence Cipher Decryption Method");
		System.out.println();
		System.out.println("Original Cipher Text: " + ctext);
		System.out.println();
		
		System.out.println("Decryption of the Cipher Text in various rounds is shown below:");
		System.out.println();
		
		for(i=0;i<r;i++)
		{
			res = decrypt(depth, matrix);
			System.out.println("Decrypted text after round " + (i+1) + ": " + res);
			ctext=res;
			System.out.println();
		}
		
		
	}

	//This function returns the decrypted text.
	public static String decrypt(int d, char[][] m)
	{	
		String decrypted_text;
		find_the_location_in_the_matrix(d, m);
		populate_the_matrix(d, m);
		decrypted_text = traverse_the_matrix(d, m);
		return decrypted_text;
	}
	
	//This function finds the locations where we will place the elements of the cipher text and mark them by the flag '#'.
	public static void find_the_location_in_the_matrix(int d, char[][] m)
	{
		int direction = 0, value = 1, row, col;
		for(row=0,col=0; col<ctext.length(); col++)
		{
			
			if(direction==0 && row==d)
			{
				direction=1;
				value=-1;
				row=row+value-1;
			}
			
			if(direction==1 && row==-1)
			{
				direction=0;
				value=1;
				row=row+value+1;
			}
			m[row][col]= '#';
			row=row+value;
		}
		
	}
	
	//This function populates the matrix with the letters of the cipher text
	public static void populate_the_matrix(int d, char[][] m)
	{
		int itr=0, row,col;
		for(row=0;row<depth;row++)
		{
			for(col=0;col<m[row].length;col++)
			{
				if(m[row][col]=='#')
				{
					m[row][col]=ctext.charAt(itr);
					itr++;
				}
			}
		}
	}
	
	//This function traverses the matrix in the zig-zag manner to find the decrypted text.
	public static String traverse_the_matrix(int d, char[][] m)
	{
		int direction = 0, value = 1, row, col;
		String result="";
		for(row=0,col=0; col<ctext.length(); col++)
		{
			
			
			if(direction==0 && row==d)
			{
				direction=1;
				value=-1;
				row=row+value-1;
			}
			
			if(direction==1 && row==-1)
			{
				direction=0;
				value=1;
				row=row+value+1;
			}
			result = result + m[row][col];
			row=row+value;
		}
		
		return result;
	}
}
