#include "fruit.h"
#include <iostream>
#include <stdio.h>
#include <string>
#include <ctime>
#include <time.h>

Fruit::Fruit() {
    name = "";
    ripe = 0;
    std::cout <<"Fruit constructor called.\n";
}

Fruit::Fruit(std::string n, time_t r) {
    ripe = r;
    name = n;
    std::cout <<"Fruit constructor called.\n";
}

void Fruit::ripeTime() {
    struct tm * timeinfo;
    timeinfo = localtime(&ripe);
    std::cout <<"You can eat it on: " <<asctime(timeinfo);
}
