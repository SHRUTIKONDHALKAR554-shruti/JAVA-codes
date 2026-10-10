

public class studentresult {
    public static void main(String[] args) {
        int s1=80;
        int s2=90;
        int s3=80;
        int s4=70;
        int s5=70;
        int total=s1+s2+s3+s4+s5;
        double percentage =total/5.0;
        System.out.println("total=" + total);
        System.out.println("percentage=" + percentage);
        if(percentage>=90){
            System.out.println("grade:A+");
        }
            else if(percentage>=80){
                System.out.println("grade:A");
            }
            else if(percentage>=70){
                System.out.println("grade:B");
            
            }
            else if(percentage>=60){
                System.out.println("grade:c");
            }
            else if(percentage >=40){
                System.out.println("grade:C");
            }
            else{
                System.out.println("fail");
            }
        }   
    }


