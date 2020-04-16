package interfaces;

public class Main {

	public static void main(String[] args) {

		Flight lax045 = new Flight();
		
		CrewMember c1 = new CrewMember();
		c1.setName("Pilot");
		CrewMember c2 = new CrewMember();
		c2.setName("Patty");
		
		CrewMember[] crew = {c1, c2};
		
		
		Passenger p1 = new Passenger();
		p1.setName("Bob");
		Passenger p2 = new Passenger();
		p2.setName("Jane");
		
		Passenger[] roster = {p1, p2};
		
		lax045.setCrew(crew);
		lax045.setRoster(roster);
		
		for (Person p : lax045) {
			System.out.println(p.getName());
		}
	}

}
