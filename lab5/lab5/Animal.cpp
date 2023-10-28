#include <iostream>
#include <string>
using namespace std;
enum COLOR { Green, Blue, White, Black, Brown };
class Animal {
public:
	Animal() : _name("unknown") {
		cout << "constructing Animal object " << _name << endl;
	}
	Animal(string name, COLOR color) : _name(name), _color(color) {}
	~Animal() {
		cout << "destructing Animal object " << _name << endl;
	}
	virtual void speak() const {
		cout << "Animal speaks " << endl;
	}
	virtual void move() const = 0;
private:
	string _name;
	COLOR _color;
};
class Mammal: public Animal  {
public:
	Mammal(string name, COLOR color): Animal(name, color){
		
	}
	~Mammal(){}
	virtual void eat() const {
		cout << "Mammal eat " << endl;
	}
	void move() const  {
		cout << "Mammal move " << endl;
	}

};
class Dog : public Mammal {
public:
	Dog(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner) {}
	~Dog() {}
	void speak()  const override {
		cout << "Woof " << endl;
	}
	void move() const override {
		cout << "Dog move " << endl;
	}
	void eat() const {
		cout << "Dog eat " << endl;
	}
private:
	string _owner;
};
class Cat : public Mammal {
public:
	Cat(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner) {}
	~Cat() {}
	void speak()  const override {
		cout << "meow " << endl;
	}
	void move() const override {
		cout << "Cat move " << endl;
	}
	void eat() const {
		cout << "Cat eat " << endl;
	}
private:
	string _owner;
};
class Lion : public Mammal {
public:
	Lion(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner) {}
	~Lion() {}
	void speak()  const override {
		cout << "Roar " << endl;
	}
	void move() const override {
		cout << "Lion move " << endl;
	}
	void eat() const {
		cout << "Lion eat " << endl;
	}
private:
	string _owner;
};
int main() {
	int i;
	//Animal *a = new Mammal("hihi", Green);
	Mammal* mammal[] = { new Dog("dogy", White, "zane"), new Cat("cat", Black, "zane"),  new Lion("lion", Brown, "zane")};
	cout << "Select the animal to send to Zoo :" << endl << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
	int choose;
	do {
		cin >> choose;
		switch (choose) {
			case 1:
			case 2:
			case 3:
				choose -= 1;
				mammal[choose]->move();
				mammal[choose]->speak();
				mammal[choose]->eat();
				break;
			case 4:
				for (i = 0; i < 3; ++i) {
					mammal[i]->move();
					mammal[i]->speak();
					mammal[i]->eat();
				}
				break;
			case 5:
				break;

		default:
			cout << "Invalid inout" << endl;
			cin.clear();
			cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
			break;
		}

	} while (choose != 5);
	return 0;
}

