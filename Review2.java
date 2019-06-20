
/*
 _____ ____ ___   ____   ___  _  ___  
 | ____/ ___|_ _| |___ \ / _ \/ |( _ ) 
 |  _| \___ \| |    __) | | | | |/ _ \ 
 | |___ ___) | |   / __/| |_| | | (_) |
 |_____|____/___| |_____|\___/|_|\___/ 
 */

 //If you are lost, do not be afraid to ask for help or look back on previous assignments.

public class Review2 {
	public static void main(String[] args){

/* An array functions just like a variable. Each array has a pertaining datatype and is used to store multiple data:
 
type var-name[];
OR
type[] var-name;
 
such as
int intArray[]; 
or int[] intArray; 
BOTH are valid ways to initialize arrays
 */
    
//Now we're going to create an integer array for a phone number

/*
Each number and space in the array consists with its index
[7][7][3][8][8][6][9][5][9][3]
|0||1||2||3||4||5||6||7||8||9|
*/
    
    String[] birds;
    birds = new String[5]; //A phone number has 10 digits, BUT every arrays first index is 0 so we have 9 total indexes
  	birds[0] = "penguin";
    birds[1] = "BarredOwl";
    birds[2] = "BlueJay";
    birds[3] = "Woodpecker";
    birds[4] = "Chicken";
for (int i = 0; i < birds.length; i++) {
         System.out.println("The bird at the " + i + " index is the "+ birds[i]);
}
    //EXERCISE: Create a String array called birbs with 5 indexes. In the first index put "cockatiels"


	}
}
