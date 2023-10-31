#include <iostream>
#include <string>
#include "Animal.h"

Animal::Animal() : _name("unknown") {
	cout << "constructing Animal object " << _name << endl;
}
Animal::Animal(string name, COLOR color) : _name(name), _color(color) {}
Animal::~Animal() {
	cout << "destructing Animal object " << _name << endl;
}
void Animal::speak() const{
	cout << "Animal speaks " << endl;
}


