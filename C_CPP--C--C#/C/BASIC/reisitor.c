#include<stdio.h>
#include<string.h>
int check(char[]);
int check(char a[])
{
    int i=12;
                    if(strcmp(a,"black")==0)
                    {
                        i=0;
                    }
                    if(strcmp(a,"brown")==0)
                    {
                    
                        i=1;
                    }
                    if(strcmp(a,"red")==0)
                    {
                        i=2;
                    }
                    if(strcmp(a,"orange")==0)
                    {
                        i=3;
                    }
                    if(strcmp(a,"yellow")==0)
                    {
                        i=4;
                    }
                    if(strcmp(a,"green")==0)
                    {
                        i=5;
                    }
                    if(strcmp(a,"blue")==0)
                    {
                        i=6;
                    }
                    if(strcmp(a,"violet")==0)
                    {
                        i=7;
                    }
                    if(strcmp(a,"grey")==0)
                    {
                        i=8;
                    }
                    if(strcmp(a,"white")==0)
                    {
                        i=9;
                    }
                    if(strcmp(a,"gold")==0)
                    {
                        i=10;
                    }
                    if(strcmp(a,"silver")==0)
                    {
                        i=11;
                    }
                    if(strcmp(a,"no")==0)
                    {
                        i=12;
                    }
                    return i;
                   

} ;

void main()
{
    
    int a[5],n,loc,fir=0,sec=0;
    float thir=0;
    float arr[13][4]={{0,0,1,1},
                    {1,1,10,2},
                    {2,2,100,3},
                    {3,3,1000,4},
                    {4,4,10000,0},
                    {5,5,100000,0.5},
                    {6,6,1000000,0.25},
                    {7,7,10000000,0.1},
                    {8,8,100000000,0.05},
                    {9,9,1000000000,0},
                    {10,0,0.1,5},
                    {11,0,0.01,10},
                    {12,0,0,20},
                    };
    char col[10][10];
    printf("Enter is the band");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
    printf("Enter color ");
    scanf("%s",&col[i]);
    }
    for(int i=0;i<n;i++)
    {
        loc=check(col[i]);
        if(i<n-2)
        {
            fir=fir*10+arr[loc][1];
        }
        if(i==n-2)
        {
            sec=arr[loc][2];
        }
        if(i==n-1)
        {
            thir=arr[loc][3];
        }

    }

    printf("resistance is %d X %d ohm %.2f %%",fir,sec,thir);
    
}
