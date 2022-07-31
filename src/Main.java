public class Main {
    public static void main(String[] args) {
//        task1and2();
//        task1and3();
        task1and4();
    }
        public static  void task1and2() {
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = " Ivanov";
            String fullName = String.join(" ", lastName, firstName, middleName);
            System.out.println("ФИО сотрудника - " + fullName);
            System.out.println("Данные ФИО сотрудника для заполнения отчета: " +  fullName.toUpperCase());
        }
            public static  void task1and3(){
            String firstName1 = "Семён ";
            String middleName1 = "Семёнович ";
            String lastName1 = " Иванов ";
            String fullName1 = lastName1 + firstName1 + middleName1;
            fullName1.replace('ё', 'е');
            System.out.println( fullName1.replace('ё', 'е'));
        }

    public static  void task1and4(){
        String slovo = "aabccddefgghiijjkk";
        char[] bukvy = slovo.toCharArray();
        for (int i = 0; i < bukvy.length -1 ; i++) {
            if (bukvy[i] == bukvy[i + 1]){
                System.out.print(bukvy[i]);
                }
            }
        }
    }

