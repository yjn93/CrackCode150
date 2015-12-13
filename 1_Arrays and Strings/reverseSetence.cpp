//given a sentense, reverse the order of words in the sentense

#include <iostream>
using namespace std;

void reverse(char sentense[]){

	for(int i=0, j=strlen(sentense)-1; i<j; i ++, j --){
		char temp = sentense[i];
		sentense[i] = sentense[j];
		sentense[j] = temp;
	}
	int wordStart = 0;
	int wordEnd = -1;
	for(int i=0; i<=strlen(sentense);i++){
		if(sentense[i] == ' ' || sentense[i] == '\0'){
			while(wordStart<wordEnd){
				char temp = sentense[wordStart];
				sentense[wordStart] = sentense[wordEnd];
				sentense[wordEnd] = temp; 
				wordEnd --;
				wordStart ++;
			}
			wordStart = i + 1;
			wordEnd = i;
		} else{
			wordEnd ++;
		}
	}

}

int main(){
	char sentense1[] = "I have to go";
	char sentense2[] = "see you later";
	reverse(sentense1);
	reverse(sentense2);
	cout<<sentense1<<endl<<sentense2<<endl;
	return 0;
}

