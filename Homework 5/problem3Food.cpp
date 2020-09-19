#include "food.h"
#include <iostream>
#include <stdio.h>
#include <string>

Food::Food() {
    name = "";
    std::cout <<"Food constructor called.\n";
}

Food::Food(std::string n) {
    name = n;
    std::cout <<"Food constructor called.\n";
}

void Food::prepare() {
    std::cout <<"Prepare the " <<name <<".\n";
}
