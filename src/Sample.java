//課題4 以下のプログラムコードを実行すると、エラーが発生します。エラーが発生する行数と、修正方法を教えてください。
    //※コンソールに出力される内容を変えてはならない。
    //修正前に表示されたエラーは以下です
    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4
    //＊配列の存在しないインデックスで要素にアクセスしたためにエラーが出力された。
    
public class Sample {
    public static void main(String[] args) {
        String[] list = {"hello","good","soso","great"};
        //for(int i=0; i<list.length; i++){ 修正前のコード
        //以下修正後のコード
        for(int i=0; i<list.length-1; i++){
            String str1 = list[i].substring(0,2);
            String str2 = list[i+1].substring(0,2);
            System.out.println("str1:" + str1 + " str2:" + str2);
        }
    }
}