#include <iostream>
#include <chrono>
#include <thread>
int main()
{
    unsigned long long tick=1;
    std::cout << "[Yocto Project][THIS_IMAGE] is designed by moatasem" << std::endl;
    std::cout << "This Program is just to say hello " << std::endl;
    while (tick)
    {
        std::cout << "uptime is "<<tick-1 <<" seconds "<<std::endl;
        
        std::this_thread::sleep_for(std::chrono::milliseconds(2000));
        tick+=2;
    }
    return 0;
}