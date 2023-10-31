#include "Mammal.h"
#include "Dog.h"
#include "Cat.h"
#include "Lion.h"

int main() {
	int i;
	//Animal *a = new Mammal("hihi", Green);
	Mammal* mammal[] = { new Dog("dogy", White, "zane"), new Cat("cat", Black, "zane"),  new Lion("lion", Brown, "zane") };
	cout << "Select the animal to send to Zoo :" << endl << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
	int choose;
	do {
		cin >> choose;
		switch (choose) {
		case 1:
		case 2:
		case 3:
			choose -= 1;
			mammal[choose]->move();
			mammal[choose]->speak();
			mammal[choose]->eat();
			break;
		case 4:
			for (i = 0; i < 3; ++i) {
				mammal[i]->move();
				mammal[i]->speak();
				mammal[i]->eat();
			}
			break;
		case 5:
			break;

		default:
			cout << "Invalid inout" << endl;
			cin.clear();
			cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n');
			break;
		}

	} while (choose != 5);
	return 0;
}