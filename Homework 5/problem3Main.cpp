#include <iostream>
#include <stdio.h>
#include <string>
#include <ctime>
#include <time.h>
#include "orange.h"
#include "apple.h"
#include "tomato.h"
using namespace std;

int main(int argc, const char * argv[]) {
    time_t ttime = 909099990;
    Tomato t = Tomato(ttime+123123123, ttime);
    t.prepare();
    t.ripeTime();
    t.expireTime();
    return 0;
}
