package com.chad.leetcode.subject.easy;

/**
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 *
 * Tags: String
 *
 * 思路
 * 题意是让你从字符串数组中找出公共前缀，我的想法是找出最短的那个字符串的长度 minLen，
 * 然后在 0...minLen 的范围比较所有字符串，如果比较到有不同的字符，那么直接返回当前索引长度的字符串即可，
 * 否则最后返回最短的字符串即可。
 *
 * class Solution {
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if(len == 0) return "";
        int shortestLen = Integer.MAX_VALUE;
        for(int i = 0 ; i<len;i++){
            shortestLen = Math.min(shortestLen,strs[i].length());
        }
        for(int j = 0;j<shortestLen;j++){
            for(int i = 1;i<len;i++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0].substring(0,shortestLen);
    }
}
