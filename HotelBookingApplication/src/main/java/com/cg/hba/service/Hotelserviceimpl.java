package com.student;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Hotelserviceimpl implements hotelservice {
	@Autowired
	private Hoteldoa htdoa;
	/* List<hotels> list; */
	
 
	public Hotelserviceimpl() {
		/*
		 * list=new ArrayList<>();
		 * 
		 * list.add(new hotels(13,"asda","asda","asda", "asda", 65, "asda", "asda",
		 * "asda", "asda")); list.add(new hotels(12,"asda","asda","asda", "asda", 65,
		 * "asda", "asda", "asda", "asda"));
		 */
	}


	@Override
	public List<hotels> getHotels() {
		// TODO Auto-generated method stub
		return htdoa.findAll();
	}


	@Override
	public hotels gethotel(int id) {
		/*
		 * hotels h=null; for(hotels x:list) { if(x.getHotel_id()==id) { h=x; break; }
		 * 
		 * }
		 */
		return htdoa.getOne(id);
		
	}


	@Override
	public hotels addhotel(hotels htl) {
		// TODO Auto-generated method stub
		htdoa.save(htl);
		return htl;
	}


	@Override
	public hotels updatehotel(hotels ht) {
	/*	list.forEach(e->{
			if(e.getHotel_id()==ht.getHotel_id()) {
				e.setAddress(ht.getAddress());
				e.setAvg_rate_per_day(ht.getAvg_rate_per_day());
				e.setCity(ht.getCity());
				e.setDescription(ht.getDescription());
				e.setEmail(ht.getEmail());
				e.setHotel_name(ht.getHotel_name());
				e.setPhone1(ht.getPhone1());
				e.setPhone2(ht.getPhone2());
				e.setWebsite(ht.getWebsite());
				
			}*/
			
	/* }); */
		htdoa.save(ht);
		// TODO Auto-generated method stub
		return ht;
	}


	@Override
	public void deletehotel(int parseInt) {
		// TODO Auto-generated method stub
		/*
		 * list=this.list.stream().filter(e->e.getHotel_id()!=
		 * parseInt).collect(Collectors.toList());
		 */
		hotels entity=htdoa.getOne(parseInt);
		htdoa.delete(entity);
		
	}

}
