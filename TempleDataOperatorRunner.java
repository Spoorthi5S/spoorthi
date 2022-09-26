class TempleDataOperatorRunner{
	public static void main(String[] gudi)
	{
		System.out.println("main:start aytu");
		
		String temple1="Shiva Temple";
		TempleDataOperator.save(temple1);
		
		TempleDataOperator.save("Ganapathi Temple");
		TempleDataOperator.save("Devi Temple");
		TempleDataOperator.displayDetails();
		System.out.println("main:mugitu");
	}
}
