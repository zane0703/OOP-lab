#include "Dog.h"

Dog::Dog(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner) {}
Dog::~Dog() {}
void Dog::speak()  const {
	cout << "Woof " << endl;
}
void Dog::move() const {
	cout << "Dog move " << endl;
}
void Dog::eat() const {
	cout << "Dog eat " << endl;
}
