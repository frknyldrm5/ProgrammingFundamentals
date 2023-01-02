import java.util.ArrayList;
public class ListOefeningen {
    private ArrayList<String> names;
    private ArrayList<Student> students;

    public ListOefeningen() {
        names = new ArrayList<>();
        students = new ArrayList<>();
        fillNames();
        fillStudents();
    }
    //1-Isim sayisi
    public int getNumberOfNames(){
        return names.size();
    }
    //2-Ogrenci sayisi
    public int getNumberOfStudents(){
        return students.size();
    }
    //3-Butun isimleri yazdirma
    public void listAllNames(){
        for (String name: names)
        System.out.println(name);
    }
    //4-Ad uzunlugu NameLengt esit olanlar(4 veya 5 veya 6 harfliler)
    public void listAllNames(int nameLength){
        for (String name : names){
            if (name.length()==nameLength) 
            System.out.println(name);
        }
    }
    //5-Sonu 'an' ile biten isimler
    public void listAllNames(String search){
        for (String name : names){
            if(name.contains(search))
            System.out.println(name);
        }
    }
    //6-Ismindeki harf sayisi (7ila8) arasinda olan sayilar
    public void listAllNames(int nameLengthFrom,int nameLengthTo){
        for (String name : names){
            if(name.length() >= nameLengthFrom   &&   name.length()<= nameLengthTo)
            System.out.println(name);
        }
    }
    //7-Ad uzunlugu belirtilen ile ayni olan ilk 2 isim ortaya cikar(while dongusu ile)----zor
    public void firstTwoNames(int nameLength){
        int cnt=0;
        int index=0;
        while(cnt<2 && index<names.size()){
            if(names.get(index).length()==nameLength){
                cnt+=1;
                System.out.println(names.get(index));
            }
            index +=1;
        }
    }
    //8-Butun isimleri yaslari ile birlikte yazdiriyor
    public void listAllStudents(){
        for(Student student : students) 
        System.out.println(students);
    }
    //9-Ogrencilerin kac harf varsa (4,5,6,7) onlari yaslari ile yazdiriyor
    public void listAllStudents(int nameLength){
        for(Student student : students)
        if (student.getName().length()==nameLength)
        System.out.println(student);
    }
    //10-Girilen sayidan fazlasi olan ogrencileri yazdirir
    public void listAllStudentsAbove(int age){
        for(Student student : students)
        if(student.getAge() > age)
        System.out.println(student);
    }
    //11-butun ogrencilerin yasslarini toplayacak
    public int sumStudentAge(){
        int total = 0;
        for(Student student : students)
        total += student.getAge();
        return total;
    }
    //12-butun ogrencilerin yaslarinin ortalamsini alacak
    public double averageStudentAge(){
        double ave = sumStudentAge()/1.0/getNumberOfStudents();
        return Math.round(100*ave)/100.0;
    }
    //13-Sinifin en genc ogrencisi---???
    public int minimumStudentAge(){
        int min =100;
        for(Student student : students){
            min=Math.min(min,student.getAge());
        }
        return min;
    }
    //14-Girilen degere(yas) esit olan ilk uc ogrenci
    public void firstThreeStudents(int age){
        int index=0;
        int cnt=0;
        while(cnt<3 && index<students.size()){
            if(students.get(index).getAge()==age){
                cnt+=1;
                System.out.println(students.get(index));
            }
            index+=1;
        }
        
    }


    ///////////////////////////-------------------names--------------------------\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    private void fillNames() {
        names.add("Houssam");
        names.add("Mahmood");
        names.add("Soufiane");
        names.add("Mikail");
        names.add("Ernazar");
        names.add("Ufuk");
        names.add("Mouataz");
        names.add("Nathan");
        names.add("Michel");
        names.add("Ivan");
        names.add("Justine");
        names.add("Ilyas");
        names.add("Niels");
        names.add("Ahmet Yusuf");
        names.add("Robin");
        names.add("Ariola");
        names.add("Oztug");
        names.add("Yeliz");
        names.add("Minhaj");
        names.add("Ahmet");
        names.add("Sebahattin");
        names.add("Lennert");
        names.add("Goran");
        names.add("Lander");
        names.add("Qikai");
        names.add("Furkan");
        names.add("Lynn");
        names.add("Shaban");
        names.add("Soroush");
    }
    
    
    /////////////////////////----------students-------------------------//////////////////////////////////////////////
    private void fillStudents() {
        students.add(new Student("Houssam", 21));
        students.add(new Student("Mahmood", 23));
        students.add(new Student("Soufiane", 22));
        students.add(new Student("Mikail", 19));
        students.add(new Student("Ernazar", 20));
        students.add(new Student("Ufuk", 21));
        students.add(new Student("Mouataz", 24));
        students.add(new Student("Nathan", 22));
        students.add(new Student("Michel", 20));
        students.add(new Student("Ivan", 21));
        students.add(new Student("Justine", 19));
        students.add(new Student("Ilyas", 19));
        students.add(new Student("Niels", 19));
        students.add(new Student("Ahmet Yusuf", 19));
        students.add(new Student("Robin", 26));
        students.add(new Student("Ariola", 20));
        students.add(new Student("Oztug", 23));
        students.add(new Student("Yeliz", 25));
        students.add(new Student("Minhaj", 24));
        students.add(new Student("Ahmet", 22));
        students.add(new Student("Sebahattin", 19));
        students.add(new Student("Lennert", 19));
        students.add(new Student("Goran", 19));
        students.add(new Student("Lander", 21));
        students.add(new Student("Qikai", 20));
        students.add(new Student("Furkan", 22));
        students.add(new Student("Lynn", 28));
    }
}