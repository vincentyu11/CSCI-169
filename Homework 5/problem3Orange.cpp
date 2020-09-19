#include "orange.h"
#include <iostream>
#include "fruit.h"
#include <stdio.h>
#include <string>

Orange::Orange() {
    name = "Orange";
    ripe = 0;
    std::cout <<"Orange constructor called.\n";
}

Orange::Orange(time_t r) {
    ripe = r;
    name = "orange";
    std::cout <<"Orange constructor called.\n";
}

void Orange::prepare() {
    std::cout <<"Peel the orange.\n";
}
