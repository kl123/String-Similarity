import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'stringSimilarity' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int stringSimilarity(String s) {
        // Write your code here
        int similarity = s.length();
        for (int i = 1; i < s.length(); i++) {
            if (s.substring(0, 1).equals(s.substring(i, i + 1))) {
                for (int e = i; e < s.length(); e++) {
                    if (s.substring(e - i, e - i + 1).equals(s.substring(e, e + 1))) {
                        similarity++;
                    } else {
                        break;
                    }
                }
            }
        }
        return (similarity);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = bufferedReader.readLine();

            int result = Result.stringSimilarity(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
