#include "Cat.h"

Cat ::Cat(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner) {}
Cat ::~Cat() {}
void Cat::speak()  const {
	cout << "meow " << endl;
}
void Cat::move() const {
	cout << "Cat move " << endl;
}
void Cat::eat() const {
	cout << "Cat eat " << endl;
}
