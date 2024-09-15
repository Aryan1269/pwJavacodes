

class String_StringBuffer {
    /*
     * String is unmutable
     * StringBuffer is mutable and has tread safe feature means at time one thread can use it
     * StringBuilder is same as StringBuffer but doesn't support treadsafe feature
     */
    public static void main(String[] args) {
        String s1 = new String("hello");
        StringBuffer s2 = new StringBuffer("hello");
        StringBuilder s3 = new StringBuilder("Hello");
        s1.concat("world"); // doesn't change string
        System.out.println(s1);
        System.out.println(s2.append("world")); //add to str
        System.out.println(s3.append("world")); 
    }
}
