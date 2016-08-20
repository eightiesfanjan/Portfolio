public class SalariedEmployee extends Employee
{
   private double weeklySalary;

   // constructor
   public SalariedEmployee(String firstName, String lastName,
      String socialSecurityNumber, double weeklySalary)
   {
      super(firstName, lastName, socialSecurityNumber);

      if (weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   }


   // set salary
   public void setWeeklySalary(double weeklySalary)
   {
      if (weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   }

   // return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   }

   // calculate earnings; override abstract method earnings in Employee
   @Override
   public double earnings()
   {
      return getWeeklySalary();
   }

    //copy constructor
   public SalariedEmployee (SalariedEmployee e)
   {
	   super(e);
	   weeklySalary=e.weeklySalary;
   }

   // return String representation of SalariedEmployee object
   @Override
   public String toString()
   {
      return String.format("salaried employee: %s%n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary());
   }

   @Override
   public boolean equals (Object otherObject)
   {

	if (otherObject == null)
	{
		return false;
	}

   	if (!(otherObject instanceof Employee))
   	{
   		return false;
   	}

   	SalariedEmployee other= (SalariedEmployee) otherObject;

   	return (super.equals(otherObject) && weeklySalary==other.weeklySalary);
   	}
} // end class SalariedEmployee
