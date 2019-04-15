package org.katheer.bean;

public class Employee {
    private String ename;
    private String eid;
    private String eaddr;
    private Account acc;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEaddr() {
        return eaddr;
    }

    public void setEaddr(String eaddr) {
        this.eaddr = eaddr;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    public void showEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("----------------------------------------------------");
        System.out.println("Employee Name   : " + this.getEname());
        System.out.println("Employee ID     : " + this.getEid());
        System.out.println("Employee Address: " + this.getEaddr());
        System.out.println("Account Details");
        System.out.println("----------------------------------------------------");
        System.out.println("Account No      : " + acc.getAccNo());
        System.out.println("Branch          : " + acc.getBank());
        System.out.println("Branch          : " + acc.getBranch());
        System.out.println("Balance         : " + acc.getBalance());
        System.out.println();
    }
}
