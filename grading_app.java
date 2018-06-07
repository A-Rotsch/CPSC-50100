import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class grading_app {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int student1total = 0; //400; test
		int student2total = 0; //350;
		int student3total = 0; //370;
		int student4total = 0; //280;
		int student5total = 0; //300;
		int student6total = 0; //290;
		int student7total = 0; //310;
		int student8total = 0; //340;
		int student9total = 0; //350;
		int student10total = 0; //330;
		double classtotal = 0;
		double mean = 0;
		double standard = 0;
		double standarddeviation = 0;
		double A = 0;
		double B = 0;
		double C = 0;
		double D = 0;
		double F = 0;
		String student1grade;
		String student2grade;
		String student3grade;
		String student4grade;
		String student5grade;
		String student6grade;
		String student7grade;
		String student8grade;
		String student9grade;
		String student10grade;

		
		int[][] table = new int[10][8];
		//Student 1
		
		System.out.println("Student 1 grades.");
		System.out.println("Please enter exam 1 score, max score 50.");
		table[0][0] = scan.nextInt();
		System.out.println("Please enter exam 2 score, max score 50.");
		table[0][1] = scan.nextInt();
		System.out.println("Please enter exam 3 score, max score 50.");
		table[0][2] = scan.nextInt();
		System.out.println("Please enter exam 4 score, max score 50.");
		table[0][3] = scan.nextInt();
		System.out.println("Please enter assignment 1 score, max score 75.");
		table[0][4] = scan.nextInt();
		System.out.println("Please enter assignment 2 score, max score 75.");
		table[0][5] = scan.nextInt();
		System.out.println("Please enter assignment 3 score, max score 75.");
		table[0][6] = scan.nextInt();
		System.out.println("Please enter assignment 4 score, max score 75.");
		table[0][7] = scan.nextInt();
		student1total = table[0][0] + table[0][1]+ table[0][2]+ table[0][3]+ table[0][4]+ table[0][5] + table[0][6]+ table[0][7];
	
		//Student 2
		System.out.println("Student 2 grades.");
		System.out.println("Please enter exam 1 score, max score 50.");
		table[1][0] = scan.nextInt();
		System.out.println("Please enter exam 2 score, max score 50.");
		table[1][1] = scan.nextInt();
		System.out.println("Please enter exam 3 score, max score 50.");
		table[1][2] = scan.nextInt();
		System.out.println("Please enter exam 4 score, max score 50.");
		table[1][3] = scan.nextInt();
		System.out.println("Please enter assignment 1 score, max score 75.");
		table[1][4] = scan.nextInt();
		System.out.println("Please enter assignment 2 score, max score 75.");
		table[1][5] = scan.nextInt();
		System.out.println("Please enter assignment 3 score, max score 75.");
		table[1][6] = scan.nextInt();
		System.out.println("Please enter assignment 4 score, max score 75.");
		table[1][7] = scan.nextInt();
		student2total = table[1][0] + table[1][1]+ table[1][2]+ table[1][3]+ table[1][4]+ table[1][5] + table[1][6]+ table[1][7];
		
	
		//Student 3
		System.out.println("Student 3 grades.");
		System.out.println("Please enter exam 1 score, max score 50.");
		table[2][0] = scan.nextInt();
		System.out.println("Please enter exam 2 score, max score 50.");
		table[2][1] = scan.nextInt();
		System.out.println("Please enter exam 3 score, max score 50.");
		table[2][2] = scan.nextInt();
		System.out.println("Please enter exam 4 score, max score 50.");
		table[2][3] = scan.nextInt();
		System.out.println("Please enter assignment 1 score, max score 75.");
		table[2][4] = scan.nextInt();
		System.out.println("Please enter assignment 2 score, max score 75.");
		table[2][5] = scan.nextInt();
		System.out.println("Please enter assignment 3 score, max score 75.");
		table[2][6] = scan.nextInt();
		System.out.println("Please enter assignment 4 score, max score 75.");
		table[2][7] = scan.nextInt();
		student3total = table[2][0] + table[2][1]+ table[2][2]+ table[2][3]+ table[2][4]+ table[2][5] + table[2][6]+ table[2][7];
		
		//Student 4
		System.out.println("Student 4 grades.");
		System.out.println("Please enter exam 1 score, max score 50.");
		table[3][0] = scan.nextInt();
		System.out.println("Please enter exam 2 score, max score 50.");
		table[3][1] = scan.nextInt();
		System.out.println("Please enter exam 3 score, max score 50.");
		table[3][2] = scan.nextInt();
		System.out.println("Please enter exam 4 score, max score 50.");
		table[3][3] = scan.nextInt();
		System.out.println("Please enter assignment 1 score, max score 75.");
		table[3][4] = scan.nextInt();
		System.out.println("Please enter assignment 2 score, max score 75.");
		table[3][5] = scan.nextInt();
		System.out.println("Please enter assignment 3 score, max score 75.");
		table[3][6] = scan.nextInt();
		System.out.println("Please enter assignment 4 score, max score 75.");
		table[3][7] = scan.nextInt();
		student4total = table[3][0] + table[3][1]+ table[3][2]+ table[3][3]+ table[3][4]+ table[3][5] + table[3][6]+ table[3][7];
		
		//Student 5
		System.out.println("Student 5 grades.");
		System.out.println("Please enter exam 1 score, max score 50.");
		table[4][0] = scan.nextInt();
		System.out.println("Please enter exam 2 score, max score 50.");
		table[4][1] = scan.nextInt();
		System.out.println("Please enter exam 3 score, max score 50.");
		table[4][2] = scan.nextInt();
		System.out.println("Please enter exam 4 score, max score 50.");
		table[4][3] = scan.nextInt();
		System.out.println("Please enter assignment 1 score, max score 75.");
		table[4][4] = scan.nextInt();
		System.out.println("Please enter assignment 2 score, max score 75.");
		table[4][5] = scan.nextInt();
		System.out.println("Please enter assignment 3 score, max score 75.");
		table[4][6] = scan.nextInt();
		System.out.println("Please enter assignment 4 score, max score 75.");
		table[4][7] = scan.nextInt();
		student5total = table[4][0] + table[4][1]+ table[4][2]+ table[4][3]+ table[4][4]+ table[4][5] + table[4][6]+ table[4][7];
		
		//Student 6
		System.out.println("Student 6 grades.");
		System.out.println("Please enter exam 1 score, max score 50.");
		table[5][0] = scan.nextInt();
		System.out.println("Please enter exam 2 score, max score 50.");
		table[5][1] = scan.nextInt();
		System.out.println("Please enter exam 3 score, max score 50.");
		table[5][2] = scan.nextInt();
		System.out.println("Please enter exam 4 score, max score 50.");
		table[5][3] = scan.nextInt();
		System.out.println("Please enter assignment 1 score, max score 75.");
		table[5][4] = scan.nextInt();
		System.out.println("Please enter assignment 2 score, max score 75.");
		table[5][5] = scan.nextInt();
		System.out.println("Please enter assignment 3 score, max score 75.");
		table[5][6] = scan.nextInt();
		System.out.println("Please enter assignment 4 score, max score 75.");
		table[5][7] = scan.nextInt();
		student6total = table[5][0] + table[5][1]+ table[5][2]+ table[5][3]+ table[5][4]+ table[5][5] + table[5][6]+ table[5][7];
		
		//Student 7
		System.out.println("Student 7 grades.");
		System.out.println("Please enter exam 1 score, max score 50.");
		table[6][0] = scan.nextInt();
		System.out.println("Please enter exam 2 score, max score 50.");
		table[6][1] = scan.nextInt();
		System.out.println("Please enter exam 3 score, max score 50.");
		table[6][2] = scan.nextInt();
		System.out.println("Please enter exam 4 score, max score 50.");
		table[6][3] = scan.nextInt();
		System.out.println("Please enter assignment 1 score, max score 75.");
		table[6][4] = scan.nextInt();
		System.out.println("Please enter assignment 2 score, max score 75.");
		table[6][5] = scan.nextInt();
		System.out.println("Please enter assignment 3 score, max score 75.");
		table[6][6] = scan.nextInt();
		System.out.println("Please enter assignment 4 score, max score 75.");
		table[6][7] = scan.nextInt();
		student7total = table[6][0] + table[6][1]+ table[6][2]+ table[6][3]+ table[6][4]+ table[6][5] + table[6][6]+ table[6][7];
		
		//Student 8
		System.out.println("Student 8 grades.");
		System.out.println("Please enter exam 1 score, max score 50.");
		table[7][0] = scan.nextInt();
		System.out.println("Please enter exam 2 score, max score 50.");
		table[7][1] = scan.nextInt();
		System.out.println("Please enter exam 3 score, max score 50.");
		table[7][2] = scan.nextInt();
		System.out.println("Please enter exam 4 score, max score 50.");
		table[7][3] = scan.nextInt();
		System.out.println("Please enter assignment 1 score, max score 75.");
		table[7][4] = scan.nextInt();
		System.out.println("Please enter assignment 2 score, max score 75.");
		table[7][5] = scan.nextInt();
		System.out.println("Please enter assignment 3 score, max score 75.");
		table[7][6] = scan.nextInt();
		System.out.println("Please enter assignment 4 score, max score 75.");
		table[7][7] = scan.nextInt();
		student8total = table[7][0] + table[7][1]+ table[7][2]+ table[7][3]+ table[7][4]+ table[7][5] + table[7][6]+ table[7][7];
		
		//Student 9
		System.out.println("Student 9 grades.");
		System.out.println("Please enter exam 1 score, max score 50.");
		table[8][0] = scan.nextInt();
		System.out.println("Please enter exam 2 score, max score 50.");
		table[8][1] = scan.nextInt();
		System.out.println("Please enter exam 3 score, max score 50.");
		table[8][2] = scan.nextInt();
		System.out.println("Please enter exam 4 score, max score 50.");
		table[8][3] = scan.nextInt();
		System.out.println("Please enter assignment 1 score, max score 75.");
		table[8][4] = scan.nextInt();
		System.out.println("Please enter assignment 2 score, max score 75.");
		table[8][5] = scan.nextInt();
		System.out.println("Please enter assignment 3 score, max score 75.");
		table[8][6] = scan.nextInt();
		System.out.println("Please enter assignment 4 score, max score 75.");
		table[8][7] = scan.nextInt();
		student9total = table[8][0] + table[8][1]+ table[8][2]+ table[8][3]+ table[8][4]+ table[8][5] + table[8][6]+ table[8][7];
		
		//Student 10
		System.out.println("Student 10 grades.");
		System.out.println("Please enter exam 1 score, max score 50.");
		table[9][0] = scan.nextInt();
		System.out.println("Please enter exam 2 score, max score 50.");
		table[9][1] = scan.nextInt();
		System.out.println("Please enter exam 3 score, max score 50.");
		table[9][2] = scan.nextInt();
		System.out.println("Please enter exam 4 score, max score 50.");
		table[9][3] = scan.nextInt();
		System.out.println("Please enter assignment 1 score, max score 75.");
		table[9][4] = scan.nextInt();
		System.out.println("Please enter assignment 2 score, max score 75.");
		table[9][5] = scan.nextInt();
		System.out.println("Please enter assignment 3 score, max score 75.");
		table[9][6] = scan.nextInt();
		System.out.println("Please enter assignment 4 score, max score 75.");
		table[9][7] = scan.nextInt();
		student10total = table[9][0] + table[9][1]+ table[9][2]+ table[9][3]+ table[9][4]+ table[9][5] + table[9][6]+ table[9][7];
		
		classtotal = (student1total + student2total + student3total + student4total + student5total + student6total + student7total + student8total + student9total + student10total);
		mean = (classtotal/10);
		standard = (((Math.pow(student1total - mean, 2)) + (Math.pow(student2total - mean, 2)) + (Math.pow(student3total - mean, 2)) + (Math.pow(student4total - mean, 2)) + (Math.pow(student5total - mean, 2)) + (Math.pow(student6total -mean, 2)) + (Math.pow(student7total - mean, 2))
		+ (Math.pow(student8total - mean, 2)) + (Math.pow(student9total - mean, 2)) + (Math.pow(student10total - mean, 2))))/10;
		
		standarddeviation = Math.sqrt(standard);
		
		A = mean+(standarddeviation*2);
		B = mean+(standarddeviation*1);
		C = mean;
		D = mean - (standarddeviation);
		F = mean - (standarddeviation*2);
		System.out.print("\nClass Total: "+classtotal);
		System.out.print("\nStandard Deviation: "+standarddeviation);
		System.out.print("\nMean: "+mean);
		System.out.print("\nMinimum for a grade of A = "+A);
		System.out.print("\nMinimum for a grade of B = "+B);
		System.out.print("\nMinimum for a grade of C = "+C);
		System.out.print("\nMinimum for a grade of D = "+D);
		System.out.print("\nMinimum for a grade of F = "+F);
		
		System.out.print("\nStudent 1 Score = "+student1total);
		if(student1total>=A)
			{
			student1grade = "A";
			System.out.print("\nStudent 1 grade is "+student1grade);
			}
		else if(student1total>= B && student1total<= A)
			{
			student1grade = "B";
			System.out.print("\nStudent 1 grade is "+student1grade);
			}
		else if(student1total>= C && student1total<= B)
			{
			student1grade = "C";
			System.out.print("\nStudent 1 grade is "+student1grade);
			}	
		else if(student1total>= D && student1total<= C)
			{
			student1grade = "D";
			System.out.print("\nStudent 1 grade is "+student1grade);
			}
		else if(student1total>= F && student1total<= D)
			{
			student1grade = "F";
			System.out.print("\nStudent 1 grade is "+student1grade);
			}
	
		System.out.print("\nStudent 2 Score = "+student2total);
		if(student2total>=A)
			{
			student2grade = "A";
			System.out.print("\nStudent 2 grade is "+student2grade);
			}
		else if(student2total>= B && student2total<= A)
			{
			student2grade = "B";
			System.out.print("\nStudent 2 grade is "+student2grade);
			}
		else if(student2total>= C && student2total<= B)
			{
			student2grade = "C";
			System.out.print("\nStudent 2 grade is "+student2grade);
			}	
		else if(student2total>= D && student2total<= C)
			{
			student2grade = "D";
			System.out.print("\nStudent 2 grade is "+student2grade);
			}
		else if(student2total>= F && student2total<= D)
			{
			student2grade = "F";
			System.out.print("\nStudent 2 grade is "+student2grade);
			}
		
		System.out.print("\nStudent 3 Score = "+student3total);
		if(student3total>=A)
			{
			student3grade = "A";
			System.out.print("\nStudent 3 grade is "+student3grade);
			}
		else if(student3total>= B && student3total<= A)
			{
			student3grade = "B";
			System.out.print("\nStudent 3 grade is "+student3grade);
			}
		else if(student3total>= C && student3total<= B)
			{
			student3grade = "C";
			System.out.print("\nStudent 3 grade is "+student3grade);
			}	
		else if(student3total>= D && student3total<= C)
			{
			student3grade = "D";
			System.out.print("\nStudent 3 grade is "+student3grade);
			}
		else if(student3total>= F && student3total<= D)
			{
			student3grade = "F";
			System.out.print("\nStudent 3 grade is "+student3grade);
			}
		
		System.out.print("\nStudent 4 Score = "+student4total);
		if(student4total>=A)
			{
			student4grade = "A";
			System.out.print("\nStudent 4 grade is "+student4grade);
			}
		else if(student4total>= B && student4total<= A)
			{
			student4grade = "B";
			System.out.print("\nStudent 4 grade is "+student4grade);
			}
		else if(student4total>= C && student4total<= B)
			{
			student4grade = "C";
			System.out.print("\nStudent 4 grade is "+student4grade);
			}	
		else if(student4total>= D && student4total<= C)
			{
			student4grade = "D";
			System.out.print("\nStudent 4 grade is "+student4grade);
			}
		else if(student4total>= F && student4total<= D)
			{
			student4grade = "F";
			System.out.print("\nStudent 4 grade is "+student4grade);
			}		
		
		System.out.print("\nStudent 5 Score = "+student5total);
		if(student5total>=A)
			{
			student5grade = "A";
			System.out.print("\nStudent 5 grade is "+student5grade);
			}
		else if(student5total>= B && student5total<= A)
			{
			student5grade = "B";
			System.out.print("\nStudent 5 grade is "+student5grade);
			}
		else if(student5total>= C && student5total<= B)
			{
			student5grade = "C";
			System.out.print("\nStudent 5 grade is "+student5grade);
			}	
		else if(student5total>= D && student5total<= C)
			{
			student5grade = "D";
			System.out.print("\nStudent 5 grade is "+student5grade);
			}
		else if(student5total>= F && student5total<= D)
			{
			student5grade = "F";
			System.out.print("\nStudent 5 grade is "+student5grade);
			}	
		
		System.out.print("\nStudent 6 Score = "+student6total);
		if(student6total>=A)
			{
			student6grade = "A";
			System.out.print("\nstudent 6 grade is "+student6grade);
			}
		else if(student6total>= B && student6total<= A)
			{
			student6grade = "B";
			System.out.print("\nstudent 6 grade is "+student6grade);
			}
		else if(student6total>= C && student6total<= B)
			{
			student6grade = "C";
			System.out.print("\nstudent 6 grade is "+student6grade);
			}	
		else if(student6total>= D && student6total<= C)
			{
			student6grade = "D";
			System.out.print("\nstudent 6 grade is "+student6grade);
			}
		else if(student6total>= F && student6total<= D)
			{
			student6grade = "F";
			System.out.print("\nstudent 6 grade is "+student6grade);
			}		
		
		System.out.print("\nStudent 7 Score = "+student7total);
		if(student7total>=A)
			{
			student7grade = "A";
			System.out.print("\nstudent 7 grade is "+student7grade);
			}
		else if(student7total>= B && student7total<= A)
			{
			student7grade = "B";
			System.out.print("\nstudent 7 grade is "+student7grade);
			}
		else if(student7total>= C && student7total<= B)
			{
			student7grade = "C";
			System.out.print("\nstudent 7 grade is "+student7grade);
			}	
		else if(student7total>= D && student7total<= C)
			{
			student7grade = "D";
			System.out.print("\nstudent 7 grade is "+student7grade);
			}
		else if(student7total>= F && student7total<= D)
			{
			student7grade = "F";
			System.out.print("\nstudent 7 grade is "+student7grade);
			}	
		
		System.out.print("\nStudent 8 Score = "+student8total);
		if(student8total>=A)
			{
			student8grade = "A";
			System.out.print("\nstudent 8 grade is "+student8grade);
			}
		else if(student8total>= B && student8total<= A)
			{
			student8grade = "B";
			System.out.print("\nstudent 8 grade is "+student8grade);
			}
		else if(student8total>= C && student8total<= B)
			{
			student8grade = "C";
			System.out.print("\nstudent 8 grade is "+student8grade);
			}	
		else if(student8total>= D && student8total<= C)
			{
			student8grade = "D";
			System.out.print("\nstudent 8 grade is "+student8grade);
			}
		else if(student8total>= F && student8total<= D)
			{
			student8grade = "F";
			System.out.print("\nstudent 8 grade is "+student8grade);
			}			
		
		System.out.print("\nStudent 9 Score = "+student9total);
		if(student9total>=A)
			{
			student9grade = "A";
			System.out.print("\nstudent 9 grade is "+student9grade);
			}
		else if(student9total>= B && student9total<= A)
			{
			student9grade = "B";
			System.out.print("\nstudent 9 grade is "+student9grade);
			}
		else if(student9total>= C && student9total<= B)
			{
			student9grade = "C";
			System.out.print("\nstudent 9 grade is "+student9grade);
			}	
		else if(student9total>= D && student9total<= C)
			{
			student9grade = "D";
			System.out.print("\nstudent 9 grade is "+student9grade);
			}
		else if(student9total>= F && student9total<= D)
			{
			student9grade = "F";
			System.out.print("\nstudent 9 grade is "+student9grade);
			}	
		
		System.out.print("\nStudent 10 Score = "+student10total);
		if(student10total>=A)
			{
			student10grade = "A";
			System.out.print("\nstudent 10 grade is "+student10grade);
			}
		else if(student10total>= B && student10total<= A)
			{
			student10grade = "B";
			System.out.print("\nstudent 10 grade is "+student10grade);
			}
		else if(student10total>= C && student10total<= B)
			{
			student10grade = "C";
			System.out.print("\nstudent 10 grade is "+student10grade);
			}	
		else if(student10total>= D && student10total<= C)
			{
			student10grade = "D";
			System.out.print("\nstudent 10 grade is "+student10grade);
			}
		else if(student10total>= F && student10total<= D)
			{
			student10grade = "F";
			System.out.print("\nstudent 10 grade is "+student10grade);
			}	
		
			
	}




}
