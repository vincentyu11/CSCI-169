#ifndef tomato_hpp
#define tomato_hpp

#include <stdio.h>
#include <string>
#include <ctime>
#include "vegetable.h"
#include "fruit.h"

class Tomato : public Vegetable, public Fruit {
    public:
    Tomato();
    Tomato(time_t exp, time_t r);
};

#endif
