//_______________________________________________________________________________________
// Basic Tic Tac Toe. 
// Built using Array, String, .equals();, Switchcase, if/else, loops, JOptionPane
//  website : motasimfoad.com
// Version : 1.0
//_______________________________________________________________________________________
    import java.util.*;

import javax.swing.JOptionPane;


 public class demo {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
   String a[][] = new String [3] [3];
   System.out.println("________________________________________________________________________________________");
   System.out.println(" |-Its a two player tick tack toe");
   System.out.println(" |-You need to enter numbers between 1 to 9");
   System.out.println(" |-This is a turn based game so after player 1 enters a number then its player 2's turn");
   System.out.println(" |-Player 1 will be provided with 'X' mark");
   System.out.println(" |-Player 2 will be provided with 'O' mark");
   System.out.println("________________________________________________________________________________________");
   for (int i = 0; i < a.length; i++) {
    for (int j = 0; j < a.length; j++) {
     a[i][j] = " ";
    }
   }
   for (int i = 0; i < a.length; i++) {
    System.out.println();
    System.out.println("_______________");
    for (int j = 0; j < a.length; j++) {
     System.out.print("| " + a[i][j] +" " + "|");
    }
   }
   System.out.println("\n_______________");
   for (int p = 0; p <=9; p++) {
    if(p==9){
     break;
    }
   int n = 0;
   int m = 0;
   System.out.println("_________________________");
   System.out.println("Enter Your Position Nuber");
   System.out.println("_________________________");
   int getinput = sc.nextInt();
      switch (getinput) {
   case 1:
    n = 0;
    m = 0;
    break;
   case 2:
    n = 0;
    m = 1;
    break;
   case 3:
    n = 0;
    m = 2;
    break;
   case 4:
    n = 1;
    m = 0;
    break;
   case 5:
    n = 1;
    m = 1;
    break;
   case 6:
    n = 1;
    m = 2;
    break;
   case 7:
    n = 2;
    m = 0;
    break;
   case 8:
    n = 2;
    m = 1;
    break;
   case 9:
    n = 2;
    m = 2;
    break;
   default:
    System.out.println("Invalid input");
    break;
   }
        if(!a[n][m].equals("X") && !a[n][m].equals("O")){
      if(p%2==0){
     a[n][m]= "X";
     }
      else{
       a[n][m]= "O"; 
      }
     }
     else{
    	 JOptionPane.showMessageDialog(null, "This place is taken, enter another number", "Same position error", JOptionPane.WARNING_MESSAGE);
      
      p=p-1;
     }
   for (int i = 0; i < a.length; i++) {
    System.out.println();
    System.out.println("_______________");
    for (int j = 0; j < a.length; j++) {
     System.out.print("| " + a[i][j] +" " + "|");
    }
   }
   System.out.println("\n_______________");
  }
   System.out.println();
   System.out.println();
   System.out.println("______________________________");
   if (a[0][0].equals("X") && a[0][0].equals(a[2][0])) {
    JOptionPane.showMessageDialog(null, "Player 1 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
   }
   else if (a[0][1].equals("X") && a[2][1].equals(a[1][1])) {
	   JOptionPane.showMessageDialog(null, "Player 1 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	} 
   else if (a[0][2].equals("X") && a[1][2].equals(a[2][2])) {
	   JOptionPane.showMessageDialog(null, "Player 1 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[0][0].equals("X") && a[0][1].equals(a[0][2])) {
	   JOptionPane.showMessageDialog(null, "Player 1 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[1][0].equals("X") && a[1][1].equals(a[1][2])) {
	   JOptionPane.showMessageDialog(null, "Player 1 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[2][0].equals("X") && a[2][1].equals(a[2][2])) {
	   JOptionPane.showMessageDialog(null, "Player 1 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[0][0].equals("O") && a[0][0].equals(a[2][0])) {
	   JOptionPane.showMessageDialog(null, "Player 2 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[0][1].equals("O") && a[2][1].equals(a[1][1])) {
	   JOptionPane.showMessageDialog(null, "Player 2 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	} 
   else if (a[0][2].equals("O") && a[1][2].equals(a[2][2])) {
	   JOptionPane.showMessageDialog(null, "Player 2 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[0][0].equals("O") && a[0][1].equals(a[0][2])) {
	   JOptionPane.showMessageDialog(null, "Player 2 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[1][0].equals("O") && a[1][1].equals(a[1][2])) {
	   JOptionPane.showMessageDialog(null, "Player 2 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[2][0].equals("O") && a[2][1].equals(a[2][2])) {
	   JOptionPane.showMessageDialog(null, "Player 2 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[0][0].equals("O") && a[1][1].equals(a[2][2])) {
	   JOptionPane.showMessageDialog(null, "Player 2 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[2][0].equals("O") && a[1][1].equals(a[0][2])) {
	   JOptionPane.showMessageDialog(null, "Player 2 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
   }
   else if (a[0][0].equals("X") && a[1][1].equals(a[2][2])) {
	   JOptionPane.showMessageDialog(null, "Player 1 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else if (a[2][0].equals("X") && a[1][1].equals(a[0][2])) {
	   JOptionPane.showMessageDialog(null, "Player 1 Wins", "Congratulation", JOptionPane.WARNING_MESSAGE);
	}
   else{
	   JOptionPane.showMessageDialog(null, "No One won", "Alas!!", JOptionPane.WARNING_MESSAGE); 
   }
   System.out.println("______________________________");
  }
 }
 
