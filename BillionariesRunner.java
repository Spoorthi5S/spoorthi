class BillionariesRunner{
	public static void main(String[] args)
	{
		System.out.println("main: information beku");
		String billionaries1="MukeshAmbani";
		Billionaries.save(billionaries1);
		Billionaries.save("ShivNadar");
		Billionaries.save("GautamAdani");
		Billionaries.save("AzimPremji");
		Billionaries.save("UdayKotak");
		Billionaries.save("CyrusPoonawalla");
		Billionaries.save("KumarBirla");
		Billionaries.save("LakshmiMittal");
		Billionaries.save("SavitriJindal");
		Billionaries.save("AshwinDani");
		Billionaries.displayDetails();
		Billionaries.update("AshwinDani","AjayPiramal");
		Billionaries.update(2,"PankajPatel");
		boolean delete=Billionaries.deleteBillionaries("UdayKotak");
		System.out.println("billionaries deleted:"+delete);
		boolean found=Billionaries.findBillionaries("GautamAdani");
		System.out.println("billionaries found:"+found);
		System.out.println("main: information saku");
	}
}