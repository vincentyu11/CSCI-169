#include "vegetable.h"
#include <iostream>
#include <stdio.h>
#include <string>
#include <ctime>
#include <time.h>

Vegetable::Vegetable() {
    name = "";
    expiration = 0;
    std::cout <<"Vegetable constructor called.\n";
}

Vegetable::Vegetable(std::string n, time_t exp) {
    name = n;
    expiration = exp;
    std::cout <<"Vegetable constructor called.\n";
}

void Vegetable::expireTime() {
    struct tm * timeinfo;
    timeinfo = localtime(&expiration);
    std::cout <<name <<" expires on: " <<asctime(timeinfo);
}
