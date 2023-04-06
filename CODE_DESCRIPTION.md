# **Problem String Similarity**

## **The problem description can be found at the link: [String Similarity.](https://www.hackerrank.com/challenges/string-similarity/)**

The challenge required implementing the **stringSimilarity method** of the **Result class**, which takes a string as input and returns the similarity score with its possible substrings.

### **Code description**

1. I start by defining the 'similarity' variable that will store the similarity score. Since the first substring is the string itself, I initialize the 'similarity' variable with the length of the string.<br/>
"int similarity = s.length();"
2. I implement my first loop that will generate the starting positions of the substrings from the second character, since the score of the first substring has already been stored in the 'similarity' variable.<br/>
"for (int i = 1; i < s.length(); i++)"
3. I compare the first character of the string with the first character of the substring. If they are different, I skip the subsequent code and move on to the next iteration of the loop. This allows the second loop to not be unnecessarily initialized, improving the speed of the algorithm.<br/>
"if (s.substring(0, 1).equals(s.substring(i, i + 1)))"
4. I continue implementing the second loop, which will iterate over the entire substring and proportionally over the initial portion of the original string. To do this, I set the 'e' variable of the 'for' loop to receive the value of variable 'i' of the external loop.<br/>
"for (int e = i; e < s.length(); e++)"
5. I add an 'if' statement to compare each character of the strings throughout the loop iterations.<br/>
"if (s.substring(e - i, e - i + 1).equals(s.substring(e, e + 1)))"
6. If the result is true, I add one unit to the 'similarity' variable.<br/>
"similarity++;"
7. If the result is negative, the 'break' command is executed to exit the loop and move on to the next substring.<br/>
"break;"
8. After exiting the inner and outer loops, I return the value of the 'similarity' variable, which corresponds to the total score of the substrings.<br/>
"return (similarity);"

### **Considerations**

The coding to solve the problem wasn't difficult. I just had to review some string manipulation methods. The most challenging part was improving the code's efficiency. I had to restructure the code several times, looking for changes that could improve its speed even minimally.

I know I could have arrived at a solution more quickly if I used a more appropriate language like C. However, I wanted to use Java since it's the language requested in one of the suggested tests. After some time, I finally reached a sufficient effectiveness to pass the test.
