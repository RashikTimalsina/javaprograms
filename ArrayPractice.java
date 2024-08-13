class Student
{
    
    public int roll_num;
    public String name;

    public Student(int roll_num,String name)
        {
            
            this.roll_num=roll_num;
            this.name=name;


        }

        
    
}

class ArrayPractice
{

    public static void main(String[] args) {
        
        Student[] arr=new Student[5];
        
        arr[0]=new Student(1, "Lana");
        arr[1]=new Student(2, "Maxim");
        arr[2]=new Student(3, "Mia");
        arr[3]=new Student(4, "Dani");
        arr[4]=new Student(5, "Sunny");


        for(int i=0;i<arr.length;i++)
            {

                System.out.println("Students ID :" +i + ":" + arr[i].roll_num +" " +arr[i].name);


            }


    }



}