// Program that checks if two string are anagrams. This was asked in an Allsate interview.

boolean isAnagramSort(String string1, String string2) {

    // first check if the length of the two strings is the same
    if (string1.length() != string2.length()) {
        return false;
    }
    // convert the two string arrays into char arrays
    char[] a1 = string1.toCharArray();
    char[] a2 = string2.toCharArray();
    
    // use the sort method to arrange the letters from a to z
    Arrays.sort(a1);
    Arrays.sort(a2);
    return Arrays.equals(a1, a2);
}

// The overall running time of this algorithm is O(n log n) because sorting an array of n characters takes O(n log n) time.
// For the algorithm to function, it must make a copy of both input strings as character arrays, using a little extra memory.

