#include "tomato.h"
#include <iostream>
#include <stdio.h>
#include <string>
#include <ctime>
#include <time.h>

Tomato::Tomato() {
    name = "Tomato";
    ripe = 0;
    expiration = 0;
    std::cout <<"Tomato constructor called.\n";
}

Tomato::Tomato(time_t exp, time_t r) {
    name = "Tomato";
    ripe = r;
    expiration = exp;
    std::cout <<"Tomato constructor called.\n";
}
