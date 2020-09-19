#include "apple.h"
#include <iostream>
#include "fruit.h"
#include <stdio.h>
#include <string>

Apple::Apple() {
    name = "Apple";
    ripe = 0;
    std::cout <<"Apple constructor called.\n";
}

Apple::Apple(time_t r) {
    ripe = r;
    name = "orange";
    std::cout <<"Apple constructor called.\n";
}

void Apple::prepare() {
    std::cout <<"Core the apple.\n";
}
