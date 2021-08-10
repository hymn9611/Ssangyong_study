package sql.practice2.location;

import java.util.ArrayList;

public class LocationController {
	private LocationDAO locationDAO;
	private LocationView locationView;
	
	public LocationController() {
		locationDAO = new LocationDAO();
		locationView = new LocationView();
	}
	
	public void start() {
		//getCount()
//		int count = locationDAO.getCount();
//		locationView.view(count);
		
		//getSearch()
//		ArrayList<LocationDTO> ar = locationDAO.getSearch("Vi");
//		locationView.view(ar);
		
		//getOne()
//		LocationDTO locationDTO = locationDAO.getOne(1000);
//		locationView.view(locationDTO);
		
		//getList()
		ArrayList<LocationDTO> ar = locationDAO.getList();
		locationView.view(ar);
		
	}


}
