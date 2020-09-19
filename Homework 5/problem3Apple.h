#ifndef apple_hpp
#define apple_hpp

#include <stdio.h>
#include <string>
#include <ctime>
#include "fruit.h"

class Apple : public Fruit {
    public:
    Apple();
    Apple(time_t r);
    void prepare();
};


#endif
