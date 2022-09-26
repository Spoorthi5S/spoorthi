class PoliticianDataOperatorRunner{
	public static void main(String[] politics)
	{
		System.out.println("main :start aytu");
		String politician1="Basavaraj Bommai";
		PoliticianDataOperator.save(politician1);
		PoliticianDataOperator.save("BS Yediyurappa");
		PoliticianDataOperator.save("DK Shivakumar");
		PoliticianDataOperator.displayDetails();
		System.out.println("main:mugitu");
	}
}