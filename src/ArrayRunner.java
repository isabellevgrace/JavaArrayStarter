public class ArrayRunner
{
    public static void main(String[] args)
    {
        Student me = new Student("Mr. Howe","December","blue");
        System.out.println(me);
        Student[] myClass = new Student[12];
        Student studentA = new Student("Isabelle","April","pink");
        myClass[2] = studentA;
        Student studentB = new Student("Lydia","October","purple");
        myClass[0] = studentB;

        String[] names = {"Michael","Brian","Duncan","Bennett","Martin",
                          "Jessica","Lexy","Zoe","Jimmy","Sanjit","Andrew","Will"};
        String[] months = {"February","October","March","September","July",
                            "February","November","December","August","May",
                            "September","December"};
        String[] colors = {"Green","Fuchsia","Purple","Turquoise","Cyan",
                            "Purple","Pink","Indigo","Green","Blue","Green","SpaceBlack"};

        for (int i=0; i<12; i++)
        {
            myClass[i] = new Student(names[i],months[i],colors[i]);
        }
        System.out.println("Print out the students!");

        for (Student s: myClass)
        {
            if (s.getName().equals("Martin"))
            {
                System.out.print("*****");
            }
            System.out.println(s);
        }

    }
}
