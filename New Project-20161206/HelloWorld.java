public class HelloWorld{

     public static void main(String []args){
         String s1 = new String("you and me");
         String s2 = new String("you and me");
         
        System.out.println(s1==s2);
        String s3 ="you and me";
        System.out.println(s1==s3);
        String s4 = "you and me";
        System.out.println(s3==s4);
        String s5 = "You" + "me";
        System.out.println(s5);
        String s6= s1+"you and me";
        System.out.println(s6);
        final String s8= "You and me" + s6;
        System.out.println(s8);
        String s9 = s6.intern();
        System.out.println(s9);
        System.out.println(s3.charAt(5));
        System.out.println(s3.equalsIgnoreCase("you and me"));
        
     }
}
