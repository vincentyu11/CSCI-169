#ifndef vegetable_hpp
#define vegetable_hpp

#include <stdio.h>
#include <string>
#include <ctime>
#include "food.h"

class Vegetable : virtual public Food {
    public:
    time_t expiration;
    Vegetable();
    Vegetable(std::string n, time_t exp);
    void expireTime();
};


#endif

