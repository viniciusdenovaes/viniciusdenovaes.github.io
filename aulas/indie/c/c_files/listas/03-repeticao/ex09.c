#include <stdio.h>
#include <limits.h>

int main(){
    float maior = INT_MIN;
    float menor = INT_MAX;

    for(int i=1; i<=10; i++){
        printf("digite o numero %d de 10:\n", i);
        float n;
        scanf("%f", &n);
        if(n<menor){
            menor = n;
        }
        if(n>maior){
            maior = n;
        }
    }
    printf("menor: %f\n", menor);
    printf("maior: %f\n", maior);
}
