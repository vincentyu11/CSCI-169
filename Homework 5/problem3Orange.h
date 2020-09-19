#ifndef orange_hpp
#define orange_hpp

#include <stdio.h>
#include <string>
#include <ctime>
#include "fruit.h"

class Orange : public Fruit {
    public:
    Orange();
    Orange(time_t r);
    void prepare();
};


#endif
