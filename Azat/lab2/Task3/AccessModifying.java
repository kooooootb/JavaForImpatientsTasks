package ch2.Task3;

class ClassWithModifying {
    int unsignedNumber;
    ClassWithModifying(){
        unsignedNumber = 3;
    }
    boolean modify(int newValue){
        if(newValue < 0){
            return false;
        } else{
            unsignedNumber = newValue;
            return true;
        }
    }

    void access(){
        System.out.println(unsignedNumber);
    }
}

public class AccessModifying{
    public static void main(String[] args){
        ClassWithModifying obj = new ClassWithModifying();
        obj.modify(33);
        obj.access();
    }
}
