#include <stdio.h>

int main(){
    int n=5;
    int count=0, i=1;
    while(count < n){
        if(i%3==0){
            printf("%d\n", i);
            count++;
        }
        i++;
    }
}
