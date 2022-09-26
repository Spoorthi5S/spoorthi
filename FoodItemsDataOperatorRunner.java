class FoodItemsDataOperatorRunner{
	public static void main(String[] snacks)
	{
		System.out.println("main:start aytu");
		String snacks1="Crazy Bhel";
		FoodItemsDataOperator.save(snacks1);
		FoodItemsDataOperator.save("Tikki Puri");
		FoodItemsDataOperator.displayDetails();
		System.out.println("main:mugitu");
	}
}