#include "Lion.h"
Lion::Lion(string name, COLOR color, string owner) : Mammal(name, color), _owner(owner) {}
Lion::~Lion() {}
void Lion::speak()  const  {
	cout << "Roar " << endl;
}
void Lion::move() const  {
	cout << "Lion move " << endl;
}
void Lion::eat() const {
		cout << "Lion eat " << endl;
}
