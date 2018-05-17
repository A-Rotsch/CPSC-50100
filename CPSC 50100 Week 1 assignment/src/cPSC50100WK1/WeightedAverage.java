package cPSC50100WK1;

public class WeightedAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double grp1test1 = (75*.1);
double grp1test2 = (95*.2);
double grp1test3 = (85*.25);
double grp1test4 = (55*.25);
double grp1test5 = (65*.1);
double grp1test6 = (70*.1);
double grp1wavg = (grp1test1+grp1test2+grp1test3+grp1test4+grp1test5+grp1test6);
double grp2test1 = (55*.05);
double grp2test2 = (65*.1);
double grp2test3 = (65*.15);
double grp2test4 = (60*.25);
double grp2test5 = (55*.25);
double grp2test6 = (50*.2);
double grp2wavg = (grp2test1+grp2test2+grp2test3+grp2test4+grp2test5+grp2test6);
System.out.println("Weighted Average for test group one = "+grp1wavg);
System.out.println("Weighted Average for test group two = "+grp2wavg);
System.out.println("Master Average = "+((grp1wavg+grp2wavg)/2));
	}

}
