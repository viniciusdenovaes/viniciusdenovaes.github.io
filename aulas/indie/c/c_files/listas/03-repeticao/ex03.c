#include <stdio.h>

int main(){
    int n;
    scanf("%d", &n);
    int count=0, i=1;
    while(count < n){
        if(i%2==1){
            printf("%d\n", i);
            count++;
        }
        i++;
    }
}