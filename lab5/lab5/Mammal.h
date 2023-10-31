
#ifndef Mammal_h
#define Mammal_h
#include "Animal.h"
class Mammal : public Animal {
public:
	Mammal(string name, COLOR color);
	~Mammal();
	virtual void eat() const;
	void move() const;
};
#endif