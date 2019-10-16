# WordAnagram

getUrlContents function: get words from given url saved in List

WordAnagram function:

  1. for char set, count the number of each character(use countChars function), saved in int[26] named map; which map[0] is the frequency of char 'A' or 'a';
  2. go through words: 
      if word length does not equal to char set length, skip this word; 
      else for word, count the number of each character, 
          if frequency of character in word > frequency of character in char set, skip this word; 
          if frequency of each character in word == frequency of each character in char set, add current word to result;

test:
  test empty char set
  test normal char set
  test same char set with captial case
  test char set that no match words
