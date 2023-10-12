class Solution {
    public String toLowerCase(String s) {
        char[] a = s.toCharArray();

        for(int i = 0; i<a.length; i++){
            int asciiValue = (int) a[i];

            if(asciiValue >=65 && asciiValue <=90){
                a[i] = (char)(asciiValue+32);
            }
        }
        return String.valueOf(a);
    }
}