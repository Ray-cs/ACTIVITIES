package DIOSANTA_CCE109;
public class ARRAY_2D {

	public static void main(String[] args) {
		 
		int numbers[][] = {
		            {120,250,789,7},
		            {58,79,31,87},
		            {8,1,2,3},
		            {99,98,97,96}
		        };

		        // array in table form
		        System.out.println("Array in table form:");
		        for(int i=0;i<numbers.length;i++){
		            for(int j=0;j<numbers[i].length;j++){
		                System.out.print(numbers[i][j] + "\t");
		            }
		            System.out.println();
		        }

		        // find index of number 1
		        for(int i=0;i<numbers.length;i++){
		            for(int j=0;j<numbers[i].length;j++){
		                if(numbers[i][j]==1){
		                    System.out.println("\nNumber 1 is found at indices " + i + " and " + j);
		                    numbers[i][j] = 50;
		                }
		            }
		        }

		        // change 1 to 50 and update the array
		        System.out.println("\nUpdated Array from 1 to 50:");
		        for(int i=0;i<numbers.length;i++){
		            for(int j=0;j<numbers[i].length;j++){
		                System.out.print(numbers[i][j] + "\t");
		            }
		            System.out.println();
		        }

		        // change all values in row 2 to 0
		        for(int j=0;j<numbers[2].length;j++){
		            numbers[2][j] = 0;
		        }

		        System.out.println("\nUpdated Array after changing row 2 to 0s:");
		        for(int i=0;i<numbers.length;i++){
		            for(int j=0;j<numbers[i].length;j++){
		                System.out.print(numbers[i][j] + "\t");
		            }
		            System.out.println();
		        }

		    }
		}