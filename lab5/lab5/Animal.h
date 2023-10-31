#include <iostream>
#include <string>
using namespace std;
#ifndef Animal_h
#define Animal_h
enum COLOR { Green, Blue, White, Black, Brown };
class Animal {
public:
	Animal();
	Animal(string name, COLOR color);
	~Animal();
	virtual void speak() const;
	virtual void move() const = 0;
private:
	string _name;
	COLOR _color;
};
#endif // !Animal_h

