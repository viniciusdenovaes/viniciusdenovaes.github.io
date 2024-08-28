#include <stdio.h>
#include <limits.h>

int main(){
    int maior = INT_MIN;
    int menor = INT_MAX;

    int n=0;
    while(n>=0){
        scanf("%d", &n);
        if(n<menor){
            menor = n;
        }
        if(n>maior){
            maior = n;
        }
    }
    if(maior==INT_MIN && menor==INT_MAX){
        printf("Nenhum numero entrado\n");
        return 0;
    }
    printf("menor: %d\n", menor);
    printf("maior: %d\n", maior);
}
