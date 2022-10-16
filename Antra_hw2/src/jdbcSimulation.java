

import java.sql.*;



public class jdbcSimulation {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost://3306/mysql";


    static final String USER = "root";
    static final String PASS = "123123qwe?";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver"); //static block
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            conn.setAutoCommit(false);
            System.out.println("Creating statement...");



            String sql1 = "CREATE TABLE  student" +
                    "(s_id INTEGER not NULL PRIMARY KEY,"+
                    "s_name VARCHAR(255) PRIMARY KEY)";
            stmt.executeUpdate(sql1);
            System.out.println("Student Table created");



            String sql2 = "CREATE TABLE  teacher " +
                    "(t_id INTEGER not NULL PRIMARY KEY,"+
                    "s_name VARCHAR(255) PRIMARY KEY)";
            stmt.executeUpdate(sql2);
            System.out.println("Teacher Table created");




            String  sql3 ="CREATE TABLE student_teacher" +
                    "(s_id INTEGER not NULL,"+
                    "s_name VARCHAR(255),"+
                    "t_id INTEGER not NUL,"+
                    "t_name VARCHAR(255)," +
                    "FOREIGN KEY (s_id) REFERENCES student(s_id),"+
                    "FOREIGN KEY (s_name) REFERENCES student(s_name),"+
                    "FOREIGN KEY (t_id) REFERENCES teacher(t_id),"+
                    "FOREIGN KEY (t_name) REFERENCES teacher(t_name),"+
                    "UNIQUE (s_id, s_name, t_id,t_name)";
            stmt.executeUpdate(sql3);
            System.out.println("student to teacher Table created");




            System.out.println("create new student teacher juntion rows: " );
            String sql4 = "INSERT INTO student_teacher"+
                    "VALUES (1,'Tom',1,'teacher_name_1')," +
                    "VALUES (2,'Tim',2,'teacher_name_2')";
            stmt.executeUpdate(sql4);
            System.out.println("new student teacher juntion rows created");





            String sql5 = "SELECT *FROM student_teacher WHERE s_id = 1";
            stmt.executeUpdate(sql5);


            System.out.println("UPDATE new student teacher juntion rows: ");


            String sql6 = "UPDATE student_teacher SET s_id = '5' WHERE s_name = 'Tom'";
            stmt.executeUpdate(sql6);
            System.out.println("UPDATE finished");




            System.out.println("delete new student teacher juntion rows: ");
            String sql7 = "DELETE FROM student_teacher WHERE s_id=1";
            stmt.executeUpdate(sql7);
            System.out.println("DELETE finished");






            stmt = conn.prepareStatement(sql1);
            ResultSet rs = stmt.executeQuery();


            while(rs.next()){

                int student_id  = rs.getInt("s_id");
                int teacher_id = rs.getInt("t_id");


                System.out.print("student_id: " + student_id);
                System.out.print("teacher_id: " + teacher_id);

            }

            conn.commit();
            rs.close();
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            try {
                conn.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}

@Entity
class Student {
    @Id
    String s_name;


    @Id
     int s_id;

    @ManyToMany
    Set<teacher> linkteacher;

    int get_id(){
        return this.s_id;
    }

    String get_name(){
        return this.s_name;
    }

     Student(String s_name, int s_id) {
        this.s_name = s_name;
        this.s_id = s_id;

    }

}

@Entity
class teacher {
    @Id
    String t_name;
    @Id
    int t_id;


    @ManyToMany
    Set<student> linkstudent;

    teacher(String t_name, int t_id) {
        this.t_name = t_name;
        this.t_id = t_id;

    }


    int get_id(){
        return this.t_id;
    }

    String get_name(){
        return this.t_name;
    }

}

@ManyToMany
@JoinTable(
        name = "course_like",
        joinColumns = @JoinColumn(name = "s_id"),
        inverseJoinColumns = @JoinColumn(name = "t_id"))
    Set<teacher> linkteacher;
}


class CreateStudentTeacher {

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        //Create student entity object
        Student student1 = new Student("tim", 1);
        teacher teacher1 = new teacher("teacher1", 1);



        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(student1);
        session.save(teacher1);
        System.out.println("Inserted Successfully");
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}



public class ReadStudentTeacher{

    public static void main(String[] args)
    {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Query query = session.createQuery("Student Data");
        List students = query.list();
        for(Student student : students)
        {
            System.out.println("s_id: "+student.get_id()+", s_name: "+student.get_name();
        }
        Query query = session.createQuery("teacher Data");
        List teachers = query.list();
        for(Student teacher : teachers)
        {
            System.out.println("t_id: "+teacher.get_id()+", t_name: "+teacher.get_name();
        }
        session.getTransaction().commit();
        sessionFactory.close();
    }
}


public class UpdateStudentTeacher {

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        //Create session factory object
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        //getting session object from session factory
        Session session = sessionFactory.openSession();
        //getting transaction object from session object
        session.beginTransaction();

        Student student = (Student)session.get(Student.class, 2);
        student.setStudentName("Sweety Rajput");
        System.out.println("Updated Successfully");
        session.getTransaction().commit();
        sessionFactory.close();
    }
}


