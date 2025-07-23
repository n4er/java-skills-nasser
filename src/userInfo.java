public class userInfo {
    private String name;
    private int age;
    private String email;
    private boolean isActive;

    public userInfo (String name, int age, String email, boolean isActive){
        this.name = name;
        this.age = age;
        this.email = email;
        this.isActive = isActive;
    }
    // getters method

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    public boolean getIsActive(){
        return isActive;
    }
    // Setters method

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

    public void displayInfo(){
        System.out.println("-------- User Info --------");
        System.out.println("Name     : "+name);
        System.out.println("Age      : "+ age);
        System.out.println("Email    : "+email);
        System.out.println("Active   : "+isActive);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args){
        userInfo user1 = new userInfo("Nasser",21,"nasser432243@gmail.com",true);
        userInfo user2 = new userInfo("Qais",16,"qaisraisi@gmail.com",false);
        userInfo user3 = new userInfo("Sulaiman",39,"Suli1234@gmail.com",true);



        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();

        user1.setAge(25);
        user2.setEmail("idk@gmail.com");
        user3.setName("Hamed");

        user1.getAge();
        user2.getEmail();
        user3.getName();

        System.out.println("-------- After Change -----------");
        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();
    }



}
