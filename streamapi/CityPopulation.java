package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.stream.itemdetails.Item;

class State
{
		int stateid;
		String statename;
		
		public State(int stated, String statename) {
			super();
			this.stateid = stated;
			this.statename = statename;
		}
		public State() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "State [stateid=" + stateid + ", statename=" + statename + "]";
		}		
		
		
}

class City 
{
	int cityid;
	String cityname;
	State objState;
	Float pollutionIndex;
	int population;
	int area_of_city;
	
	public City(int cityid, String cityname, State objState, Float pollutionIndex, int population, int area_of_city) 
	{
		super();
		this.cityid = cityid;
		this.cityname = cityname;
		this.objState = objState;
		this.pollutionIndex = pollutionIndex;
		this.population = population;
		this.area_of_city = area_of_city;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public State getObjState() {
		return objState;
	}
	public void setObjState(State objState) {
		this.objState = objState;
	}
	public Float getPollutionIndex() {
		return pollutionIndex;
	}
	public void setPollutionIndex(Float pollutionIndex) {
		this.pollutionIndex = pollutionIndex;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public int getArea_of_city() {
		return area_of_city;
	}
	public void setArea_of_city(int area_of_city) {
		this.area_of_city = area_of_city;
	}
	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", objState=" + objState + ", pollutionIndex="
				+ pollutionIndex + ", population=" + population + ", area_of_city=" + area_of_city + "]";
	}	
	
	
    
}

public class CityPopulation{

	
	
	

	public static void main(String[] args)
	{
		List<City> list = new ArrayList<>();
		
		//State s = new State(111, "M.P");
		City c1 = new City(1, "bhopal, indore", new State(111, "M.P"), 7.5f, 4225678, 10100);
		City c2 = new City(2, "jaipur", new State(222, "Rajasthan"), 8.6f, 4567899, 1027876);
		City c3 = new City(3, "chennai", new State(333, "T.N"), 6.4f, 9945678, 103876);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		//city with less area and highest population
		Comparator<City> comparator1 = Comparator.comparing( City::getPopulation );
		City highest = list.stream().max(comparator1).get();
		//System.out.println(highest);
		System.out.println("City with highest population is "
				+ ""+highest.cityname+" with population "+ highest.population);
		
		
		Comparator<City> comparator2 = Comparator.comparing( City::getArea_of_city );
		City lessArea = list.stream().min(comparator2).get();
		System.out.println("City with less area is "
				+ ""+lessArea.cityname+" with area "+ lessArea.area_of_city);
		
		//city with high pollution_index and high city area
		Comparator<City> comparator3 = Comparator.comparing( City::getPollutionIndex );
		City highPollutionInd = list.stream().max(comparator3).get();
		
		System.out.println("City with high pollution index is "
				+ ""+highPollutionInd.cityname+" with pollution index "+ highPollutionInd.pollutionIndex);
		
		//for high city area
		City highcityArea = list.stream().max(comparator2).get();
		System.out.println("City with high city area is "
				+ ""+highcityArea.cityname+" with area "+ highcityArea.area_of_city);
		
		//city detail on the basis of lowest pollution_index 
		System.out.println("Sort as per Pollution index");
		List<City> collect = list.stream().sorted(comparator3).collect(Collectors.toList());
		System.out.println(collect);
		
		
		
		//city with lowest pollution index and lowest area of city.
		City lowPollutionInd = list.stream().min(comparator3).get();
		System.out.println("City with lowest pollution index is "
				+ ""+lowPollutionInd.cityname+" with pollution index "+ lowPollutionInd.pollutionIndex);
		//for lowest area of city.
		City lowcityArea = list.stream().min(comparator2).get();
		System.out.println("City with low city area is "
				+ ""+lowcityArea.cityname+" with area "+ lowcityArea.area_of_city);
		
		//number of cities
		long count = list.stream().map(city ->city.getCityname()).count();
		System.out.println(count);
		
		//total area of state
		System.out.println("");
		

	}

	

	

}
