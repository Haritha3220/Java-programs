class calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public String add(String a, String b){
        return a+b;
    }
    public static void main(String[] args) {
        calculator cal= new calculator();
        System.out.println("two integes:"+cal.add(5,3));
        System.out.println(" three integes:"+cal.add(5,3,2));
        System.out.println("double two :"+cal.add(5,3));
        System.out.println("String two :"+cal.add("Hello" ,"world"));
         
        
    }
}
