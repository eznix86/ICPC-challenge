# SOLUTION OF ICPC 2017 Challenge Yellow Ballon
## Sponsored by IBM OCT 2017

### Problem Description
You have been asked to perform a simple lexical analysis of works of 
literature. As part of this analysis
you need to determine how many words there are in a given piece of text. 
In addition you need to
count how often each of the alphabetic characters (a–z) occur within the 
given piece of text. The text
is known to not only contain the lowercase characters a–z, but also the 
uppercase characters A–Z as
well as various punctuation characters . , ? ’ : ; -. Some of the text 
isn’t well formatted and there
may be multiple spaces between some of the words.
A word is defined as one or more non-whitespace characters, that 
contains at least one alphabetic
character (A–Z and/or a–z).
No distinction should be made between an upper case and lower case 
character, for example, both A
and a count as the same character.

### Input
The input consists of an arbitrary number of records, but not more than 
20.
Each record consists of a single line (terminated by a newline character - \n), representing a piece of
text containing one or more words (not more than 10 000 characters and 1 
000 words), which only
consists of the characters listed above. There will not be any leading 
or trailing spaces on the lines.
The end of input is indicated by a line containing only -1.

### Output
For each record, output a line with the first value indicating the 
number of words in the piece of text,
followed by the number of times each of the 26 alphabet characters 
appeared within the text, c a . . . c z .
Uppercase and lowercase characters should be counted together, all other 
characters must be ignored.
Sample input
The apple falls under the tree.
Careful, it can’t be that easy
So ... you thought it was obvious?
-1
### Sample output
- 6 2 0 0 1 6 1 0 2 0 0 0 3 0 1 0 2 0 2 1 3 1 0 0 0 0 0
- 6 4 1 2 0 3 1 0 1 1 0 0 1 0 1 0 0 0 1 1 4 1 0 0 0 1 0
- 6 1 1 0 0 0 0 1 2 2 0 0 0 0 0 5 0 0 0 3 3 3 1 1 0 1 0
