class GraduateDataOperatorRunner{
	public static void main(String[] student)
	{
		System.out.println("main: information beku");
		String graduate1="Spoorthi ECE 8.1";
		GraduateDataOperator.save(graduate1);
		GraduateDataOperator.save("Shwetha B CSE 8.7");
		GraduateDataOperator.save("Sharadha Mech 7.5");
		GraduateDataOperator.displayDetails();
		System.out.println("main: information saku");
	}
}