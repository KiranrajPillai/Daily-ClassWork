public class EncapsulationMethod {
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {
    EncapsulationMethod e = new EncapsulationMethod();
    e.setAge(24);
    e.setName("Kiranraj Pillai");
    System.out.println(e.getAge());
    System.out.println(e.getName());
    }
}

