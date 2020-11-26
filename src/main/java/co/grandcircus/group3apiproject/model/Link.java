package co.grandcircus.group3apiproject.model;

public class Link {

	private NavLink first;
	private NavLink prev;
	private NavLink self;
	private NavLink next;
	private NavLink last;
	
	public NavLink getFirst() {
		return first;
	}
	public void setFirst(NavLink first) {
		this.first = first;
	}
	public NavLink getSelf() {
		return self;
	}
	public void setSelf(NavLink self) {
		this.self = self;
	}
	public NavLink getNext() {
		return next;
	}
	public void setNext(NavLink next) {
		this.next = next;
	}
	public NavLink getLast() {
		return last;
	}
	public void setLast(NavLink last) {
		this.last = last;
	}	
	public NavLink getPrev() {
		return prev;
	}
	public void setPrev(NavLink prev) {
		this.prev = prev;
	}
	@Override
	public String toString() {
		return "Link [first=" + first + ", prev=" + prev + ", self=" + self + ", next=" + next + ", last=" + last + "]";
	}

	
}
