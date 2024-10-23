#include <stdio.h>
#include <string.h>

struct compra{
    char produto[100];
    int quantidade;
    int preco_total;
};

int main(){

    struct compra compras[100];
    int n=3;

    strcpy(compras[0].produto, "ovo");
    compras[0].quantidade = 2;
    compras[0].preco_total = 4;

    strcpy(compras[1].produto, "leite");
    compras[1].quantidade = 1;
    compras[1].preco_total = 6;

    strcpy(compras[2].produto, "ovo");
    compras[2].quantidade = 12;
    compras[2].preco_total = 10;


    // Coloque o nome do arquivo aqui
    FILE* fp = fopen("compras_output.csv", "w");
    if (!fp){
        printf("Can't open file\n");
    }

    else {
        fprintf(fp,"nome;quantidade;preco_total\n");
        for(int i=0; i<n; i++){
            fprintf(fp,"%s;%d;%d\n", compras[i].produto, compras[i].quantidade, compras[i].preco_total);
        }
    }
    return 0;
}
