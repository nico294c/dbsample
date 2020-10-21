public class DBExercises {

    public static void main(String[] args) {

        //a) Insert a new row in each table (just a "hard coded" value)
        //Table: department
        //DB.insertSQL("Insert into department(dept_no, dept_name, location) values('d4','sales','Houston')");
        //DB.deleteSQL("Delete from department where dept_no='d4'");

        //Table: employee
        //DB.insertSQL("Insert into employee(emp_no, emp_fname, emp_lname, dept_no) values(71411,'Bobbeh','Brown','d4')");
        //DB.deleteSQL("Delete from employee where emp_no=71411");

        //Table: project
        //DB.insertSQL("Insert into project(project_no, project_name, budget) values('p4', 'Aquarius', 69420)");
        //DB.deleteSQL("Delete from project where project_no = 'p4'");

        //Table: works
        //DB.insertSQL("Insert into works_on(emp_no, project_no, job, enter_date) values(71411, 'p4', 'dominatrix', '2019-12-24')");
        //DB.deleteSQL("Delete from works_on where emp_no = 71411");

        //DB.updateSQL("Update department set location='Austin' where dept_no='d1' or dept_no ='d3'");
        DB.updateSQL("Update department set location='Dallas' where dept_no='d1' or dept_no ='d3'");
    }
}
