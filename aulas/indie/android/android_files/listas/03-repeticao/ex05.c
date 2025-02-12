#include <stdio.h>

int main(){
    int n;
    scanf("%d", &n);
    int count=0, i=1;
    int soma=0;
    while(count < n){
        if(i%2==0){
            soma += i;
            count++;
        }
        i++;
    }
    printf("%d\n", soma);
}
