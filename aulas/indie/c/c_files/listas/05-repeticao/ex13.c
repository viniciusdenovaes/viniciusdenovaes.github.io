#include <stdio.h>

int main(){
    int soma = 0;
    for(int i=1; i<1000; i++){
        if(i%3==0 || i%5==0){
            printf("%d + ", i);
            soma+=i;
        }
    }
    printf("\b\b= %d\n", soma);
}
