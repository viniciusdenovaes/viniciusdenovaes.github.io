#include <stdio.h>

int main(){
    float media = 0;
    for(int i=1; i<=10; i++){
        printf("digite o numero %d de 10:\n", i);
        int n;
        scanf("%d", &n);
        if(n<=0){
            i--;
            continue;
        }
        media+=(float)n/10.0;
    }
    printf("media: %f\n", media);
}
