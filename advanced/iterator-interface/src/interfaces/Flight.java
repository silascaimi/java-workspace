package interfaces;

import java.util.Iterator;

public class Flight implements Iterable<Person>, Comparable<Flight> {
	
	int seats = 150;
	int passengers;
	private int flightTime;
	private CrewMember[] crew;
	private Passenger[] roster;
	
	public Flight() {
		
	}
	
	@Override
	public int compareTo(Flight f) {
		return flightTime - f.flightTime;
	}
	
	@Override
	public Iterator<Person> iterator() {
		return new Iterator<Person>() {
			private int index = 0;

			@Override
			public boolean hasNext() {
				return index < (crew.length + roster.length);
			}

			@Override
			public Person next() {
				Person p = (index < crew.length) ? crew[index] : roster[index - crew.length];
				index++;
				return p;
			}	
		};
	}
	
	public void add1Passenger() {
		if (hasSeating()) {
			passengers += 1;
		} else {
			handleTooMany();
		}
	}
	
	private void handleTooMany() {
		System.out.println("Have no free seats");
	}

	private boolean hasSeating() {
		return passengers < getSeats();
	}

	private int getSeats() {
		return seats;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(int flightTime) {
		this.flightTime = flightTime;
	}

	public CrewMember[] getCrew() {
		return crew;
	}

	public void setCrew(CrewMember[] crew) {
		this.crew = crew;
	}

	public Passenger[] getRoster() {
		return roster;
	}

	public void setRoster(Passenger[] roster) {
		this.roster = roster;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}


}
