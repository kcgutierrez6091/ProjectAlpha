/***
 * Author: Kyara Cruz Gutierrez
 * Date: 10 December 2018
 * FILE: EmployeeInfo
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {
    private StringBuilder name;
    private String code;
    private Scanner in = new Scanner(System.in, "UTF-8");
    private String deptId;
    private Pattern p = Pattern.compile("^[A-Z][a-z]{3}[1-9]{2}$");


    EmployeeInfo() {
        setName();
        setDeptId();
    }

    StringBuilder getName() {
        return this.name;
    }

    private String getCode() {
        return this.code;
    }

    //The setName() called from the constructor
    //Also calls checkName

    private void setName() {
        StringBuilder testName = new StringBuilder(inputName());
        if (checkName(testName)) {
            this.name = testName;
            //System.out.println("Good name, creating employee code");
            createEmployeeCode(testName);
        } else {
            this.name = testName;
            //System.out.println("Invalid name, setting code to guest");
            this.code = "guest";
        }
    }

    //createEmployeeCode() first initial, last name  -> surname
    private void createEmployeeCode(StringBuilder name) {
        this.code = name.charAt(0) + name.substring(name.indexOf(" ") + 1);
    }

    private String inputName() {
        System.out.println("Please enter your first and last name:");
        return in.nextLine();
    }

    //check if the name has a space in it
    private boolean checkName(StringBuilder name) {
        if (name.indexOf(" ") > 0) {
            return (name.indexOf(" ", name.indexOf(" ") + 1) == -1);
        } else {
            return false;
        }
    }

    private String getDeptId() {
        System.out.println("Please enter your department ID:");
        return in.nextLine();
    }

    //setDeptId() will call getDeptId() to get id, then checks for validId()
    private void setDeptId() {
        String id = getDeptId();
        if (validId(id)) {
            this.deptId = id;
        } else {
            this.deptId = "None01";
        }


    }

    private String getId() {
        return this.deptId;
    }

    //matcher to test if id matches pattern
    private boolean validId(String id) {
        Matcher matcher = p.matcher(id);
        return matcher.matches();
    }

    private String reverseString(String id) {
        if (id.isEmpty()) {
            return id;
        } else {
            return reverseString(id.substring(1)) + id.charAt(0);
        }
    }

    @Override
    public String toString() {
        return "Employee Code: " + getCode() + "\n"
                + "Department Number: " + getId();
    }

}

