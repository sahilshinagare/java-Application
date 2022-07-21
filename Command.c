#include<stdio.h>
#include<stdlib.h>

int main(int argc, char const *argv[])
{
	int ans =0;
	printf("Number of excute is:%s\n",argv[0]);
	printf("Number of coomand line argument are : %d\n",argc);


	ans = atoi(argv[1] + atoi(argv[2]));
	printf("Addition is:%d\n",ans );
	return 0;
}

