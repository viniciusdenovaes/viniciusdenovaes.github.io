#include <stdio.h>

int main(){
    int ultimo = 1;
    int n_1=0;
    int n;
    scanf("%d", &n);
    printf("%d-esimo termo: %d\n", 1, n_1);
    printf("%d-esimo termo: %d\n", 2, ultimo);
    for(int i=3; i<=n; i++){
        
        int ultimo_tmp = ultimo;
        
        ultimo = ultimo+n_1;
        n_1=ultimo_tmp;
        
        printf("%d-esimo termo: %d\n", i, ultimo);
    }
}
