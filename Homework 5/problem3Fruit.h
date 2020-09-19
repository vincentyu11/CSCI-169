#ifndef fruit_hpp
#define fruit_hpp

#include <stdio.h>
#include <string>
#include <ctime>
#include "food.h"

class Fruit : virtual public Food{
    public:
    time_t ripe;
    Fruit();
    Fruit(std::string n, time_t r);
    void ripeTime();
};


#endif
