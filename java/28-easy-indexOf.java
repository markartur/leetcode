/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Example 3:

Input: haystack = "", needle = ""
Output: 0
*/

class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }

        if(haystack.equals(needle)){
            return 0;
        }

        if(needle.length() > haystack.length()){
            return -1;
        }

        int runningNeedle = 0;
        int res = -1;

        for(int i = 0; i<haystack.length();i++){

            if(haystack.charAt(i) == needle.charAt(runningNeedle)){
                if(runningNeedle == 0){
                    res = i;
                }
                runningNeedle++;

            } else {
                if(runningNeedle > 0){
                    i = i - runningNeedle;
                }

                runningNeedle = 0;
                res = -1;

            }

            if(runningNeedle == needle.length()){
                break;
            }
        }
        if(runningNeedle < needle.length()){
            return -1;
        }


        return res;
    }
}