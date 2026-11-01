class Main {
}

interface Item {
	public void print();
}

class Book implements Item {
  String title;
  public Book(String s) { title = s; }
	public void print() { System.out.println(title); }
}

class Backpack implements Item {
  List<Item> items;
  public Backpack(List<Item> b) { items = b; }
	public void print() {
		System.out.println("Backpack");
		items.forEach(it -> it.print());
	}
}

var backpack =
  new Backpack(List.of(
    new Book("Design Patterns"),
    new Book("Calculus I"),
    new Backpack(List.of(
      new Book("Comp Org")
    )),
    new Book("Intro to Opera")
  ))
/*
Backpack: 
  Design Patterns
  Calculus I
  Backpack: 
    Comp Org
  Intro to Opera
*/

