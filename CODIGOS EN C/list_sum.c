#include<stdio.h>

int main()
{
    int lista[]={1,3,4,-2,4,9};
    int size=sizeof(lista)/sizeof(int);
    printf("La lista tiene %d elementos\n",size);
    int suma=0,i;
    for(i=0;i<size;i++)
    {
        suma+=lista[i];
    }
    printf("La suma de elementos del array es %d\n",suma);
    return 0;
}