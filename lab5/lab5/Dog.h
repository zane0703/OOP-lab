#pragma once
#ifndef Dog_h
#define Dog_h
#include "Mammal.h"
class Dog : public Mammal {
public:
	Dog(string name, COLOR color, string owner);
	~Dog();
	void speak()  const override;
	void move() const override;
	void eat() const override;
private:
	string _owner;
};
#endif // !Dog_j
