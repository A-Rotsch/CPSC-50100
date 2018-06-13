import java.text.NumberFormat;

public class PaidAdvisor extends Person {
		
		private double regularPayRate;
		private double specialPayRate; 
		private double overtimePayRate;
		private double noOverTime = 0;
		private double specialHours;	
		private double hoursWorked;	
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		public void setRateHours(double regularPR, double otimePayRate, double sPayRate)
		{
			regularPayRate = regularPR;
			overtimePayRate = otimePayRate;
			specialPayRate = sPayRate;
		}
		
		
		public double getHoursWorked()
		{
			return hoursWorked;
		}
		
		public void setHoursWorked(double hours)
		{
			hoursWorked = hours;
		}
		
		public double getSpecialHours()
		{
			return specialHours;
		}
		
		public void setSpecialHours(double specHours)
		{
			specialHours = specHours;
		}
		
		public double getOverTimeHours()
		{
			if (((hoursWorked-30)-specialHours)>0)
			{
				return ((hoursWorked-30)-specialHours);
			}
			else
			{
				return (double) noOverTime;
			}
				
		}
		
		public double getRegularHoursWorked()
		{
			return ((hoursWorked-getOverTimeHours())-getSpecialHours());
		}
		
		public double getOverTimePay()
		{
			if(((hoursWorked-30)-specialHours)>0)
			{
				return ((hoursWorked-30)-specialHours)*overtimePayRate;
			}
			else
			{
				return (double) noOverTime;
			}
			
		}
		
		public double getRegularPay ()
		{
			return (double) (((getHoursWorked()-getOverTimeHours())-getSpecialHours())*regularPayRate);
		}
		
		public double getSpecialPay ()
		{
			return (double) (getSpecialHours()*specialPayRate);
		}
		
		public double getCalculatePay()
		{
			return (double) (getRegularPay()+getOverTimePay()+getSpecialPay());
		}
		
		public String toString1()
		{
			return ("Paid Advisor " + toString() + " Total Hours worked " + getHoursWorked() + " Regular Hours worked " + getRegularHoursWorked() + " Over Time Hours Worked " + getOverTimeHours() + 
					" Special Hours Worked " + getSpecialHours() + " Total Pay " + fmt.format(getCalculatePay()) );
		}
		

	}

