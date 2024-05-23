import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Students s1=new Students("Adhiraj Singh",101,"adhirajsingh@gmail.com",98313941);
    Students s2=new Students("Kanishk Tiwari",102,"kanishktiwari@gmail.com",94191383);
    Students s3=new Students("Paras Goyal",103,"parasgoyal@gmail.com",88909172);
    Students s4=new Students("Varun Pareek",104,"varunpareek@gmail.com",98656123);
    Students s5=new Students("Piyush Agarwal",105,"piyushagarwalh@gmail.com",76859412);
    Students s6=new Students("Disha Agarwal",106,"dishaagarwal@gmail.com",72123411);
    Students s7=new Students("Jatin Choudhary",107,"jatinchoudhary@gmail.com",92123244);
    Students s8=new Students("Akshat Jain",108,"akshatjain@gmail.com",78654912);
    Students s9=new Students("Riya Khandelwal",109,"riyakhandelwal@gmail.com",78999912);
    Students s10=new Students("Divyanshu Gautam",110,"divyanshugautam@gmail.com",76901234);

    TechStack ts1=new TechStack(1001,"Django","Python Framework");
    TechStack ts2=new TechStack(1002,"Springboot","Java Framework");
    TechStack ts3=new TechStack(1003,"ExpressJS","For Backend");
    TechStack ts4=new TechStack(1004,"ReactJS","For Frontend");
    TechStack ts5=new TechStack(1005,"MongoDB","For Database");

    ArrayList<TechStack> techStackList = new ArrayList<>();
    techStackList.add(ts1);
    techStackList.add(ts2);
    techStackList.add(ts3);
    techStackList.add(ts4);
    techStackList.add(ts5);

    Trainer t1= new Trainer("Vanshika Ma'am",1,"vanshika@gmail.com",961111,techStackList);
    Trainer t2= new Trainer("Ritu Ma'am",2,"ritu@gmail.com",639091,techStackList);
    Trainer t3= new Trainer("Hridesh Sir",3,"hridesh@gmail.com",704390,techStackList);

    Assignment a1 = new Assignment(10,"Arrays",);
    Assignment a2 = new Assignment(11,"Strings",);
    Assignment a3 = new Assignment(12,"Collection",);
    Assignment a4 = new Assignment(13,"API's",);




    }

}
