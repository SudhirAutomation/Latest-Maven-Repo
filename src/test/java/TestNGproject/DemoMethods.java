package TestNGproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

import junit.framework.Assert;


public class DemoMethods {


	public static void alphabaticalOrderSortingValidation(ArrayList<String> namesBeforeSorting,String pageTitle) {
		ArrayList<String> namesAftersorted=new ArrayList<String>();
		Collections.sort(namesBeforeSorting);
		for(int i=0;i<namesBeforeSorting.size();i++) {
			namesAftersorted.add(namesBeforeSorting.get(i));
		}

		for(int i=0;i<namesBeforeSorting.size();i++) {
			Assert.assertEquals(namesAftersorted.get(i), namesBeforeSorting.get(i));
		}
		System.out.println("======= Names are in alphabatical order for this Group ID in : "+pageTitle+" Screen =======");
	}
	
	public static void chronologicalOrderSortingValidation(ArrayList<String> datesBeforeSorting,String pageTitle) throws ParseException {
		ArrayList<Date> datesAftersorted=new ArrayList<Date>();
		ArrayList<String> datesAftersorting=new ArrayList<String>();
		System.out.println("dates before sorting : "+datesBeforeSorting);
		SimpleDateFormat sd=new SimpleDateFormat("MM/dd/yyyy");
		for(String s:datesBeforeSorting) {
		Date d=sd.parse(s);
		datesAftersorted.add(d);
		}
		Collections.sort(datesAftersorted);
		Collections.reverse(datesAftersorted);
		//Collections.sort(datesAftersorted, new Comparator<Date>() {
//			@Override
//			public int compare(Date o1, Date o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2);
//			}
//		});
//		for(int i=0;i<datesAftersorted.size();i++) {
//			System.out.println(datesAftersorted.get(i).toString());
//		}
		
		for(Date p:datesAftersorted) {
			String date=sd.format(p);
			datesAftersorting.add(date);
		}
		Assert.assertEquals(datesBeforeSorting, datesAftersorting);
		System.out.println("======= Names are in alphabatical order for this Group ID in : "+pageTitle+" Screen =======");
	}

}	

