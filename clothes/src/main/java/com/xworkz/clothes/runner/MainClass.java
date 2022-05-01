package com.xworkz.clothes.runner;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.tools.javac.parser.ReferenceParser.ParseException;
import com.xworkz.clothes.entity.Clothes;
import com.xworkz.clothes.entity.dao.ClothesDAOImpl;

public class MainClass {
public static void main(String[] args) {
	Clothes clothes=new Clothes();
	SimpleDateFormat simpleDateFormate=new SimpleDateFormat("yyyy-mm-dd");
	
	Date date;
	try {
		date=simpleDateFormate.parse("2018-9-9");
		clothes.setManufacturedDate(date);
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}
   clothes.setId(1);
   clothes.setBrand("nike");
   clothes.setPrize(1234.6);
   ClothesDAOImpl clothimpl=new ClothesDAOImpl();
   clothimpl.insertCloth(clothes);
   System.out.println("saved successfully");
 clothimpl.getClothesById(1);  
   clothimpl.updateClothBrandAndPriceById("Nike", 2345.99, 1);
   clothimpl.deleteById(1);
   System.out.println("deleted successfully");
		   
}
}

