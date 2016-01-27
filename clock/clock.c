#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

int main(int argc, char *argv[])
{
	int h,m,s;

	if(argc!=4){
		exit(1);
	}
	h=atoi(argv[1]);
	m=atoi(argv[2]);
	s=atoi(argv[3]);

	for(;;s++){
		if(s==60){
			s=0;
			m++;
		}
		if(m==60){
			m=0;
			h++;
		}
		if(h==24){
			h=0;
		}
		sleep(1);
		printf("%02d:%02d:%02d\n",h,m,s);
	}
	return 0;
	
}
