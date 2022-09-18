class Person{
	static void work(String company,double salary)
	{
		System.out.println("entered work String,double");
		System.out.println("company: "+company);
		System.out.println("salary: "+salary);
		if(company=="Wipro" &&   salary==25000)
		{
			System.out.println("company and salary: "+company + salary);
		}
	}
	static void work(String company,double salary,String destination)
	{
		System.out.println("entered work String,double,String");
		System.out.println("company: "+ company);
		System.out.println("salary: "+ salary);
		System.out.println("destination: "+ destination);
		if(company=="Xworkz" && salary==30000 && destination=="Trainee")
		{
			System.out.println("company and salary and destination:"+company + salary + destination);
		}
	}
}	