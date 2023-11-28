public class ex5_27t11 {
    public static void main(String[] args) {
        String str = "hello world";
        char ch = 'o';
        int ans =-1 ;
        for(int index =0 ;index< str.length() ; index++){
            if(str.charAt(index)== ch){
                ans = index;
            }

        }
        if( ans==-1){
            System.out.println("nothing");
        }else
        {
            System.out.println("location" + ans);
        }
    }
}
