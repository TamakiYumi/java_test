public class Main {
    public static void main(String[] args) {
      //課題1
        //step1 文字列(s)、整数(i)、浮動小数点数(d)を変数宣言し、任意の値をそれぞれ代入してください。
        String s = "Hello";
        int i = 1;
        float d = -1.0f;
        //step2 先ほど宣言した変数を活用し、すべての値をコンソールに出力してください。
        System.out.println(s);
        System.out.println(i);
        System.out.println(d);
        //step3 文字列(s)に関しては、文字列の長さもコンソールに出力してください。
        System.out.println(s.length());

      //課題2
        //step1 5 つの要素を持った配列(list)を宣言してください。
        int[] list = new int[5];
        //step2 配列(list)に、任意の数値を 5 つ代入してください。
        list[0] = 2;
        list[1] = 10;
        list[2] = 3;
        list[3] = 8;
        list[4] = 20;
        //step3 配列(list)の中身をそれぞれ確認し 4 の倍数の時は"4 の倍数です"とコンソールに出力し、5 の倍数の時は"5 の倍数です"とコンソールに出力し、それ以外は配列(list)の値をそれぞれコンソールに出力してください。
        for(int num: list){
            int[] checkNums = {4,5};
            boolean isMultiple = false;
            for(int checkNum: checkNums){
                if(isMultiple = num % checkNum == 0){
                    System.out.println(num + "は" +checkNum + "の倍数です");
                }
            }
            if(!isMultiple){
                System.out.println(num);
            }
        }

      //課題3 コマンドライン引数が２個渡されたと仮定し、コマンドライン引数の２個目の値をコンソールに出力してください。
        //"java Main hoge1 hoge2"で実行すると"hoge2"と出力される
        if(args.length >= 2){
          System.out.println(args[1]);
        }else{
          System.out.println("※コマンドライン引数が２つ以上渡されていないので課題３は実行されませんでした");
        }
    }
}