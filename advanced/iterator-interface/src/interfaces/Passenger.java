package interfaces;

public class Passenger extends Person implements Comparable<Passenger> {

	private int checkedBags;
	private int memberLevel;
	private int memberDays;
	
	public Passenger() {
		
	}
	
	public Passenger(int freeBags) {
		this.freeBags = freeBags;
	}
	
	public Passenger(int freeBags, int checkdBags) {
		this(freeBags);
		this.checkedBags = checkdBags;
	}
	
	
	private int freeBags;
	public int getFreeBags() {
		return freeBags;
	}

	public void setFreeBags(int freeBags) {
		this.freeBags = freeBags;
	}

	public int getCheckedBags() {
		return checkedBags;
	}

	public void setCheckedBags(int checkedBags) {
		this.checkedBags = checkedBags;
	}

	public int getMemberLevel() {
		return memberLevel;
	}

	public void setMemberLevel(int memberLevel) {
		this.memberLevel = memberLevel;
	}

	public int getMemberDays() {
		return memberDays;
	}

	public void setMemberDays(int memberDays) {
		this.memberDays = memberDays;
	}

	@Override
	public int compareTo(Passenger p) {
		if (memberLevel > p.memberLevel) {
			return -1;
		} else if (memberLevel < p.memberLevel) {
			return 1;
		} else {
			if (memberDays > p.memberDays) {
				return -1;
			} else if (memberDays < p.memberDays) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
