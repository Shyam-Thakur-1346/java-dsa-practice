import java.util.ArrayList;

public class que3_include_diagonal {
    public static void main(String[] args) {
        System.out.print(pathRetdiagonal("",3,3));
    }
    static ArrayList<String> pathRetdiagonal(String p ,int r,int c){
        if(r==1&&c==1){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        if(r>1){
            list.addAll(pathRetdiagonal(p+'D',r-1,c));
        }
        if(c>1){
            list.addAll(pathRetdiagonal(p+'R',r,c-1));
        }if(r>1&&c>1){
            list.addAll(pathRetdiagonal(p+'T',r-1,c-1)); // T = diagon  al
        }
        return list;
}
}
