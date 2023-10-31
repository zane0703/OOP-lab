#include "Mammal.h"
Mammal::Mammal(string name, COLOR color) : Animal(name, color) {}
Mammal::~Mammal() {}
void Mammal::eat() const {
	cout << "Mammal eat " << endl;
}
void Mammal::move() const {
	cout << "Mammal move " << endl;
}
