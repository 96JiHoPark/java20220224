package chap11.book.s110301;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member) obj;
			return id.equals(m.id);
		}
		return false;
	}
}
