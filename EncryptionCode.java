import java.util.Scanner;

public class EncryptionCode {

	static String pText="";
	static int r, depth;
	static char[][] matrix = new char[depth][];
	
	public static void main(String[] args) {
		        
        String cText = "";
        
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Plain text:");
		pText = input.nextLine().toLowerCase();

		System.out.println("Please enter the Key: ");
		System.out.println("Key - Depth: ");
		depth = input.nextInt();

		System.out.println("Key - r (Number of times to do encryption): ");
		r = input.nextInt();
		
		matrix = new char[depth][pText.length()];
		initialise_the_matrix(depth, matrix);
		System.out.println("************************************************************************************************************************************");
		System.out.println("Rail Fence Cipher Encryption Method");      	
		System.out.println();

		System.out.println("Original Plain Text: " + pText);
        System.out.println();
        
        	//Number of rounds(times) for which encryption will be done.
        	for(int i=0; i< r; i++) 
        	{
        		
        		populate_the_matrix(depth, matrix);
        		cText = traverse_the_matrix(depth,matrix);
        		System.out.println("Cipher text after round " + (i+1) + ": " + cText);
                pText = cText;
        	}
	}
	
	//This function initializes the all the cells of the matrix with the flag "#".
	private static void initialise_the_matrix(int d, char[][] m)
	{
		int row, col;
		for(row=0;row<depth;row++)
		{
			for(col=0;col<pText.length();col++)
			{
				m[row][col]='#';
			}
		}
	}
	
             
        // This function populates the matrix with the letters of the plain text.
            private static void populate_the_matrix(int d, char[][] m) 
            {
            	String result="";
            	int itr=0;
            	int direction = 0, value = 1, row, col;
        		for(row=0,col=0; col<pText.length(); col++)
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
        			
        			m[row][col]=pText.charAt(itr);
        			itr++;
        			row=row+value;
        			
        		}
        	}
            
            //This function traverses the matrix in row-wise manner to generate and return the cipher text.
            private static String traverse_the_matrix(int d, char[][] m)
            {
            	String res="";
            	
            	int itr=0, row,col;
        		for(row=0;row<depth;row++)
        		{
        			for(col=0;col<m[row].length;col++)
        			{
        				
        				if(m[row][col]!='#')
        				{
        					res=res + m[row][col];
        				}
        				
        			}
        		}
            	return res;
            }
        }
