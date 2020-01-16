package trans;

// interface contains methons, no fields
// can inherit from multiple interfaces
// methods are protected by default
// methods are defined by the children
//   Parent and child are the only ones that know about it
public interface Animal
{
	void move();
	void eat(int i);
	String Speak();
}
