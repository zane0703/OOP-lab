#ifndef Lion_h
#define Lion_h
#include "Mammal.h"
class Lion : public Mammal {
public:
	Lion(string name, COLOR color, string owner);
	~Lion();
	void speak()  const override;
	void move() const override;
	void eat() const override;
private:
	string _owner;
};
#endif // !Lion_h
