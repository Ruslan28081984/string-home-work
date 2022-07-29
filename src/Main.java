public class Main {
    public static void main(String[] args) {
        task1and2();
        task1and3();

    }
        public static  void task1and2() {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = " Ivanov";
            String fullName = String.join(" ", lastName, firstName, middleName);
            System.out.println(" ФИО сотрудника - " + fullName);
            System.out.println(fullName.toUpperCase());
        }
            public static  void task1and3(){
            String firstName1 = "Семён ";
            String middleName1 = "Семёнович ";
            String lastName1 = " Иванов ";
            String fullName1 = lastName1 + firstName1 + middleName1;
            fullName1 = fullName1.replace('ё', 'е');
            System.out.println( fullName1);
        }
    }
