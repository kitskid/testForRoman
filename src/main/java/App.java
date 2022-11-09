import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {


        Department java = new Department(1, "Java");
        Department C = new Department(2, "C#");
        Department javaScript = new Department(3, "JavaScript");

        List<Department> departments = new ArrayList<>();
        departments.add(java);
        departments.add(C);
        departments.add(javaScript);

        User Raman = new User(1, "Raman", 1000, java.getId(), new Address("Brest", "YK", 17));
        User Anha = new User(2, "Anha", 2500, java.getId(), new Address("Brest", "RS", 11));
        User Artem = new User(3, "Artem", 1500, C.getId(), new Address("Wroclaw", "lenina", 1));
        User Alex = new User(4, "Alex", 1700, C.getId(), new Address("Minsk","Ordj",29));
        User Ivan = new User(5, "Ivan", 3000, javaScript.getId(), new Address("Wroclaw", "lenina", 18));

        List<User> users = new ArrayList<>();
        users.add(Raman);
        users.add(Anha);
        users.add(Artem);
        users.add(Alex);
        users.add(Ivan);

        for(Department department: departments){
            long maxSalary = 0;
            for (User user: users){
                if(department.getId() == user.getDepartment()){
                    if(user.getSalary() > maxSalary){
                        maxSalary = user.getSalary();
                    }
                }
            }
            System.out.println("Максимальная зарплата в отделе " + department.getName() + " - " + maxSalary);
        }
    }
}
