public class que2_skipString{
    public static void main(String[] args) {
        //skip("","baccdab");
        System.out.println(skipApple("baccappledab"));
        System.out.println(skipAppnotApple("baccappdab"));
    }
    static String skipApple(String up){   // p - processed up - unprocessed
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return ch + skipApple(up.substring(1));
        }
    }

// input : baccappledab
// output: baccdab 

static String skipAppnotApple(String up){   // p - processed up - unprocessed
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("app")&& !up.startsWith("apple")){
            return skipAppnotApple(up.substring(3));
        }else{
            return ch + skipAppnotApple(up.substring(1));
        }
    }
    // input: baccappdab
    //output:baccdab
}