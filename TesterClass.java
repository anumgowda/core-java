package com.xworkz.cat.tester;

import com.xworkz.cat.dao.CatDAOImpl;

public class TesterClass {
public static void main(String[] args) {
	CatDAOImpl catimpl=new CatDAOImpl();
	//catimpl.catSaveOperation();
	catimpl.CatReadOperation();
}
}
