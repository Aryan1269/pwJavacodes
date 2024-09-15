
class Question {

    // reverse a string
    public String revereString(String str) {
        String temp = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            temp += str.charAt(i);

        }

        return temp;
    }

    // reverse Words postion

    public String rWords(String str) {
        String[] temp = str.split(" ");
        str = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            str += temp[i] + " ";
        }

        return str.trim();
    }

    // String reverse using recursion

    public String recursionString(String str) {

        if (str.isEmpty()) {
            return str;
        }

        return revereString(str.substring(1)) + str.charAt(0);
    }

    // String reverse in-place

    public String inplace(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] s = str.toCharArray();
        while (left < right) {

            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }

        return new String(s);
    }

}

/**
 * stringQ
 */
public class stringQ {

    public static void main(String args[]) {

        Question q = new Question();
        String res = q.inplace("Hello raj");
        System.out.println(res);
    }
}