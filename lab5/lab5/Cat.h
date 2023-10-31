#pragma once
#ifndef Cat_h
#define Cat_h
#include "Mammal.h"
class Cat : public Mammal {
public:
	Cat(string name, COLOR color, string owner);
	~Cat();
	void speak()  const override;
	void move() const override;
	void eat() const override;
private:
	string _owner;
};
#endif // !Cat_h

