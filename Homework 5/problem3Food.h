#ifndef food_h
#define food_h

#include <stdio.h>
#include <string>

class Food {
    public:
    std::string name;
    Food();
    Food(std::string n);
    void prepare();
};


#endif
