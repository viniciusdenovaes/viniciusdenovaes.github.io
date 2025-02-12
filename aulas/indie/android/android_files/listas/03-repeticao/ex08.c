#include <stdio.h>

int main(){
    int n;
    scanf("%d", &n);

    float media = 0;
    for(int i=1; i<=n; i++){
        printf("digite o numero %d de 10:\n", i);
        int numero;
        scanf("%d", &numero);
        media+=(float)numero/(float)n;
    }
    printf("media: %f\n", media);
}
