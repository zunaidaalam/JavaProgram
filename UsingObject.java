package JavaProgram;

public class UsingObject {
    private int age;
    private String name;

    public UsingObject(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void codes(){
        System.out.println(this.name+": Write Codes");
    }
    public void drinksCoffee(){
        System.out.println(this.name+": Drink Coffe");
    }
    public static void main(String [] args){
        UsingObject UO = new UsingObject(23,"Zunaid");
        UO.codes();
        UO.drinksCoffee();
    }
}
