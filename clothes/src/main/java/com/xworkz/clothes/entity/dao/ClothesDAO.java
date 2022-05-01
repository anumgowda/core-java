package com.xworkz.clothes.entity.dao;

import com.xworkz.clothes.entity.Clothes;

public interface ClothesDAO {
	public  void insertCloth(Clothes clothes);
	public Clothes getClothesById(Integer clothId);
	public void updateClothBrandAndPriceById(String brand,Double price,Integer Id);
	public void deleteById(Integer Id);
	

}
