#include <stdio.h>
#include <conio.h>
#include <string.h>
void main()
{
     char str[20],tmp;
     int k,l;
     clrscr();
     printf("\nEnter a string : ");
     scanf("%s",str);
     printf("\n\nOriginal String     : %s",str);
     for(k=0;k<strlen(str);k=k+2)
     {
     tmp = str[k];
     str[k] = str[k+1];
     str[k+1] = tmp;
     }
     printf("\nAfter Swap String      : %s",str);
     getch();
}
