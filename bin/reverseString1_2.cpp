#include <iostream>
using namespace std;

void reverse(char str[]){
	int length = strlen(str);
	int i,j;
	char c;
	for(i=0,j=length-1; i<j; i++,j--){
		c=str[i];
		str[i]=str[j];
		str[j]=c;
	}
}

int main(){
	char a[] = "adbd";
	cout<<a<<endl;
	reverse(a);
	cout<<a<<endl;
	if(a[4] == '\0')
		cout << "hello world\n";
	return 0;
}