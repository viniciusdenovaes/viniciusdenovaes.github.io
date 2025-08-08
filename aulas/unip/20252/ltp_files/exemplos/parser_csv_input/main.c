#include <stdio.h>
#include <string.h>

struct compra{
    char produto[100];
    int quantidade;
    int preco_total;
};

int main(){

    struct compra compras[100];
    int n=0;


    // Coloque o nome do arquivo aqui
    FILE* fp = fopen("compras_input.csv", "r");
    if (!fp){
        printf("Can't open file\n");
    }

    else {
        char buffer[1024];

        int row = 0;

        // enquanto ainda existe linha no arquivo
        while (fgets(buffer, 1024, fp)) {
            row++;

            // O header do csv
            if (row == 1){
                continue;
            }

            int has_value = 0;

            // separando o dado por ;
            char* value = strtok(buffer, ";");

            // depois de separar com strtok
            // se conseguiu separar, fazer 3 vezes, para 3 colunas
            if (value) {
                has_value = 1;

                // O primeiro valor eh do produto
                // e eh string
                printf("Produto :%s", value);
                strcpy(compras[n].produto, value);


                // O segundo valor eh da quantidade
                // e eh int
                value = strtok(NULL, ";");
                printf("\tQuantidade :%s", value);
                printf("%s", value);
                sscanf(value, "%d", &compras[n].quantidade);

                // O terceiro valor eh do preco total
                // e eh int
                value = strtok(NULL, ";");
                printf("\tPreco Total :%s", value);
                printf("%s", value);
                sscanf(value, "%d", &compras[n].preco_total);

            }

            // teve valor na linha
            if(has_value==1){
                n++;
            }

            printf("\n");
        }

        // Close the file
        fclose(fp);
    }

    for(int i=0; i<n; i++){
        printf("produto %d\n", i);
        printf("nome %s\n", compras[i].produto);
        printf("quantidade %d\n", compras[i].quantidade);
        printf("quantidade %d\n", compras[i].preco_total);
        printf("\n\n");
    }
    getchar();
    return 0;
}
