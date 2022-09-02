package com.student;



import java.util.List; 



public interface hotelservice  {

	

	public List<hotels> getHotels();

	public hotels gethotel(int id);

	public hotels addhotel(hotels htl);

	public hotels updatehotel(hotels ht);

	public void deletehotel(int parseInt);
	


}
