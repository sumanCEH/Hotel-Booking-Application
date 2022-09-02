package com.capgemini.entity.service;



import java.util.List;

import com.capgemini.entity.hotels; 



public interface hotelservice  {

	

	public List<hotels> getHotels();

	public hotels gethotel(int id);

	public hotels addhotel(hotels htl);

	public hotels updatehotel(hotels ht);

	public void deletehotel(int parseInt);
	


}
