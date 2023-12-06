import org.example.ex6_27t11;


public class ex3_21t11 {
    public static void main(String[] args) {
        String[] student ={"nam" , "lua", "trang","dt"};
        for(int index1 = 0 ; index1<student.length-1;index1++){
            for(int index2 = index1+1;index2< student.length;index2++){
                if(student[index1].compareToIgnoreCase(student[index2])>0){
                    String temp = student[index1]; ;
                    student[index1]= student[index2];
                    student[index2]= temp ;

                }
            }
        }
            for(String listStudent : student){
                System.out.println(listStudent);
            }
    }
}
