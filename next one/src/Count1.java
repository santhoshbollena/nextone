import java.util.Arrays;



public class Count1 {



public static void main(String[] args) {

String input = "PRranaySsanthoshBbharath";

int lenghtOfGivenString = input.length();

char stringToChar[] = input.toCharArray();

char uniqueCharHolderArray[] = new char[lenghtOfGivenString];

int tvh = 0;



for (int i = 0; i < lenghtOfGivenString; i++) {



char countingChar = stringToChar[i];

int tempCount = 0;

boolean isCharAlreadyCounted = true;



for (int j = 0; j < lenghtOfGivenString; j++) {

if (uniqueCharHolderArray[j] == countingChar) {

isCharAlreadyCounted = false;

}

}



if (isCharAlreadyCounted) {

uniqueCharHolderArray[tvh] = countingChar;

tvh++;

for (int j = 0; j < lenghtOfGivenString; j++) {

if (stringToChar[j] == countingChar) {

tempCount++;

}

}



System.out.println(countingChar + " =" + tempCount);

}



}



}



}