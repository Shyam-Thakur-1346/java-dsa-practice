// str 1 = baccad  anns=bccd
// 1. pass the answer string in argument
//2.create the and variable in function

public class que1_stream_skip{
    public static void main(String[] args) {
        //skip("","baccdab");
        System.out.println(skip("baccdab"));
    }
   /*  static void skip(String p,String up){   // p - processed up - unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }
    }*/


// output : bccdb

// returing a string

    static String skip(String up){   // p - processed up - unprocessed
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }
    }
}

// output: bccdb