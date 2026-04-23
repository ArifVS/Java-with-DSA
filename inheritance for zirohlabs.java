class Cal{
    int add(int a, int b){
        return a+b;
    }
}
class Call extends Cal{
    @Override
    int add(int a, int b){
        System.out.println(super.add(a,b));
        System.out.println("Adding two numbers");
        return a+b;
    }
}

class Main{
    public static void main(String[] args){
        Call c = new Call();
        System.out.print(c.add(1,2));
    }
}
