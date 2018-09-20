import java.util.Scanner;

public class Transpuesta {
 public static void main(String[] arg) {
  	int x;
  // int y;
  	Scanner s = new Scanner(System.in);
  	System.out.print("digite la dimension de la matriz, serán matrices cuadradas \n");
  	x = s.nextInt();

  	int m[][] = new int[x][x];

  	for (int i = 0; i < m.length; i++) {
    for (int j = 0; j < m[0].length; j++) {
    System.out.print("Digite los valores de la matriz: \n");
    m[i][j] = s.nextInt();

   }

  }
  System.out.print("\t matriz original: \n");
  	for (int i = 0; i < m.length; i++) {
   	for (int j = 0; j < m[0].length; j++) {
    
    System.out.print(m[i][j]);
    
   }
   
   System.out.println();

  }
  System.out.println("\t matriz transpuesta:");
  for (int i = 0; i < m.length; i++) {
  
   for (int j = 0; j < m.length; j++) {
    
    System.out.print(m[j][i]);

   }
   
   System.out.println();

  }

 }

} 