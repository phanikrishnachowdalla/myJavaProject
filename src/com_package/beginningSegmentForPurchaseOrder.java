package com_package;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;

public class beginningSegmentForPurchaseOrder {
	


	public static void main(String[] args) {
			
		TransactionSetPurposeCodeLength();
		PurchaseOrderTypeCode();
		PurchaseOrderNumber();
		RealeaseNumber();
		Date();
	}

	private static void TransactionSetPurposeCodeLength()   {
        
		String Example = "BG*020*DS*567891234**20060424*0007961793";
        String[] arrOfStr = Example.split("\\*");

		for (int i=0; i < arrOfStr.length; i++)
		{
		   System.out.println(arrOfStr[i]);
		}
		
		String str0 = arrOfStr[0];
		//System.out.println(str0.length());
		String str1 = arrOfStr[1];
		//System.out.println(str1.length());
		String str2 = arrOfStr[2];
		//System.out.println(str2.length());
		String str3 = arrOfStr[3];
		//System.out.println(str3.length());
		String str4 = arrOfStr[4];
		//System.out.println(str4.length());
		String str5 = arrOfStr[5];
		//System.out.println(str5.length());
		String str6 = arrOfStr[6];
		//System.out.println(str6.length());
		
		//starting with BEG or not
		Boolean boo = Example.startsWith(str0);
		if(boo==true)
		{
			System.out.println("Expression starts with "+str0);
		}
		else
		{
			System.out.println("Expression does not start with "+"BEG");
		}
		
		//Transaction set purpose code length
		if(str1.length()==2)
		{
		    System.out.println("Transaction set purpose code length is two "+str1.length());
 		}
        else
        { 
		    System.out.println("Transaction set purpose code length is not two "+str1.length());
		}
			
		//Transaction set purpose code validation
		if(str1.contains("00"))
		{
		    System.out.println("Transaction set purpose code contains a valid code "+str1);
		}
		else
		{
		    System.out.println("Transaction set purpose code contains a in-valid code "+str1);
		}
			  
		//Transaction set purpose code (Mandatory)
		if(str1.isEmpty())
		{
		    System.out.println("The element is not present "+str1);
		}
		else
		{
		    System.out.println("The element is present "+str1);
		}
		System.out.println("************************************************************************************");	
			 
	}
	
	private static void PurchaseOrderTypeCode() {
		
		String Example = "BEG*00*S*567891234**20060424*0007961793";
        String[] arrOfStr = Example.split("\\*");

		for (int i=0; i < arrOfStr.length; i++)
		{
		   System.out.println(arrOfStr[i]);
		}
		
		String str0 = arrOfStr[0];
		//System.out.println(str0.length());
		String str1 = arrOfStr[1];
		//System.out.println(str1.length());
		String str2 = arrOfStr[2];
		//System.out.println(str2.length());
		String str3 = arrOfStr[3];
		//System.out.println(str3.length());
		String str4 = arrOfStr[4];
		//System.out.println(str4.length());
		String str5 = arrOfStr[5];
		//System.out.println(str5.length());
		String str6 = arrOfStr[6];
		//System.out.println(str6.length());
		
		//starting with BEG or not
		Boolean boo = Example.startsWith(str0);
		if(boo==true)
		{
			System.out.println("Expression starts with "+str0);
		}
		else
		{
			System.out.println("Expression does not start with "+"BEG");
		}
		
		//Purchase Order type code length
		if(str2.length()==2) {
			System.out.println("Purchase Order type code length is two: "+str2.length());
		}
		else
		{
			System.out.println("Purchase Order type code length is not two: "+str2.length());
		}
		
		//Purchase Order Type code validation
		if(str2.equalsIgnoreCase("DS") || str2.equalsIgnoreCase("SA"))
		{
			System.out.println("Purchase order type code is valid code "+str2);
		}
		else
		{
			System.out.println("Purchase order type code is not a valid code "+str2);
		}
		
		//Purchase Order Type code (Mandatory)
		if(str2.isEmpty())
		{
			System.out.println("Purchase order type code element is not present "+str2);
		}
		else
		{
			System.out.println("Purchase order type code element is present "+str2);
		}
		System.out.println("************************************************************************************");	
		
	}
	
	private static void PurchaseOrderNumber()
	{
		String Example = "BEG*00*DS*567891234**20060424*0007961793";
        String[] arrOfStr = Example.split("\\*");

		for (int i=0; i < arrOfStr.length; i++)
		{
		   System.out.println(arrOfStr[i]);
		}
		
		String str0 = arrOfStr[0];
		//System.out.println(str0.length());
		String str1 = arrOfStr[1];
		//System.out.println(str1.length());
		String str2 = arrOfStr[2];
		//System.out.println(str2.length());
		String str3 = arrOfStr[3];
		//System.out.println(str3.length());
		String str4 = arrOfStr[4];
		//System.out.println(str4.length());
		String str5 = arrOfStr[5];
		//System.out.println(str5.length());
		String str6 = arrOfStr[6];
		//System.out.println(str6.length());
		
		//starting with BEG or not
		Boolean boo = Example.startsWith(str0);
		if(boo==true)
		{
			System.out.println("Expression starts with "+str0);
		}
		else
		{
			System.out.println("Expression does not start with "+"BEG");
		}
		
		//Purchase Order Number length
		if(str3.length()>3 || str3.length()<23)
		{
			System.out.println("Purchase order number is of valid length "+str3.length());
		}
		else
		{
			System.out.println("Purchase order number is of invalid length "+str3.length());
		}
		
		//Purchase Order Number (Mandatory)
		if(str3.isEmpty() || str3 == null)
		{
			System.out.println("Purchase order number is not present "+str3);
		}
		else
		{
			System.out.println("Purchase order number is present "+str3);
		}
		System.out.println("***********************************************************************************");
		
	}
	
	private static void RealeaseNumber()
	{
		String Example = "BEG*00*DS*567891234**20060424*0007961793";
        String[] arrOfStr = Example.split("\\*");

		for (int i=0; i < arrOfStr.length; i++)
		{
		   System.out.println(arrOfStr[i]);
		}
		
		String str0 = arrOfStr[0];
		//System.out.println(str0.length());
		String str1 = arrOfStr[1];
		//System.out.println(str1.length());
		String str2 = arrOfStr[2];
		//System.out.println(str2.length());
		String str3 = arrOfStr[3];
		//System.out.println(str3.length());
		String str4 = arrOfStr[4];
		//System.out.println(str4.length());
		String str5 = arrOfStr[5];
		//System.out.println(str5.length());
		String str6 = arrOfStr[6];
		//System.out.println(str6.length());
		
		//starting with BEG or not
		Boolean boo = Example.startsWith(str0);
		if(boo==true)
		{
			System.out.println("Expression starts with "+str0);
		}
		else
		{
			System.out.println("Expression does not start with "+"BEG");
		}
		
		//Release Number is optional
		if(str4.isEmpty() && str4!=null)
		{
			System.out.println("Release number is optional "+str4);
		}
		
		//Release Number length
		if(str4.length()>1 || str4.length()<31)
		{
			System.out.println("Release number is of valid length "+str4.length());
		}
		else
		{
			System.out.println("Release number is of invalid length "+str4.length());
		}
		System.out.println("************************************************************************************");	
		
	}
	
	private static void ContactNumber()
	{
		String Example = "BEG*00*DS*567891234**20060424*0007961793";
        String[] arrOfStr = Example.split("\\*");

		for (int i=0; i < arrOfStr.length; i++)
		{
		   System.out.println(arrOfStr[i]);
		}
		
		String str0 = arrOfStr[0];
		//System.out.println(str0.length());
		String str1 = arrOfStr[1];
		//System.out.println(str1.length());
		String str2 = arrOfStr[2];
		//System.out.println(str2.length());
		String str3 = arrOfStr[3];
		//System.out.println(str3.length());
		String str4 = arrOfStr[4];
		//System.out.println(str4.length());
		String str5 = arrOfStr[5];
		//System.out.println(str5.length());
		String str6 = arrOfStr[6];
		//System.out.println(str6.length());
		
		//starting with BEG or not
		Boolean boo = Example.startsWith(str0);
		if(boo==true)
		{
			System.out.println("Expression starts with "+str0);
		}
		else
		{
			System.out.println("Expression does not start with "+"BEG");
		}
		
		//Contact number length
		if(str6.length()>0 || str6.length()<31)
		{
			System.out.println("Contact number is of valid length "+str6.length());
		}
		else
		{
			System.out.println("Contact number is of invalid length "+str6.length());
		}
		
		//Contact number is Optional
		if(str6.isEmpty() && str6!=null)
		{
			System.out.println("Contact number is optional "+str6);
		}
		System.out.println("************************************************************************************");
		
	}
	
	private static void Date()
	{
		String Example = "BEG*00*DS*567891234**20060424*0007961793";
        String[] arrOfStr = Example.split("\\*");

		for (int i=0; i < arrOfStr.length; i++)
		{
		   System.out.println(arrOfStr[i]);
		}
		
		String str0 = arrOfStr[0];
		//System.out.println(str0.length());
		String str1 = arrOfStr[1];
		//System.out.println(str1.length());
		String str2 = arrOfStr[2];
		//System.out.println(str2.length());
		String str3 = arrOfStr[3];
		//System.out.println(str3.length());
		String str4 = arrOfStr[4];
		//System.out.println(str4.length());
		String str5 = arrOfStr[5];
		//System.out.println(str5.length());
		String str6 = arrOfStr[6];
		//System.out.println(str6.length());
		
		//starting with BEG or not
		Boolean boo = Example.startsWith(str0);
		if(boo==true)
		{
			System.out.println("Expression starts with "+str0);
		}
		else
		{
			System.out.println("Expression does not start with "+"BEG");
		}
		
//		//Date is Mandatory
//		private static final DateTimeFormatter 
//		DATE_PARSER = new DateTimeFormatterBuilder().appendPattern("yyyyMMdd").parseDefaulting(ChronoField.ERA, IsoEra.CE.getValue()).toFormatter(Locale.ROOT).withResolverStyle(ResolverStyle.STRICT);/** @throws DateTimeParseException if the input date is invalid */
//		public static void verifyInput(String input) 
//		{    
//		    LocalDate.parse(input, DATE_PARSER);
//		}
		
		//Date field is mandatory
		if(str5!=null)
		{
			System.out.println("Date format field is present "+str5);
		}
		else
		{
			System.out.println("Date format field is not present "+str5);
		}
		
		//Date field length
		if(str5.length()==8)
		{
			System.out.println("Date field is of valid length "+str5.length());
		}
		else
		{
			System.out.println("Date field is of invalid length "+str5.length());
		}
		
		//Date field format 
//     	private static boolean validateDateFormat(String formatPattern, String dateString) 
//     	{
//		// TODO Auto-generated method stub
//		String formatPattern1 = "YYYYMMDD";
//		String dateString1 = "str5";
//
//		boolean isValidFormat = validateDateFormat(formatPattern1, dateString1);
//		System.out.println("Is the date format valid? " + isValidFormat);
//		return false;
		
//     	}
	}
}


